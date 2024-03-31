package java_8;


interface A {
    void show(int i);
}

public class DemoLamda {
    public static void main(String[] args) {
        A obj;
//        obj = new A(){ //Anonymous inner class
//            public void show(){
//                System.out.println("Hello");
//            }
//        };

//      this is the implementation of an interface
        obj = i -> System.out.println("Hello " + i);
//      this is how we write lamda expressions
//lamda expression remove lots of unnecessary boiler plate code as you can above

        obj.show(6);
    }
}
