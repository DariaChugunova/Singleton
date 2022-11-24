public class Note {

    private Note(){

    }
    private  static Note uniqueInstance;
    private static String s = "";
    public static Note getInstance() {
        if (uniqueInstance == null) {

            System.out.println("Создаем новый файл");
            uniqueInstance = new Note();
        }
        else {
            System.out.println("Файл уже существует, открываем его");
        }
        return uniqueInstance;
    }

    public void write(String str){

        s+=str + "\n";
    }

    public void print(){
        System.out.println(s);
    }
}
