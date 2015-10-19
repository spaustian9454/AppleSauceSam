// APCS1 Lab Test 1
//
// Prog07.java
//
// Crescent Moon
//
// Points: 3
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program displays a dark night sky wil several stars.
// You need to add the display of a crescent moon to the night-time output.
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog07.html in order to execute this file.
//
// ALSO: The sample exection of this file is on the back of your lab test sheet.


import java.awt.*;
import java.applet.*;


public class Prog07 extends Applet
{
	public void paint(Graphics g)
	{
		// Draw dark night sky
		g.setColor(Color.black);
		g.fillRect(0,0,800,600);
		
		// Draw stars
		g.setColor(Color.white);
		g.fillOval(100,100,4,4);  g.fillOval(73,212,4,4);   g.fillOval(57,356,4,4);
		g.fillOval(200,56,4,4);   g.fillOval(173,212,4,4);  g.fillOval(157,456,4,4);
		g.fillOval(300,235,4,4);  g.fillOval(263,412,4,4);  g.fillOval(357,286,4,4);
		g.fillOval(400,576,4,4);  g.fillOval(352,312,4,4);  g.fillOval(457,556,4,4);
		g.fillOval(333,453,4,4);  g.fillOval(443,72,4,4);   g.fillOval(557,446,4,4);
		g.fillOval(600,444,4,4);  g.fillOval(534,512,4,4);  g.fillOval(657,336,4,4);
		g.fillOval(700,313,4,4);  g.fillOval(623,273,4,4);  g.fillOval(757,226,4,4);
		g.fillOval(555,333,4,4);  g.fillOval(333,555,4,4);  g.fillOval(444,444,4,4);		
		g.fillOval(222,444,4,4);  g.fillOval(777,555,4,4);  g.fillOval(700,444,4,4);		
		g.fillOval(200,300,4,4);  g.fillOval(333,222,4,4);  g.fillOval(555,222,4,4);
		
		// Draw crescent moon
		g.setColor(Color.WHITE);
		g.fillOval(500, 25, 250, 250);
		g.setColor(Color.BLACK);
		g.fillOval(450, 50, 250, 250);
	
	
		
	}
}

