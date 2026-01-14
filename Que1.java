import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double obt;
        double total;
        double per;

        System.out.print("Enter ypur obtained marks: ");
        obt = sc.nextDouble();
        System.out.print("Enter the total marks: ");
        total = sc.nextDouble();

        per = (obt / total) * 100;
        System.out.println("Percentage = " + per);
    }
}
