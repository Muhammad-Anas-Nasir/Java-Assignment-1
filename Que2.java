import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double area;
        double circum;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        circum = 2 * 3.14 * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circum);
    }
}
