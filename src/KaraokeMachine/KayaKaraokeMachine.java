package KaraokeMachine;
import java.awt.*;
import java.util.Random;
import hsa.Console;

public class KayaKaraokeMachine{
    static Console c;
    static Random rand;
    public static void displayText (String txt, int delay) throws InterruptedException{
    		c.setCursor(1, 1);
    		c.setTextColor (new Color (rand.nextInt (255), rand.nextInt (255), rand.nextInt (255)));
    		for (int i = 0 ; i < txt.length () ; i++){
    			c.print (txt.charAt (i));
    			Thread.sleep (delay / txt.length ());
    		}
    }
    public static void displayText (int xPos, int yPos, String txt, int delay) throws InterruptedException{
    		c.setCursor(yPos, xPos);
    		c.setTextColor (new Color (rand.nextInt (255), rand.nextInt (255), rand.nextInt (255)));
    		for (int i = 0 ; i < txt.length () ; i++){
    			c.print (txt.charAt (i));
    			Thread.sleep (delay / txt.length ());
    		}
    }

    public static int centerText(String txt){
    		return (txt.length() / 2);
    }
    //public static void
    public static void main (String[] args) throws InterruptedException{
		//init
		String myName = "by Mert Kaya";
		c  = new Console (20, 100, 20, "Lenka - Trouble Is a Friend");
		rand = new Random ();
		String[] lyrics = {};
		//c.setTextBackgroundColor(Color.black);
		//displays singer - song
		displayText ((c.maxcol()/2) - centerText("Lenka - Trouble Is A Friend ") + 1, (c.maxrow()/2), "Lenka - Trouble Is A Friend ", 2000);
		c.println ();
		//displays my name
		displayText ((c.maxcol()/2) - centerText("by Mert Kaya")+ 1,(c.maxrow()/2) + 1,"by Mert Kaya", 1000);
		Thread.sleep (5000);
    }
}

