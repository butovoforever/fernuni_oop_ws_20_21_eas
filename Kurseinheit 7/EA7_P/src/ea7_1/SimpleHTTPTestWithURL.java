package ea7_1;

import java.io.*;
import java.net.*;
public class SimpleHTTPTestWithURL {
    public static void main(String[] args) throws IOException {
        String address = "http://www.fernuni-hagen.de/ps/lehrveranstaltungen/k01618/";
        URL url = new URL(address);
        InputStream is = (InputStream) url.getContent();
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = fromServer.readLine()) != null) {
            System.out.println(line);
        }
        fromServer.close();
    }
}
