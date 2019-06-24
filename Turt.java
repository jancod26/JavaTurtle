/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlabturtle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Janet
 */
public class Turt extends JPanel{
     
    private DrawingPanel graphics= new DrawingPanel();
      // private Color color = Color.black;
    public int x = 400, y = 300;
    private boolean penUp = false;
    public double angle = 90;
    public static Color rgb;
    public static int size;
    
    
    public Turt(){
      
        add(graphics);
    }
   
       public void penDown() {
    	graphics.penDown();
    }
 
    public void penUp() {
    	graphics.penUp();
    }


     public void home(){
        x = 400;
    	y = 300;
    }
    
    public void goTo(int newx, int newy){
      x = newx;
    	y = newy;
    }
    
    public void turnRight(int change)
    {
        angle = change + angle;
    }

    public void turnLeft(int change)
    {
        angle = angle - change;
    }

    
    public void forward(int amount)
    {
        if(graphics.getPen()==false){
            
     int oldX = x;
     int oldY = y;
     
     x+= amount *Math.cos(Math.toRadians(angle));
     y += amount * Math.sin(Math.toRadians(angle));
     graphics.drawLine(oldX, oldY, x, y);
        }
        else{
            int tempx = x;
        	int tempy = y;
        	x += amount* Math.cos(Math.toRadians(angle));
        	y += amount * Math.sin(Math.toRadians(angle));
        }
    }

    
    public void backward(int amount)
    {
        if(penUp)
            return;
          int oldX = x;
     int oldY = y;
     
     x-= amount *Math.cos(Math.toRadians(angle));
     y -= amount * Math.sin(Math.toRadians(angle));
     graphics.drawLine(oldX, oldY, x, y);
       
    }
    
    public void penSize(int b){
        size = b;
    }
     public double getHead() {
		return angle;
	}

   public void penColor(int r, int g, int b) {
     
         rgb = new Color(r,g,b);
         
		
   }
        
        
   
}
