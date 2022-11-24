package p3;

public class main3 {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        boiler.fill();
        System.out.println();


        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();
    }
}

