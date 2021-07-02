
/**
 * Write a description of class V2_2 here.
 *version 2.2 will have somethinmg u input
 * @author (bear)
 * @version (V2.1 16/6/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V2_2
{
    Random rand = new Random();
    int endgame = rand.nextInt(10);
    int roundnumber=0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int roundsanswers []= new int [24];
    int score=0;

    /**
     * Constructor for objects of class V2_2
     */
    public V2_2()
    {
        boolean start = false;
        Scanner Keybaord = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("PRISONER'S DILEMMA");
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
        System.out.println("    cop = coperate");
        System.out.println("    def = defecet");
        System.out.println("    end = end game");
        System.out.println("");
        System.out.println("                    DO COPRET OR DEFECET?");
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
        if (endgame<roundnumber){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score+" good job");
        }
      }
    }                 
  }



