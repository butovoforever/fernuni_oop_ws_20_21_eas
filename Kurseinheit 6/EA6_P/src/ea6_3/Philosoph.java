package ea6_3;

import java.io.IOException;

public class Philosoph extends Thread {
    protected String Name;
    protected Staebchen LinkeStaebchen;
    protected Staebchen RechteStaebchen;

    protected boolean isStopped = false;

    public Philosoph (String Name, Staebchen linke, Staebchen rechte){
        this.Name = Name;
        this.LinkeStaebchen = linke;
        this.RechteStaebchen = rechte;
    }

    public void run() {
        while (!isStopped) {
            System.out.println(this.Name + " philosophiert.");
            try {
                Thread.sleep(ZuffaeligeZeit());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.Name + " ist jetzt hungrig.");

            while (this.LinkeStaebchen.besetzt & this.RechteStaebchen.besetzt) {
                this.LinkeStaebchen.staebchenNehmen();
                this.RechteStaebchen.staebchenNehmen();
                try {
                    Thread.sleep(ZuffaeligeZeit());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(this.Name + " hat Staebchen genommen.");
            System.out.println(this.Name + " isst jetzt.");

            try {
                Thread.sleep(ZuffaeligeZeit());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.Name + " ist mit Essen fertig.");

            this.LinkeStaebchen.staebchenAblegen();
            this.RechteStaebchen.staebchenAblegen();

            System.out.println(this.Name + " hat Staebchen abgelegt.");
            //this.notifyAll();

        }


    }


    protected long ZuffaeligeZeit(){
        long Zeit = (long) (Math.random()*3000);
        return Zeit;
    }

    void dotry() {
        try {
            System.in.read(); // Blockiert bis Zeile eingegeben
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.isStopped = true;
        System.out.println(this.Name + " Thread beendet!");
    }
}