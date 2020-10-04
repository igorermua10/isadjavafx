package ehu.isad;
import java.net.*;
import java.io.*;
import com.google.gson.Gson;

public class URLReader {
    public static String URLlortu(String moneta) throws Exception {
        Gson gson = new Gson();
        URL monetaWebOrri = new URL("https://api.gdax.com/products/"+moneta+"-eur/ticker");
        URLConnection hasi = monetaWebOrri.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(monetaWebOrri.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        return inputLine;

    }
}