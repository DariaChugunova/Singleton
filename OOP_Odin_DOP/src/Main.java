import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Note note = Note.getInstance();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        note.write(s);
        note.print();

        Note note1 = Note.getInstance();
        String s1 = scanner.next();
        note.write(s1);
        note.print();
    }
}
