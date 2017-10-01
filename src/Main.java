import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static String clone;
    public static void main(String[] args) {
        Make.make();
        Scanner keyboard = new Scanner(System.in);
        Opening.opening();
        while (true) {
            String req = keyboard.nextLine();
            clone = req;
            if (Objects.equals(req, "/help") || Objects.equals(req, "／help")) {
                Help.help();
            } else if (Objects.equals(req, "e")) {
                Excited.excited();
            } else if (Objects.equals(req, "r")) {
                Resources.resources();
            } else if (Objects.equals(req, "/语录") || Objects.equals(req, "／语录")) {
                Quotes.quotes();
            } else if (Objects.equals(req, "/三篇") || Objects.equals(req, "／三篇")) {
                Three.three();
            } else if (!Objects.equals(req, "/三篇") && !Objects.equals(req, "／三篇") &&
                    !Objects.equals(req, "/语录") && !Objects.equals(req, "／语录") &&
                    !Objects.equals(req, "r") && !Objects.equals(req, "e") &&
                    !Objects.equals(req, "/help") || !Objects.equals(req, "／help")) {
                Search.search();
            }
        }
    }
}