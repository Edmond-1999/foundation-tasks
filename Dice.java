import java.util.Random;
public class Dice{
public static void main(String[]args){
Random random = new Random();

int firstDie = random.nextInt(6) + 1;

int secondDie = random.nextInt(6) + 1;

int diceRoll = firstDie + secondDie;

System.out.println("The first die: " + firstDie);
System.out.println("The second die: " + secondDie);
System.out.println("The total dice roll is " + diceRoll);
}
}
