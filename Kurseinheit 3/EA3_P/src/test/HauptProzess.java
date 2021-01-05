package test;



import java.io.IOException;

class Philosoph extends Thread {
    protected String Name;
    protected Staebchen LinkeStaebchen;
    protected Staebchen RechteStaebchen;

    protected boolean isStopped = false;

    protected Philosoph (String Name, Staebchen linke, Staebchen rechte){
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

        }


    }


    protected long ZuffaeligeZeit(){
        long Zeit = (long) (Math.random()*20000);
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



class Staebchen {
    protected String Name;
    protected boolean besetzt;

    protected Staebchen (String Name, boolean besetzt) {
        this.Name = Name;
        this.besetzt = besetzt;
    }

    protected boolean istBesetzt(){
        return this.besetzt;
    };

    synchronized protected void staebchenNehmen(){
        if (!this.besetzt) {
            this.besetzt = true;
        } else {
            this.besetzt = false;
        }

    }

    protected void staebchenAblegen(){
        this.besetzt = false;
        //this.notifyAll();
    }

}



public class HauptProzess {
    public static void main(String[] args) {
        //System.out.println(Math.random()*3000);

        Staebchen Staebchen1 = new Staebchen("s1",false);
        Staebchen Staebchen2 = new Staebchen("s2",false);
        Staebchen Staebchen3 = new Staebchen("s3",false);
        Staebchen Staebchen4 = new Staebchen("s4",false);
        Staebchen Staebchen5 = new Staebchen("s5",false);

        Philosoph Philosoph1 = new Philosoph("Philosoph_1", Staebchen1, Staebchen2);
        Philosoph Philosoph2 = new Philosoph("Philosoph_2", Staebchen2, Staebchen3);
        Philosoph Philosoph3 = new Philosoph("Philosoph_3", Staebchen3, Staebchen4);
        Philosoph Philosoph4 = new Philosoph("Philosoph_4", Staebchen4, Staebchen5);
        Philosoph Philosoph5 = new Philosoph("Philosoph_5", Staebchen5, Staebchen1);

        Philosoph1.start() ;
        Philosoph2.start() ;
        Philosoph3.start() ;
        Philosoph4.start() ;
        Philosoph5.start() ;

        Philosoph1.dotry() ;
        Philosoph2.dotry() ;
        Philosoph3.dotry() ;
        Philosoph4.dotry() ;
        Philosoph5.dotry() ;

//        .dotry
//        .dotry
//        .dotry
    }
}

