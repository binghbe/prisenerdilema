/**
 
/**
 * Write a description of class V3_1 here.
 *version 3_1 a verison that i can do baisc testing and have all the comands but no startegy or past rounds
 * @author (bear)
 * @version (V3_1 30/6/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V3_1{
    Random rand = new Random();
    int endgame = rand.nextInt(20);
    int roundnumber=0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int roundsanswers []= new int [24];
    int score=0;
    int aiscore=0;
    

    /**
     * Constructor for objects of class V3_1
     */
    public V3_1()
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
        Random rand = new Random();
        int pcoptin= rand.nextInt(2);
        System.out.println("                    ROUNDS "+roundnumber);
        System.out.println("                    SCORE "+score);
        System.out.println("                    SCORE "+aiscore);
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
        System.out.println(pcoptin);
        Command=Keybaord.nextLine();
        //def = 1 cop =0
        if (Command.equals("def")&&pcoptin==0){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score+5;
            score=score-1;
            //u def and ai cop
        }
        if (Command.equals("def")&&pcoptin==1){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore-1;
            //you both def
        }
        if (Command.equals("cop")&&pcoptin==0){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score+3;
            aiscore=aiscore+3;
            // you both cop
        }
        if (Command.equals("cop")&&pcoptin==1){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore+5;
            //ai def and u cop
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


