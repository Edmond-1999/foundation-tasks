import java.util.Scanner;

public class InterestCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter current balance: ");
double balance = input.nextDouble();

System.out.print("Enter interest rate: ");
double interestRate = input.nextDouble();

double interest = balance * (interestRate / 1200);

System.out.println("The interest is " + interest);
}
}
