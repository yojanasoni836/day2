import java.util.Scanner;

public class Age{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
        scanner.close();
    }
}



