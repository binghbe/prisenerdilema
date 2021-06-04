/**
 * Write a description of class V1_0 here.
 *version 1.1 it will have the lay out and some varibels
 * @author (bear)
 * @version (V1.1  4/6/2021)
 */
public class V1_1
{
    
    private int x;
    int roundnumber =0;
    int roundsplayed=0;
    int roundmin=5;
    int roundmax=25;
    int roundsanswers []= new int [24];
    int score=0;

    /**
     * Constructor for objects of class V1_0
     */
    public V1_1()
    {
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
        System.out.println("                    DO COPRET OR DEFECT?");                 
    }


}