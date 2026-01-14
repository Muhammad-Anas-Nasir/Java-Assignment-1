import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dp;
        double discount;
        double op;

        System.out.print("Enter the discounted price: ");
        dp = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discount = sc.nextDouble();

        op = dp / (1 - discount / 100);
        System.out.println("Original the Price = " + op);
    }
}