package p3;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private  static ChocolateBoiler uniqueInstance;

    //код выполняется только при пустом нагревателе
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {

            System.out.println("Создаем экземпляр нагревателя");
            uniqueInstance = new ChocolateBoiler();
        }

        System.out.println("Экземпляр уже существует, возвращаем его");
        return uniqueInstance;
    }

    //перед наполнением проверяем, что нагреватель пуст
    //после наполнения устанавливаем флаги empty и boiled
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Нагреватель пуст, наполняем его");
        }
        else{
            System.out.println("нагреватель полон, ошибка");

        }
    }
    //чтобы слить содержимое, проверяем, что нагреватель не пуст,
    //а смесь доведена до кипения
    //После слива empty = true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Нагреватель не пуст, сливаем содержимое");

        }
        else{
            System.out.println("Нагреватель пуст, ошибка");
        }
    }

    //Чтобы вскипятить смесь .мы проверяем, что нагреватель полон, но не нагрет
    //После нагревания boiled = true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Нагреватель полон и не нагрет, нагреваем его");
        }
        else {
            System.out.println("Либо нагреватель пустой, либо уже нагрет, ошибка");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
