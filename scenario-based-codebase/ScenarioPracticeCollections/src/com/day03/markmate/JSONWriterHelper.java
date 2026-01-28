package com.day03.markmate;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONWriterHelper {
    // writes JSON output
    public void writeJSON(List<Student> students, String path) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter writer = new FileWriter(path);

        gson.toJson(students, writer);

        writer.flush();
        writer.close();
    }
}
