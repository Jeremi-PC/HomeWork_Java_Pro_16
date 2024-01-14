package org.example.objectToJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.example.objectToJson.objJsonClasses.Person;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

//№ 2 Создать объект с 3-4 полями разных типов (в т.ч. ссылочных) и записать объект в файл в виде Json.
public class Main {
    public static void main(String[] args) {
        Person.Address[] addresses = {
                new Person.Address(72728, "12 Avenue", 22),
                new Person.Address(78254, "Bruce str", 25),
        };
        Person person = new Person("John", "Doe", LocalDate.parse("1970-12-01"), addresses);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            objectMapper.writeValue(new File("person.json"), person);
            System.out.println("Object successfully written to file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       // System.out.println(person);
    }
}
