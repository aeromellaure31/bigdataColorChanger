
package colorchanger;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class flower {

    BufferedImage image;
    int width;
    int height;

    public flower() {

        try {
            File input = new File("C:\\Users\\laureae_sd2082\\Documents/flower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    Color e = new Color(255, 255, 255);
                    Color d = new Color(0, 0, 0);
                    if (c.getRGB() == d.getRGB() || (c.getBlue() < 50 && c.getGreen() < 50 && c.getRed() < 50)) {
                        
                    } else {
                        image.setRGB(j, i, e.getRGB());
                    }
                }
            }

            File ouptut = new File("C:\\Users\\laureae_sd2082\\Documents/flower3.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
        }
    }
}
