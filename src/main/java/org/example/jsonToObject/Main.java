package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.jsonToObject.JsonObject;

import java.io.File;
import java.io.IOException;


// 1 уровень сложности: Файлы json из заданий ниже можно найти в дискорд в канале Вашей группы.
//№ 1 Конвертировать данные из Example2.json в объект.
//№ 2 Создать объект с 3-4 полями разных типов (в т.ч. ссылочных) и записать объект в файл в виде Json.
//№ 3 Прочитать значение поля age из файла Example1.json с помощью JsonPath https://mvnrepository.com/artifact/com.jayway.jsonpath/json-path
//Вывести результат в консоль.
//№ 4 Напишите код для скачивания пяти картинок c сайта https://doodles.google/
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