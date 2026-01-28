package com.day03.markmate;

import java.util.List;
import java.util.Scanner;

public class MarkMateApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter CSV file path: ");
        //String csvPath = input.nextLine(); 
        //System.out.print("Enter output JSON file path: ");
        //String jsonPath = input.nextLine();
        
        // Sample files paths
        String csvPath = "samplefiles/markmate/marks.csv";
        String jsonPath = "samplefiles/markmate/report.json";

        try {
            CSVReaderHelper reader = new CSVReaderHelper();
            List<Student> students = reader.readCSV(csvPath);

            JSONWriterHelper writer = new JSONWriterHelper();
            writer.writeJSON(students, jsonPath);
            System.out.println("Report card generated successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
