package org.example.writeAgeFromJson;

import com.jayway.jsonpath.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

////№ 3 Прочитать значение поля age из файла Example1.json с помощью
// JsonPath https://mvnrepository.com/artifact/com.jayway.jsonpath/json-path
//Вывести результат в консоль.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new LinkedHashMap<>();
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get("Example1.json")));
            List<String> nameFields = JsonPath.read(jsonContent, "$..firstName");
            List<Integer> ageFields = JsonPath.read(jsonContent, "$..age");
            int maxSize = Math.max(nameFields.size(), ageFields.size());
            for (int i = 0; i < maxSize; i++) {
                nameToAge.put(nameFields.get(i), ageFields.get(i));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Имена и возрасты друзей: " + nameToAge);
    }

}
