import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        if (number> 0) {
            number++;
        } else {
            number -= 2;
        }
        // тернарний варіант запису number = number>0?++number:number-2;
        System.out.println(number);
    }
}
