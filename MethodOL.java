public class MethodOL {
    static void Method(){
        System.out.println("Non Parameter Method");
    }

    static void Method(int X){
        System.out.println("1 Parameter Method");
    }

    static void Method(int X, int Y){
        System.out.println("2 Parameter Method");
    }

    static void Method(char C){
        System.out.println("Character Parameter Method");
    }

    public static void main(String[] args){
        System.out.println("Main Method");
        Method();
        Method(1);
        Method(10,20);
        Method('c');
    }

}
