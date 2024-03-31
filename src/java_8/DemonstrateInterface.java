package java_8;

public class DemonstrateInterface {
    public static void main(String[] args) {
        Phone p = new AndroidPhone();
        p.call();
        p.message();

        Phone.message1();
    }
}

interface Phone{
    void call();

//    defining method
    default void message(){
        System.out.println("sent");
    }
    static void message1(){
        System.out.println("static calling");
    }
}

class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("calling");
    }
}


