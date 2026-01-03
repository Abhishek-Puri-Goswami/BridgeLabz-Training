package com.linkedlists.singly.studentrecordmanagement;

public class StudentRecordManagement {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Ravi", 20, 'A');     // index 0
        list.addAtEnd(102, "Anita", 21, 'B');          // index 1
        list.addAtEnd(103, "Karan", 19, 'C');          // index 2

        list.addAtPosition(1, 104, "Meena", 22, 'A');  // insert at index 1

        System.out.println("All Student Records:");
        list.displayAll();

        System.out.println("Searching Roll No 102:");
        list.searchByRollNumber(102);
        System.out.println("----------------------------");
        
        System.out.println("Updating Grade for Roll No 103:");
        list.updateGrade(103, 'B');
        System.out.println("----------------------------");

        System.out.println("Deleting Roll No 101:");
        list.deleteByRollNumber(101);
        System.out.println("----------------------------");

        System.out.println("Final Student Records:");
        list.displayAll();
    }
}
