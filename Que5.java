import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v;
        double a;
        double w;

        System.out.print("Enter the voltage: ");
        v = sc.nextDouble();
        System.out.print("Enter the current: ");
        a = sc.nextDouble();

        w = v*a;
        System.out.println("Power = " + w + " Watts");
    }
}