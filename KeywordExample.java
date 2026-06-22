import java.util.Scanner;

public class KeywordExample {

    static final String COLLEGE = "ABC College";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        try {
            int result = 10 / 2;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Program Finished");
        }

        sc.close();
    }
}