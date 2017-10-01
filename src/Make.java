import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;

public class Make {
    public static Map<String, String> translations = new HashMap<>();
    public static ArrayList<String> array_quote = new ArrayList<>();
    public static ArrayList<String> SHEY = new ArrayList<>();
    public static ArrayList<String> NCJZ = new ArrayList<>();
    public static ArrayList<String> TXFS = new ArrayList<>();

    public static void download(String usr_url, ArrayList target) {
        try {
            URL url = new URL(usr_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            InputStreamReader raw = new InputStreamReader(conn.getInputStream(), "utf-8");
            BufferedReader bufRead = new BufferedReader(raw);
            String line;
            while ((line = bufRead.readLine()) != null) {
                target.add(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void make() {
        download("https://raw.githubusercontent.com/Calvin-Xu/Mogic/master/quotes_utf-8.txt", array_quote);

        int limit = array_quote.size() - 2;
        for (int i = 0; i <= limit; i++) {
            String chn = array_quote.get(i);
            String eng = array_quote.get(i + 1);
            translations.put(chn, eng);
        }
        download("https://raw.githubusercontent.com/Calvin-Xu/Mogic/master/quote1.txt", SHEY);
        download("https://raw.githubusercontent.com/Calvin-Xu/Mogic/master/quote2.txt", NCJZ);
        download("https://raw.githubusercontent.com/Calvin-Xu/Mogic/master/quote3.txt", TXFS);
    }
}

