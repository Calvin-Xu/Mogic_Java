import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Search {
    public static void search() {
        System.out.println("----------");
        System.out.println("你输入了: \"" + Main.clone + "\"\n");
        String result = Make.translations.get(Main.clone);
        if (result != null) {
            System.out.println("English: ");
            System.out.println(result + "\n");
        } else {
            try {
                Set<String> pool = Make.translations.keySet();
                ArrayList<String> relevant = new ArrayList<>();

                for (String entry : pool) {
                    if (entry.contains(Main.clone)) {
                        relevant.add(entry);
                    }
                }

                System.out.println("无\"" + Main.clone + "\"条目，请重新输入");
                System.out.println("你可能找的是\n\n\""
                        + relevant.get(1)
                        + "\" (按 1) \n\n或\n\n\""
                        + relevant.get(relevant.size() - 1)
                        + "\" (按 2)\n\n(原话如此, 两者都不是请按回车键 ←┘ ）");
                System.out.println("----------");
                Scanner keyboard = new Scanner(System.in);
                String fallback = keyboard.nextLine();
                if (Objects.equals(fallback, "1")) {
                    System.out.println(Make.translations.get(relevant.get(1)));
                } else if (Objects.equals(fallback, "2")) {
                    System.out.println(Make.translations.get(relevant.get(relevant.size() - 1)));
                }
                System.out.println("\n----------");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("模糊搜索无效，请重新输入，提供更多关键词。\n");
            }
        }

    }
}