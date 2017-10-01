import java.util.Objects;
import java.util.Scanner;

public class Three {
    public static void three() {
        System.out.println("\n\n视察二院，请按 1\n怒斥记者，请按 2\n谈笑风生，请按 3\n");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        if (Objects.equals(choice, "1")) {
            System.out.println("----------加载中...视察二院----------\n");
            for (String oneline : Make.SHEY) {
                System.out.println(oneline + "\n");
                Pause.pause(0.5);
            }
        } else if (Objects.equals(choice, "2")) {
            System.out.println("----------加载中...怒斥记者----------\n");
            for (String oneline : Make.NCJZ) {
                System.out.println(oneline + "\n");
                Pause.pause(1);
            }
        } else if (Objects.equals(choice, "3")) {
            System.out.println("----------加载中...谈笑风生----------\n");
            for (String oneline : Make.TXFS) {
                System.out.println(oneline + "\n");
                Pause.pause(0.5);
            }
        }
    }
}
