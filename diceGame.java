import java.util.Random;
import java.util.Scanner;


public class diceGame{
    private int max = 6;
    private int min = 1;
    private String name;
    public int rollDice(){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }
    public static void main(String[] args){
        diceGame dg = new diceGame();
        Scanner sc = new Scanner(System.in);
            try{
                System.out.println("What is your name?");
                dg.name = sc.nextLine();
                System.out.println("Hello, "+dg.name);
            }
            catch(Exception e){
                System.out.println("Wrong input!");
            }
        
        int dieOne = dg.rollDice();
        int dieTwo = dg.rollDice();
        int sum = dieOne+dieTwo;
        System.out.println("Rolling dice...");
        System.out.println("Die 1 : "+dieOne);
        System.out.println("Die 2 : "+dieTwo);
        System.out.println("Total Value: "+sum);
        if (sum>7){
            System.out.println(dg.name + " Won!");
        }
        else System.out.println(dg.name+" Lost!");
    }
}