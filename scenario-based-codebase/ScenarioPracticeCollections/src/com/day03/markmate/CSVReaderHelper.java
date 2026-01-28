package com.day03.markmate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderHelper {
    // reads CSV file
	public List<Student> readCSV(String path) throws Exception {
        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String header = br.readLine();

        if (header == null) {
            br.close();
            throw new Exception("CSV file is empty.");
        }

        String[] columns = header.split(",");
        int subjectCount = columns.length - 1;

        String line;

        // loop for reading rows
        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");
            String name = parts[0];
            int[] arr = new int[subjectCount];

            for (int i = 0; i < subjectCount; i++) {
                int value = Integer.parseInt(parts[i + 1]);

                if (value < 0 || value > 100) {
                	br.close();
                    throw new InvalidMarkException("Invalid marks for student: " + name);
                }
                arr[i] = value;
            }
            students.add(new Student(name, arr));
        }
        br.close();

        return students;
    }
}
