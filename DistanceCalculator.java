import java.util.Scanner;

public class DistanceCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter Velocity: ");
double u = input.nextDouble();

System.out.print("Enter Time: ");
double t = input.nextDouble();

System.out.print("Enter Acceleration: ");
double a = input.nextDouble();

double distance = (u * t) + (0.5 * a * t * t);

System.out.println("The distance covered is " + distance);
}
}
