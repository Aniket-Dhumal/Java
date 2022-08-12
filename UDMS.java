public class UDMS {
    static void UDM1(){
        System.out.println("UDM1");
        UDM2();

    }

    static void UDM2(){
        System.out.println("UDM2");
        UDM3();
        
    }

    static void UDM3(){
        System.out.println("UDM3");
        
    }
    public static void main(String[] args){
        System.out.println("Main Method");
        UDM1();
    }

}
