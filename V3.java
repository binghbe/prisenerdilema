/**
 
/**
 * Write a description of class V3 here.
 *version 3 a verison that i can do baisc testing and have all the comands but no startegy or past rounds
 * @author (bear)
 * @version (V3 18/6/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V3{
    Random rand = new Random();
    int endgame = rand.nextInt(20);
    int roundnumber=0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int roundsanswers []= new int [24];
    int score=0;
    int udef=1;
    int ucop=2;
    int aidef=4;
    int aicop=7;
    // if both cop =9 if both def =5 

    /**
     * Constructor for objects of class V3
     */
    public V3()
    {
        boolean start = false;
        Scanner Keybaord = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("PRISONEIR'S DILEMMA");
        System.out.println("    by bear");
        System.out.println("");
        System.out.println("type 'start' to start");  
        String Command;
        Command=Keybaord.nextLine();
              while(start==false){
       
        if (Command.equals("start")){
            start = true;
        } else {
           System.out.println('\u000c');
           System.out.println("type 'start' to start");
           Command=Keybaord.nextLine();
        }
      }
      while (start == true ){
        System.out.println('\u000c');
        System.out.println("                    ROUNDS "+roundnumber);
        System.out.println("                    SCORE "+score);
        System.out.println("");
        System.out.println("");
        System.out.println("rounds min= "+roundmin+"    max= "+roundmax);
        System.out.println("");
        System.out.println("past "+roundsplayed+ " rounds");
        System.out.println(roundsanswers);
        System.out.println("");
        System.out.println("comand list:");
        System.out.println("    cop = cooperate");
        System.out.println("    def = defect");
        System.out.println("    end = end game");
        System.out.println("    explain = explain the game and how its ment to work");
        System.out.println("");
        System.out.println("                    DO COOPERATE OR DEFECT?");
        Command=Keybaord.nextLine();
        if (Command.equals("def")){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score+5;
        }
        if (Command.equals("cop")){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score+1;
        }
        if (Command.equals("end")){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score+" good job");
        }
        if (endgame+5<roundnumber){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score+" good job");
        }
      }
      
    }                 
  }


