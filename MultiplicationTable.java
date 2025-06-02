import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Table();
    }

    public static void Table() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print table: ");
        a = sc.nextInt();
        System.out.print("Enter the number upto which table will be printed: ");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
