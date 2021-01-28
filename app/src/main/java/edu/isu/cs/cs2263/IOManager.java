package edu.isu.cs.cs2263;

import java.nio.file.Files;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOManager {

    public static List<Student> readData(String fileName){
        String json = "";
        try{
            json = Files.readString(Paths.get(fileName + ".json"));
        } catch(IOException ex){
            ex.printStackTrace();
        }

        // There is a bug with reading back in nested list

        Gson gson = new Gson();
        Type listStudent = new TypeToken<List<Student>>() {}.getType();
        List<Student> studentData = gson.fromJson(json, listStudent);

        return studentData;
    }

    public static void writeData(String file, List<Student> data){
        Gson gson = new Gson();
        String jsonOut = gson.toJson(data);

        try {
            Files.writeString(Paths.get(file + ".json"), jsonOut);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
