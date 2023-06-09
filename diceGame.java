import java.util.Random;
import java.util.Scanner;


public class diceGame{
    private int max = 6;
    private int min = 1;
    public int rollDice(){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("What is your name?");
            String name = sc.nextLine();
            System.out.println("Hello, "+name);
        }
        catch(Exception e){
            System.out.println("Wrong input!");
        }

        diceGame dg = new diceGame();
        int dieOne = dg.rollDice();
        int dieTwo = dg.rollDice();
        System.out.println("Rolling dice...");
        System.out.println("Die 1 : "+dieOne);
        System.out.println("Die 2 : "+dieTwo);
        System.out.println("Total Value: "+(dieOne+dieTwo));
    }
}