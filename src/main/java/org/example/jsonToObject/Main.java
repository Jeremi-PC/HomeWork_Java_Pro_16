package org.example.jsonToObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.jsonToObject.jsonObjClasses.JsonObject;

import java.io.File;
import java.io.IOException;


// 1 уровень сложности: Файлы json из заданий ниже можно найти в дискорд в канале Вашей группы.
//№ 1 Конвертировать данные из Example2.json в объект.



public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonObject object = objectMapper.readValue(new File("Example2.json"), JsonObject.class);
            System.out.println(object.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}