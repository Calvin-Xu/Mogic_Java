import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class Resources {
    public static void resources() {
        System.out.println("\n\n----------");
        System.out.println("长者 Wikipedia 词条: https://en.wikipedia.org/wiki/Jiang_Zemin");
        Pause.pause(0.5);
        System.out.println("\n长者 Wikiquote 词条: https://zh.wikiquote.org/wiki/%E6%B1%9F%E6%B3%BD%E6%B0%91");
        Pause.pause(0.5);
        System.out.println("\nNFLS水上运动讨论群 ID: 527623612");
        Pause.pause(0.5);
        System.out.println("----------");
        System.out.println("\nOpen pages? y/n");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        if (Objects.equals(answer, "y")) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Jiang_Zemin"));
                    Desktop.getDesktop().browse(new URI("https://zh.wikiquote.org/wiki/%E6%B1%9F%E6%B3%BD%E6%B0%91"));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
