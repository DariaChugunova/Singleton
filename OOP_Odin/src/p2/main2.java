package p2;

public class main2 {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
       chocolateBoiler.fill(); // наполняем
       chocolateBoiler.boil();//кипячение смеси
       chocolateBoiler.drain();//слив содержимого
        chocolateBoiler.fill(); // наполняем
        chocolateBoiler.boil();//кипячение смеси

        System.out.println();
        ChocolateBoiler chocolateBoiler2 = new ChocolateBoiler();
        chocolateBoiler2.fill(); // наполняем
        chocolateBoiler2.boil();//кипячение смеси
        chocolateBoiler2.drain();//слив содержимого


    }
}
