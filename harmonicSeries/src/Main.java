import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");
        double n = scanner.nextDouble();
        double result = 0;

        for(double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.print(result);


    }
}
