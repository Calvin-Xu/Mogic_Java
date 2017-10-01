public class Quotes {
    public static void quotes() {
        int limit = Make.array_quote.size() - 2;
        System.out.println("\n\n----------");
        System.out.println("长者 (前国家领导人江泽民) 语录 (中英对照):\n");
        for (int i = 0; i <= limit; i+=2) {
            String chn = Make.array_quote.get(i);
            String eng = Make.array_quote.get(i + 1);
            System.out.println(chn);
            System.out.println(eng + "\n");
            Pause.pause(0.3);
        }
        System.out.println("----------\n\n");
    }
}
