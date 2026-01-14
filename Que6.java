import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double h;
        double ar;

        System.out.print("Enter the length of parallel side a: ");
        a = sc.nextDouble();
        System.out.print("Enter the lenght of parallel side b: ");
        b = sc.nextDouble();
        System.out.print("Enter the height between the sides: ");
        h = sc.nextDouble();

        ar = h * (a + b) / 2;
        System.out.println("Area = " + ar);
    }
}