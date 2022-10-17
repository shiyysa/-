package softwarearchitecture.user;


import java.awt.*;
import java.io.File;
import java.io.IOException;

public class use {
    public static void openExplorer(String htmlFile) {
        if (java.awt.Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().open(new File(htmlFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        openExplorer("E:\\idea java\\idea practice\\src\\softwarearchitecture\\user\\z.html");
    }
}
