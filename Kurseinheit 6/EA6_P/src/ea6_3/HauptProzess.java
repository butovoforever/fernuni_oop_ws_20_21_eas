package ea6_3;

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
