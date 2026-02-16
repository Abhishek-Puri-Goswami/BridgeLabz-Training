package com.dbmsjdbc.jdbc.librarymgmt;

import java.sql.*;

public class LibraryDAO {

    // Created tables and added sample data (if already exist dropped)
    public void recreateTables() {

        String dropBorrow = "DROP TABLE IF EXISTS borrow_record";
        String dropStudent = "DROP TABLE IF EXISTS student";
        String dropBook = "DROP TABLE IF EXISTS book";

        String createBook = "CREATE TABLE book (" +
                "book_id INT PRIMARY KEY AUTO_INCREMENT," +
                "title VARCHAR(80) NOT NULL," +
                "author VARCHAR(60)," +
                "genre VARCHAR(40)," +
                "copies_available INT NOT NULL" +
                ")";

        String createStudent = "CREATE TABLE student (" +
                "student_id INT PRIMARY KEY AUTO_INCREMENT," +
                "student_name VARCHAR(60) NOT NULL" +
                ")";

        String createBorrow = "CREATE TABLE borrow_record (" +
                "borrow_id INT PRIMARY KEY AUTO_INCREMENT," +
                "student_id INT," +
                "book_id INT," +
                "borrow_date DATE," +
                "return_date DATE," +
                "fine_amount DECIMAL(8,2)," +
                "FOREIGN KEY (student_id) REFERENCES student(student_id)," +
                "FOREIGN KEY (book_id) REFERENCES book(book_id)" +
                ")";

        String insertBooks = "INSERT INTO book (title, author, genre, copies_available) VALUES " +
                "('Attack on Titans','Hajime Isayama','Action',5)," +
                "('One Piece Voyage','Eiichiro Oda','Adventure',4)," +
                "('Dragon Warrior Saga','Akira Toriyama','Fantasy',6)," +
                "('Hidden Leaf Chronicles','Masashi Kishimoto','Action',3)";

        String insertStudents = "INSERT INTO student (student_name) VALUES " +
                "('Naruto Uzumaki')," +
                "('Monkey D Luffy')," +
                "('Goku Son')," +
                "('Levi Ackerman')";

        try (Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement()) {

            stmt.execute(dropBorrow);
            stmt.execute(dropStudent);
            stmt.execute(dropBook);

            stmt.execute(createBook);
            stmt.execute(createStudent);
            stmt.execute(createBorrow);

            stmt.executeUpdate(insertBooks);
            stmt.executeUpdate(insertStudents);

            System.out.println("Library tables recreated with sample data");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // BORROW BOOK (Transaction)
    public void borrowBook(int studentId, int bookId, Date borrowDate, Date returnDate) {

        String checkSql = "UPDATE book SET copies_available = copies_available - 1 " +
                "WHERE book_id = ? AND copies_available > 0";

        String insertBorrow = "INSERT INTO borrow_record(student_id,book_id,borrow_date,return_date,fine_amount) " +
                "VALUES(?,?,?,?,0)";

        try (Connection conn = DBConnection.getConnection()) {

            conn.setAutoCommit(false);

            PreparedStatement checkPs = conn.prepareStatement(checkSql);

            checkPs.setInt(1, bookId);
            int rows = checkPs.executeUpdate();

            if (rows == 0) {
                conn.rollback();
                System.out.println("No copies available");
                return;
            }

            PreparedStatement borrowPs = conn.prepareStatement(insertBorrow);

            borrowPs.setInt(1, studentId);
            borrowPs.setInt(2, bookId);
            borrowPs.setDate(3, borrowDate);
            borrowPs.setDate(4, returnDate);
            borrowPs.executeUpdate();

            conn.commit();
            System.out.println("Book borrowed successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // FINE CALCULATION
    public void calculateFine(int borrowId) {

        String sql = "UPDATE borrow_record SET fine_amount = " +
                "CASE WHEN DATEDIFF(return_date, borrow_date) > 7 " +
                "THEN (DATEDIFF(return_date, borrow_date) - 7) * 10 " +
                "ELSE 0 END " +
                "WHERE borrow_id = ?";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, borrowId);
            ps.executeUpdate();
            System.out.println("Fine calculated (Rs.10/day after 7 days)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SEARCH MULTIPLE FILTERS
    public void searchBooks(String genre, String authorKeyword) {

        String sql = "SELECT * FROM book WHERE genre=? AND author LIKE ?";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, genre);
            ps.setString(2, "%" + authorKeyword + "%");

            ResultSet rs = ps.executeQuery();

            System.out.printf(
                    "%-5s %-25s %-20s %-10s %-5s%n",
                    "ID", "Title", "Author", "Genre", "Qty");

            while (rs.next()) {

                System.out.printf(
                        "%-5d %-25s %-20s %-10s %-5d%n",
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre"),
                        rs.getInt("copies_available"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SEARCH AVAILABLE BOOKS
    public void searchAvailableBooks() {

        String sql = "SELECT title, author, genre, copies_available FROM book WHERE copies_available > 0";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.printf(
                    "| %-30s | %-8s |%n",
                    "Title",
                    "Qty");

            while (rs.next()) {

        	System.out.printf(
        		"| %-30s | %-8s |%n",
                        rs.getString("title"),
                        rs.getInt("copies_available"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 // PRINT ALL BOOKS
    public void printAllBooks() {

        String sql = "SELECT * FROM book";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n------ BOOK TABLE ------");

            System.out.printf(
                    "%-5s %-25s %-20s %-12s %-5s%n",
                    "ID","Title","Author","Genre","Qty");

            while (rs.next()) {

                System.out.printf(
                        "%-5d %-25s %-20s %-12s %-5d%n",
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre"),
                        rs.getInt("copies_available"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 // PRINT ALL STUDENTS
    public void printAllStudents() {

        String sql = "SELECT * FROM student";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n------ STUDENT TABLE ------");

            System.out.printf(
                    "%-5s %-25s%n",
                    "ID","Name");

            while (rs.next()) {

                System.out.printf(
                        "%-5d %-25s%n",
                        rs.getInt("student_id"),
                        rs.getString("student_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 // PRINT BORROW RECORDS
    public void printBorrowRecords() {

        String sql = "SELECT * FROM borrow_record";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n------ BORROW RECORD TABLE ------");

            System.out.printf(
                    "%-5s %-8s %-8s %-12s %-12s %-8s%n",
                    "ID","StuID","BookID","BorrowDate","ReturnDate","Fine");

            while (rs.next()) {

                System.out.printf(
                        "%-5d %-8d %-8d %-12s %-12s %-8.2f%n",
                        rs.getInt("borrow_id"),
                        rs.getInt("student_id"),
                        rs.getInt("book_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("return_date"),
                        rs.getDouble("fine_amount"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
