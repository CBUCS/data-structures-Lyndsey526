import java.util.Scanner;

public class Chuckle
{
    private Die firstDie, secondDie;
    private Scanner input;
    private boolean obtainedSum[];
    private int numTurns;

    public Chuckle()
    {
        firstDie = new Die();
        secondDie = new Die();
        input = new Scanner(System.in);
        obtainedSum = new boolean[12];
    }

    public void play()
    {
        numTurns = 0;
        while(!isFinished())
            playOneRound();
        System.out.println("Score: " + numTurns);
    }

    public void playOneRound()
    {
        firstDie.roll();
        secondDie.roll();

        printDie();

        if(askShouldRoll(1))
            firstDie.roll();
        if(askShouldRoll(2))
            secondDie.roll();

        int sum = firstDie.getValue() + secondDie.getValue();
        System.out.println();
        printDie();
        System.out.println("Sum is: " + sum + "\n");
        obtainedSum[sum - 1] = true;

        numTurns++;
    }

    public void printDie()
    {
        System.out.println("Dice: " + firstDie.getValue() + " " + secondDie.getValue());
    }

    public boolean isFinished()
    {
        for(int i = 1; i < obtainedSum.length; i++)
            if(obtainedSum[i] == false)
                return false;
        return true;
    }

    public boolean askShouldRoll(int dieNo)
    {
        String choice;
        do
        {
            System.out.print("Do you want to roll die " + dieNo + ": ");
            choice = input.nextLine().toUpperCase();
        } while(!choice.equals("Y") && !choice.equals("N"));
        return choice.equals("Y");
    }

    public static void main(String[] args)
    {
        Chuckle game = new Chuckle();
        game.play();
    }
}
