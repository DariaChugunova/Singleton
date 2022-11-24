package p2;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    //код выполняется только при пустом нагревателе
    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    //перед наполнением проверяем, что нагреватель пуст
    //после наполнения устанавливаем флаги empty и boiled
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Заполнение нагревателя молочно-шоколадной смесью
            System.out.println("Нагреватель пуст, наполняем его");
        }
        else {
            System.out.println("нагреватель полон, ошибка");
        }
    }

    //чтобы слить содержимое, проверяем, что нагреватель не пуст,
    //а смесь доведена до кипения
    //После слива empty = true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
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
    // Довести содержимое до кипения
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