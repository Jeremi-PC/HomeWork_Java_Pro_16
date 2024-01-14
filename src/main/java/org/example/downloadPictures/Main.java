package org.example.downloadPictures;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

//№ 4 Напишите код для скачивания пяти картинок c сайта https://doodles.google/
public class Main {
    public static void main(String[] args) {
        String[] goalImages = {
                "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png",
                "https://www.google.com/logos/doodles/2023/sedad-hakk-eldems-115th-birthday-6753651837109993-2x.png",
                "https://www.google.com/logos/doodles/2023/venu-chitales-111st-birthday-6753651837110101.3-2x.png",
                "https://www.google.com/logos/doodles/2023/cassia-ellers-61st-birthday-6753651837110100-2x.png",
                "https://www.google.com/logos/doodles/2023/celebrating-ahmed-the-elephant-6753651837109982-2x.png"
        };

        for (int i = 0; i < goalImages.length; i++) {
            String goalImage = goalImages[i];
            Path outputPath = Path.of("logo" + (i + 1) + ".png");
            downloadPicture(goalImage, outputPath);
        }

    }

    public static void downloadPicture(String path, Path outputPath) {
        try {
            URL url = new URL(path);
            InputStream stream = url.openStream();
            Files.copy(stream, outputPath);
            System.out.println("Pictures successfully downloaded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
