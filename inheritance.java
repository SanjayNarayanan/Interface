package oppsclanandobj;

public class inheritance {
    int application= 4;
     public static  void coll(){
        System.out.println("it is a inhertiance");

     }
     public static void bank(){
        System.out.println("it is a bank");
     }
    
}

class heritance extends inheritance{
    // int status=5;
    // public static void method(){
    //     System.out.println("it is inhertiance");
    // }
    // public static void bank(){
    //     System.out.println("it is bank");
    // }
    boolean type=true;

}


    class call{
        public static void main(String[] args) {
            heritance obj = new heritance();
            System.out.println(obj.application);
            System.out.println(obj.type);
            obj.coll();
            obj.bank();
           

        }
    }
