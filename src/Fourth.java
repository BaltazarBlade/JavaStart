import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int chislo = scan.nextInt();

        if (chislo > 100){
            System.out.println("Трёхзначное число");
        } else if (chislo > 10){
            System.out.println("Двухначное число");
        } else
            System.out.println("Однозначное число");
    }
}
