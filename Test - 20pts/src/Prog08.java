// APCS1 Lab Test 1
//
// Prog08.java
//
// JPII
//
// Points: 4
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program displays 3 large rectangles.
// You need to add to the program so that it will display the letters "JPII".
// These letters should be the same height & width and in the same location
// as the original 3 rectangles.
// NOTE: The double II takes up the space of 1 rectangular block.
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog08.html in order to execute this file.


import java.awt.*;
import java.applet.*;


public class Prog08 extends Applet
{
	public void paint(Graphics g)
	{
		// Draw 3 big rectangles
		g.setColor(Color.black);
		g.fillRect(50,100,200,400);
		g.fillRect(300,100,200,400);
		g.fillRect(550,100,200,400);
		
		// J
		g.setColor(Color.WHITE);
		g.fillRect(50, 100, 150, 200);
		g.fillRect(100, 300, 100, 150);
	
		// P
		g.fillRect(350, 150, 100, 100);
		g.fillRect(350, 300, 150, 200);
		
		// II
		g.fillRect(550, 150, 50, 300);
		g.fillRect(700, 150, 50, 300);
		g.fillRect(625, 150, 50, 300);
	
	
	
	}
}

