
/**
 
/**
 * Write a description of class V6 here.
     *version 6  this version is hopfly the finall version and will have all sytem writput properly with no testing code
 * @author (bear)
 * @version (10/8/2021)
 */
import java.util.Random;
import java.util.Scanner;//Keyboard imput
public class V6{
    Random rand = new Random();
    int endgame = rand.nextInt(20);//this gives the number for the end of the game
    int roundnumber=0; //curnet round number
    int roundsplayed=0;//total rounds played
    int roundmin=5;//this round min it gets add to end game number
    int roundmax=25;//this is mainly to show the max round the reall max round is gotten by endgame+roundmin
    int score=0;//player score
    int aiscore=0;//bot score
    int aimove;//the finall bot move
    int playercop=0;//this is used to ai to make a move bassed on the player most played
    int playerdef=0;//same as the one above 
    String roundsanswers []= new  String [25];//this holds all the round anwasers so it can display them
    int aioptin(){
        Random rand = new Random();
        return rand.nextInt(2);// this the random nuber gareter used for the bot making the srti few moves
    }
     //def = 1 cop =0
     

   /**
     * Constructor for objects of class V6
     */
    public V6()
    {
        boolean start = false;
        boolean run = false;
        Scanner Keybaord = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("              PRISONEIR'S DILEMMA");
        System.out.println("                   by bear");
        System.out.println("                    ROUNDS");
        System.out.println("   rounds min= "+roundmin+"    max= "+roundmax);
        System.out.println("for rules and and a bit more info type 'rules'");
        System.out.println("");
        System.out.println("");
        System.out.println("type 'start' to start");  
        String Command;
        Command=Keybaord.nextLine();
       //this the start of the game
       while(start==false){
        if (Command.equals("start")){
            start = true;
            run = true;
            //start game lets gooo
        } else if(Command.equals("rules")){
            System.out.println("wellcome to the prserns dileam");
            System.out.println("");
            System.out.println("the rules of the game are simpel");
            System.out.println(" ther are two thing you can do ");
            System.out.println("you can cooperate or defect");
            System.out.println("the bot has the same optin");
            System.out.println("");
            System.out.println("if you cooperate and the bot cooperate you both gain 5 points");
            System.out.println("if you cooperate and the bot defcets you will lose 1 and the bot will 7");
            System.out.println("if you defcets and bot cooperate you will gain 7 points and lose 1");
            System.out.println("if you defcets and the bot defcets ypu both lose 5 points");
            System.out.println("");
            System.out.println("");
            System.out.println("type 'start' to start");  
            Command=Keybaord.nextLine();//wall of text for rules
        }
        
        else {//if they type a invalid coman
           System.out.println("type 'rules' for rules");
           System.out.println("");
           System.out.println("type 'start' to start");
           Command=Keybaord.nextLine();
        }
        }
      while (run == true ){
      while (start == true ){
        if (roundnumber<5){//thes if stament are the statgey the of my game so the frist 5 rounds are random then it make desicion based on the player most played optin\\
            aimove=aioptin();
        }
        if(roundnumber>5&&playercop<playerdef){
            aimove=1; //def = 1 cop =0
            //if player def more u do as well cos u not leting them win
           }
        if (roundnumber>5&&playercop>playerdef){
            aimove=0; //def = 1 cop =0
            //if rounds more than 5 and player cops more cop as well cos you nice bot
          }
        if (roundnumber>5&&playercop==playerdef){
            aimove=0; //def = 1 cop =0
            // bot def for the points
          }
        System.out.println("");//the interface 
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
        System.out.println("   past = all past rounds");
        System.out.println("");
        System.out.println("               DO COOPERATE OR DEFECT?");
        Command=Keybaord.nextLine();
        //def = 1 cop =0
        boolean answerloop = false;
        if (Command.equals("past")){
           answerloop = true;
           int loopnumber = 1;// it one cos 0 i wll cos a null  
           while (answerloop = true&&loopnumber<roundnumber){
                
                System.out.println("round"+loopnumber+roundsanswers[loopnumber]);
                loopnumber=loopnumber+1;// this loop makes it so i can print out the full. it takes loop nuber then adds loop nuber util loop is eqal to the same as the curent round number adn print everything
           }
           loopnumber =1;//so it stat at 1 when u use it agin
        }
        if (Command.equals("def")&&aimove==0){//def = 1 cop =0
            roundnumber=roundnumber+1;
            score=score+7;
            aiscore=aiscore-1;
            roundsanswers[roundnumber]="you defect and ai cooperate";
            playerdef=playerdef+1;
            //u def and ai cop so u win
        }
        if (Command.equals("def")&&aimove==1){//def = 1 cop =0
            roundnumber=roundnumber+1;
            score=score-5;
            aiscore=aiscore-5;
            roundsanswers[roundnumber]="you defect and ai defect";
            playerdef=playerdef+1;
            //you both def so u tei
        }
        if (Command.equals("cop")&&aimove==0){//def = 1 cop =0
            roundnumber=roundnumber+1;
            score=score+3;
            aiscore=aiscore+3;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;
            // you both cop 
        }
        if (Command.equals("cop")&&aimove==1){//def = 1 cop =0
            roundnumber=roundnumber+1;
            score=score-1;
            aiscore=aiscore+7;
            roundsanswers[roundnumber]="you cooperate and ai cooperate";
            playercop=playercop+1;
            //bot def and u cop
        }
        if (Command.equals("end")){
            start=false;
            
            System.out.println('\u000c');
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played: "+roundnumber);
            System.out.println("you ended the game ");
            //this ends the game if need to end realy 
            //rests everything 
            roundnumber =0;
            score =0;
            aiscore=0;
            playercop =0;
            playerdef =0;
        }
        if (endgame+5<roundnumber&&aiscore>score){
            start=false;
            System.out.println('\u000c');
            System.out.println("im sorry but you lost");
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score "+score);
            System.out.println("the ai score was "+aiscore);
            //losing skrean and edn of game
            //rests everything
            roundnumber =0;
            score =0;
            aiscore=0;
            playercop =0;
            playerdef =0;
            
        }
        if (endgame+5<roundnumber&&aiscore<score){
            start=false;
            System.out.println('\u000c');
            System.out.println("you win good job!!");
            System.out.println("game over hope u enjoyed it");
            System.out.println("rounds played "+roundnumber);
            System.out.println("your score was "+score);
            System.out.println("the ai score was "+aiscore);
            //wing the game skrean and end of game
            //rests everything
            roundnumber =0;
            score =0;
            aiscore=0;
            
            playercop =0;
            playerdef =0;
            
        }
      }
      while(start==false){//copyed and pasted so u can play agin
        if (Command.equals("start")){
            start = true;
            //start game lets gooo
        } else if(Command.equals("rules")){
            System.out.println("wellcome to the prserns dileam");
            System.out.println("");
            System.out.println("the rules of the game are simpel");
            System.out.println(" ther are two thing you can do ");
            System.out.println("you can cooperate or defect");
            System.out.println("the bot has the same optin");
            System.out.println("");
            System.out.println("if you cooperate and the bot cooperate you both gain 5 points");
            System.out.println("if you cooperate and the bot defcets you will lose 1 and the bot will 7");
            System.out.println("if you defcets and bot cooperate you will gain 7 points and lose 1");
            System.out.println("if you defcets and the bot defcets ypu both lose 5 points");
            System.out.println("");
            System.out.println("");
            System.out.println("type 'start' to start");  
            Command=Keybaord.nextLine();//wall of text for rules
        }
        
        else {//if they type a invalid coman
           System.out.println("type 'rules' for rules");
           System.out.println("");
           System.out.println("type 'start' to start");
           Command=Keybaord.nextLine();
        }
        }
    }
}
  }