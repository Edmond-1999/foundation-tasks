import java.util.Scanner;

public class Eggs {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("How many eggs do you have? ");
int eggs = input.nextInt();

if (eggs > 500) {
int gross = eggs / 144;
int leftoverAfterGross = eggs % 144;

int dozen = leftoverAfterGross / 12;
int leftoverAfterDozen = leftoverAfterGross % 12;

System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen and " + leftoverAfterDozen + " eggs left over.");
} 
else {
int dozen = eggs / 12;
int leftover = eggs % 12;

System.out.println("You have " + dozen + " dozen and " + leftover + " eggs left over.");
}
}
}
