package ea6_1;

//Ich gebe hier 2 Varianten von "Warum" ein:

//public class Warum {
//    public static void main(String[] argv) {
//        Test t = new Test();
//        t.start();
//        t.dotry();
//        //t.stop();
//        t.stopThread();
//    }
//}

public class Warum {
    public static void main(String[] argv) throws InterruptedException {
        Test t = new Test();
        t.start();
        Thread.sleep(10000);
        t.stopThread();
        t.dotry();
        //t.stop();
    }
}
