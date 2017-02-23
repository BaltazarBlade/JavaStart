import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите превое число ");
        int pervoe = scan.nextInt();
        System.out.println("Введите второе число ");
        int vtoroe = scan.nextInt();

        if (pervoe == vtoroe){
            pervoe = 0;
            vtoroe = 0;
            System.out.println(pervoe + " " + vtoroe);
        }
        else {
            pervoe = pervoe + vtoroe;
            vtoroe = pervoe;
            System.out.println(pervoe + " " + vtoroe);
        }
    }
}
