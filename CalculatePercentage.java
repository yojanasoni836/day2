import java.util.Scanner;
public class CalculatePercentage{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of 6 subject(out of 100):");
        System.out.print("Subject 1:");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2:");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3");
        int subject3 = scanner.nextInt();
        System.out.print("Subject 4:");
        int subject4 = scanner.nextInt();
        System.out.print("Subject 5:");
        int subject5 = scanner.nextInt();
        System.out.print("Subject 6:");
        int subject6 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
        double Percentage = (totalMarks/600)*100;
        System.out.println("Total Marks:"+ totalMarks);
        System.out.println("Percentage:"+String.format("%2f",Percentage)+"%");
        scanner.close();

    }
}