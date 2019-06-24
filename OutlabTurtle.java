/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlabturtle;

import javax.swing.JFrame;

/**
 *
 * @author Janet
 */
public class OutlabTurtle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Turt turt = new Turt();
        JFrame frame = new JFrame(""
                + "Turtles");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(turt);
        frame.pack();
        frame.setVisible(true);
        
        turt.penColor(255,255,0);
        turt.penSize(5);
        int sides = 8;
        int length = 55;
        
        for(int i =0; i<sides;i++){
            turt.forward(length);
            turt.turnLeft(360/sides);
        }
        
        turt.penUp();
        turt.goTo(400, 450);
        turt.penDown();
        turt.penColor(0, 0, 225);
        turt.turnLeft(90);
        turt.forward(125);
        
        /*
        change size
        turt.penSize(2);
        turt.setColor(0, 0, 255);
        turt.forward(50);
        turt.turnRight(15);
        turt.forward(50);
        */
       
        
        
     
    }
    
}
