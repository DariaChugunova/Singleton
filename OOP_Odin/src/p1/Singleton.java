package p1;
//классическая реализация патерна Одиночка
public class Singleton {
    //переменная для хранение единственного экземпляра
    private static Singleton uniqueInstance;
    // Другие письменные экземпляры
    private Singleton() {}//приватный конструктор
    //метод создает и возвращает экземпляры

    public static  Singleton getInstance() {
        //uniqueInstance сод единственный экземпляр
        if (uniqueInstance == null) {//если null, то экземпляр еще не создан
           //создаем экзепляр приватным конструктором
            uniqueInstance = new Singleton();
        }
        //возвращаем экземпляр
        return uniqueInstance;
    }
// Другие методы
}

