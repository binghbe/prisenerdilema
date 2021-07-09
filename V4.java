
/**
 
/**
 * Write a description of class V4 here.
 *version 4 this version is aim at having the past round data up and working and the next version 
 * @author (bear)
 * @version (4 7/7/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V4{
    Random rand = new Random();
    int endgame = rand.nextInt(20);
    int roundnumber=0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int score=0;
    int aiscore=0;
    int aimove;
    String roundsanswers []= new  String [25];
    int aioptin(){
        Random rand = new Random();
        return rand.nextInt(2);
    }
    
     

    /**
     * Constructor for objects of class V4
     */
    public V4()
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
        aimove=aioptin();
       
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
        System.out.println(aimove);
        Command=Keybaord.nextLine();
        //def = 1 cop =0
        if (Command.equals("def")&&aimove==0){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score+5;
            score=score-1;
            roundsanswers[roundnumber]="you defect and ai cooperate";
            //u def and ai cop so u win
        }
        if (Command.equals("def")&&aimove==1){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore-1;
            roundsanswers[roundnumber]="you defect and ai defect";
            //you both def so u tei
        }
        if (Command.equals("cop")&&aimove==0){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score+3;
            aiscore=aiscore+3;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            // you both cop 
        }
        if (Command.equals("cop")&&aimove==1){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore+5;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            //ai def and u cop
        }
        if (Command.equals("end")){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score+" good job");
        }
        if (endgame+5<roundnumber&&aiscore>score){
            start=false;
            System.out.println('\u000c');
            System.out.println("im sorry but you lost");
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score);
            System.out.println("the ai score was "+aiscore);
        }
        if (endgame+5<roundnumber&&aiscore<score){
            start=false;
            System.out.println('\u000c');
            System.out.println("you win good job!!");
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score was "+score);
            System.out.println("the ai score was "+aiscore);
        }
      }
      
    }                 
  }


