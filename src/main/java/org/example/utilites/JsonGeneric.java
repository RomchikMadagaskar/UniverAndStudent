package org.example.utilites;

import java.util.List;
import com.google.gson.GsonBuilder;

public class JsonGeneric {
    public static String collectionToJson(List<?> list){
        return new GsonBuilder().setPrettyPrinting().create().toJson(list);
    }
}
