import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        double discount;
        double fp;

        System.out.print("Enter the original price: ");
        price = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discount = sc.nextDouble();

        fp = price - (price * discount / 100);
        System.out.println("Discounted Final Price = " + fp);
    }
}