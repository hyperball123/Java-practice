package java_8;

public class LamdasDemo {
    public static void show(){
        greet(new ConsolePrinter());
    }
    public static void greet(Printer printer) {
        printer.print("hello world");
    }

    public static void main(String[] args) {
        Printer p = new ConsolePrinter();


    }
}
