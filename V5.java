
/**
 
/**
 * Write a description of class V5 here.
 *version 5 this version is has the frist atemped of stategys 
 * @author (bear)
 * @version (12/7/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V5{
    Random rand = new Random();
    int endgame = rand.nextInt(20);
    int roundnumber=0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int score=0;
    int aiscore=0;
    int aimove;
    int playercop=0;
    int playerdef=0;
    String roundsanswers []= new  String [25];
    int aioptin(){
        Random rand = new Random();
        return rand.nextInt(2);
    }
    
     

    /**
     * Constructor for objects of class V5
     */
    public V5()
    {
        boolean start = false;
        Scanner Keybaord = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("              PRISONEIR'S DILEMMA");
        System.out.println("                   by bear");
        System.out.println("");
        System.out.println("                    RULES ");
        System.out.println("   the prisener dilema is  a game wich two player in your case you and the ai competi in a ");
        System.out.println("   in your case you and the ai competi in a  ");
        System.out.println("         thet max rounds are below ");
        System.out.println("   rounds min= "+roundmin+"    max= "+roundmax);
        System.out.println("");
        System.out.println("");
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
        
        if (roundnumber<5){
            aimove=aioptin();
        }
        if (roundnumber>5&&playercop<playerdef){
            aimove=1;
           }
        if (roundnumber>5&&playercop>playerdef){
            aimove=0;
          }
        if (roundnumber>5&&playercop==playerdef){
            aimove=1;
           }
        System.out.println("                    ROUND "+roundnumber);
        System.out.println("               YOUR SCORE "+score);
        System.out.println("                 AI SCORE "+aiscore);
        System.out.println("");
        System.out.println("last round");
        System.out.println(roundsanswers[roundnumber]);
        System.out.println("comand list:");
        System.out.println("    cop = cooperate");
        System.out.println("    def = defect");
        System.out.println("    end = end game");
        System.out.println("");
        System.out.println("                    DO COOPERATE OR DEFECT?");
        Command=Keybaord.nextLine();
        //def = 1 cop =0
        if (Command.equals("def")&&aimove==0){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score+5;
            score=score-1;
            roundsanswers[roundnumber]="you defect and ai cooperate";
            playerdef=playerdef+1;
            //u def and ai cop so u win
        }
        if (Command.equals("def")&&aimove==1){
            System.out.println("def");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore-1;
            roundsanswers[roundnumber]="you defect and ai defect";
            playerdef=playerdef+1;
            //you both def so u tei
        }
        if (Command.equals("cop")&&aimove==0){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score+3;
            aiscore=aiscore+3;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;
            // you both cop 
        }
        if (Command.equals("cop")&&aimove==1){
            System.out.println("cop");
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore+5;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;
            //ai def and u cop
        }
        if (Command.equals("end")){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played: "+roundnumber);
            System.out.println("you ended the game ");
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