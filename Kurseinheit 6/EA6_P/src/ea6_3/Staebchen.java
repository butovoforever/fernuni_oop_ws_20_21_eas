package ea6_3;

public class Staebchen {
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
        this.notifyAll();
    }

}
