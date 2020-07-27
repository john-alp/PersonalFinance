package personalfinance;

import personalfinance.settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class PersonalFinance {
    public static void main (String[] args) {
        init();
      //  System.out.println(Text.get("PROGRAMM_NAME"));
      //  System.out.println(Arrays.toString(Text.getMonths()));
    }
    private static void init() {

        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Light.ttf")));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
