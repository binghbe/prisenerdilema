
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
    int endgame = rand.nextInt(20);//this gives the number for the end of the game
    int roundnumber=0;//curnet round number
    int roundsplayed=0;//total rounds played
    int roundmin=5;//this round min it gets add to end game number
    int roundmax=25;//this is mainly to show the max round the reall max round is gotten by endgame+roundmin
    int score=0;//player score
    int aiscore=0;//bot score
    int aimove;//the finall bot move
    int playercop=0;//this is used to ai to make a move bassed on the player most played
    int playerdef=0;//same as the one above 
    String roundsanswers []= new  String [25];//
    int aioptin(){
        Random rand = new Random();
        return rand.nextInt(2);//this the bot curent stategy it random this not the full final stagey
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
        System.out.println("                    ROUNDS");
        System.out.println("   rounds min= "+roundmin+"    max= "+roundmax);
        System.out.println("for rule and setteing type 'menu'");
        System.out.println("");
        System.out.println("");
        System.out.println("type 'start' to start");  
        String Command;
        Command=Keybaord.nextLine();
        //start game lets gooo
       while(start==false){
       
        if (Command.equals("start")){
            start = true;
            
        } else {//if they type a invalid coman
           System.out.println('\u000c');
           System.out.println("type 'start' to start");
           Command=Keybaord.nextLine();
        }
        
      }
      while (start == true ){
        
        //def = 1 cop =0
        if (roundnumber<5){//thes if stament are the statgey the of my game so the frist 5 rounds are random then it make desicion based on the player most played optin\\

            aimove=aioptin();
        }
        if(roundnumber>5&&playercop<playerdef){
            aimove=1;//def = 1 cop =0
           }
        if (roundnumber>5&&playercop>playerdef){
            aimove=0;//def = 1 cop =0
          }
        if (roundnumber>5&&playercop==playerdef){
            aimove=1;//def = 1 cop =0
          }
        System.out.println("");
        System.out.println("");
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
        System.out.println("               DO COOPERATE OR DEFECT?");
        Command=Keybaord.nextLine();//this the start of the game
        
        boolean answerloop = false;
        if (Command.equals("a")){//this a working part ubt wont be polshid util next version
           answerloop = true;
           int x = 1; 
           while (answerloop = true&&x<roundnumber){
                
                System.out.println(roundsanswers[x]);
                x=x+1;
           }
        }
        if (Command.equals("def")&&aimove==0){
            roundnumber=roundnumber+1;
            score=score+5;
            score=score-1;
            roundsanswers[roundnumber]="you defect and ai cooperate";
            playerdef=playerdef+1;//def = 1 cop =0
            //u def and ai cop so u win
        }
        if (Command.equals("def")&&aimove==1){
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore-1;
            roundsanswers[roundnumber]="you defect and ai defect";
            playerdef=playerdef+1;//def = 1 cop =0
            //you both def so u tei
        }
        if (Command.equals("cop")&&aimove==0){
            roundnumber=roundnumber+1;
            score=score+3;
            aiscore=aiscore+3;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;//def = 1 cop =0
            // you both cop 
        }
        if (Command.equals("cop")&&aimove==1){
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore+5;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;//def = 1 cop =0
            //ai def and u cop
        }
        if (Command.equals("end")){
            start=false;
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played: "+roundnumber);
            System.out.println("you ended the game ");//end the game erly
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
