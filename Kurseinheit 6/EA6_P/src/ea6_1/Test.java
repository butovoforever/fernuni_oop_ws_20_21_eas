package ea6_1;

import java.io.IOException;

//public class Warum {
//    public static void main(String[] argv) {
//        Test t = new Test();
//        t.start();
//        t.dotry();
//        //t.stop();
//        t.stopThread();
//    }
//}

public class Test extends Thread {

    boolean isStopped = false;

    @Override
    public void run() {
        //while (true) {
        while (!isStopped) {
            System.out.println("Hallo, ich komme.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Sollte nicht geschehen, zur Sicherheit Ausgabemeldung
                System.out.println("Beim Schlafen unterbrochen");
            }
        }
    }

    // Zum Beenden Enter-Taste druecken
    void dotry() {
        try {
            System.in.read(); // Blockiert bis Zeile eingegeben
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ich gehe. Auf Wiedersehen!");
    }

    //So stoppen wir Thread echt;
    void stopThread(){
        this.isStopped = true;
        System.out.println("Thread ist echt beendet!");
    }

}