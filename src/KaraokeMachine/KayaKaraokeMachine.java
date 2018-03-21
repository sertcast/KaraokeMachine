package KaraokeMachine;
import java.awt.*;
import java.util.Random;
import hsa.Console;
/*
 * Trouble he will find you no matter where you go, oh oh
No matter if you're fast no matter if you're slow, oh oh
The eye of the storm or the cry in the mourn, oh oh
You're fine for a while but you start to lose control

He's there in the dark
He's there in my heart
He waits in the wings
He's gotta play a part
Trouble is a friend
Yeah trouble is a friend of mine. Oh-oh!

Trouble is a friend but trouble is a foe, oh oh
And no matter what I feed him he always seems to grow, oh oh
He sees what I see and he knows what I know, oh oh
So don't forget as you ease on down the road

He's there in the dark
He's there in my heart
He waits in the wings
He's gotta play a part
Trouble is a friend
Yeah trouble is a friend of mine. Oh oh!

So don't be alarmed if he takes you by the arm
I won't let him win, but I'm a sucker for his charm
Trouble is a friend
Yeah trouble is a friend of mine. Oh-oh!

Oh how I hate the way he makes me feel
And how I try to make him leave; I try
Oh Oh I try!

But he's there in the dark
He's there in my heart
He waits in the wings
He's gotta play a part
Trouble is a friend
Yeah trouble is a friend of mine. Oh oh!

So don't be alarmed if he takes you by the arm
I won't let him win, but I'm a sucker for his charm
Trouble is a friend
Yeah trouble is a friend of mine. Oh-oh!
 */
public class KayaKaraokeMachine{
	
    public static Console c;
    public static Random rand;
    public static final String []lyrics = {
    		"Trouble he will find you no mater where you go, oh oh",
    		"No Matter if you're fast no matter if you're slow, oh oh",
    		"The eye of the storm and the cry in the morn, oh oh",
    		"Your fine for a while but you’ve start loose ",
    		"controooooooooooooooool",
    		"He's there in the dark",
    		"He's there in my heart",
    		"He waits in the winds",
    		"He's gotta play a part",
    		"Trouble is a friend",
    		"Yeah trouble is a friend of mine. oh oh",
    		"Trouble is a friend but trouble is a foe, oh oh",
    		"And no matter what I feed him he always seems to grow, oh oh",
    		"He sees what I see and he knows what I know, oh oh",
    		"So don't forget as you ease on down the road",
    		"So don't be alarmed if he takes you by the arm",
    		"I won't let him win, but I'm a sucker for his charm",
    		"Trouble is a friend",
    		"Yeah trouble is a friend of mine, oh oh",
    		"Oh how I hate the way he makes me feel",
    		"And how I try to make him leave, I try",
    		"Oh Oh I try"
    };
    public static final int []timing = {
    		4000,
    		4000,
    		4000,
    		4000,
    		4000,
    		4000,
    		4000,
    		0,
    		4000, 
    		0
    };
    
    public static void displayText (String txt, int delay) throws InterruptedException{
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
   
    public static void main (String[] args) throws InterruptedException{
		//init
		c  = new Console (20, 100, 20, "Lenka - Trouble Is a Friend");
		rand = new Random (); 
		//displays singer - song
		displayText((c.maxcol()/2) - centerText("Lenka - Trouble Is A Friend ") + 1, (c.maxrow()/2), "Lenka - Trouble Is A Friend ", 2000);
		c.println ();
		
		//displays my name
		displayText((c.maxcol()/2) - centerText("by Mert Kaya")+ 1,(c.maxrow()/2) + 1,"by Mert Kaya", 1000);
		Thread.sleep (10000);
		
		c.clear();
		for (int i = 0; i < 5; i++) {
			
			if(i!=4) {
				c.clear();
				displayText((c.maxcol()/2) - centerText(lyrics[i]) + 1, (c.maxrow()/2), lyrics[i], timing[i*2]);
				Thread.sleep(timing[i*2 + 1]);
			}else {
				displayText((c.maxcol()/2) - centerText(lyrics[i]) + 1, (c.maxrow()/2) + 1, lyrics[i], timing[i*2]);
				Thread.sleep(timing[i*2 + 1]);
			}
		}
    }
}

