package ea7_2;

import java.io.*;
import java.net.*;
public class Kommunikation {
    public final static int SERVER_PORT = 7896;
    private static Object Respone;
    boolean istUm = false;
    public static void main(String[] args) throws IOException {
        boolean istUm = false;
// Try-with-ressources-Anweisung
        try (
                Socket sock = new Socket("mpaap.mooo.com", SERVER_PORT);
//                BufferedOutputStream toFile = new BufferedOutputStream(
//                        new FileOutputStream(fileNameAtClient));
                ) {
// Öffnen des Ausgabestroms zum Server und Schreiben des Kommandos
            while (!istUm) {

                URL url = new URL("mpaap.mooo.com");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");

//                BufferedWriter toServer = new BufferedWriter(
//                        new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));
//                String command = "GET " + fileNameAtServer;
//                toServer.write(command + "\n");
//                toServer.flush();
// Öffnen des Eingabestroms zum Server
                BufferedInputStream fromServer = new BufferedInputStream(
                        sock.getInputStream());
                String [] Respone = fromServer.read().split(" ");
// Üertragen der Datei
                int data = -1;
                while ((data = fromServer.read()) != -1) {
                    toFile.write(data);
                }
                toFile.flush();
            } catch(FileNotFoundException e){
                System.out.println();
                System.out.println("Datei kann nicht geschrieben werden: " + e.getMessage());
            } catch(IOException e){
                System.out.println(e);
            }
        }
        }
}
