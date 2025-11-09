import java.util.Scanner;

public class TimeConverter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
long minutes = input.nextLong();

long totalDays = minutes / (60 * 24);

long years = totalDays / 365;
long days = totalDays % 365;

System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
}
}
