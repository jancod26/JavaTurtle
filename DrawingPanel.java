/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlabturtle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;

/**
 *
 * @author Janet
 */
public class DrawingPanel extends JPanel {
    private boolean penUp = false;
   
    private BufferedImage image;
    private final static Color BACKGROUND_COLOR = Color.WHITE;

    public DrawingPanel() {

        setPreferredSize(new Dimension(800, 600));

        image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        setMaximumSize(new Dimension(image.getWidth(), image.getHeight()));

        clear();

    }
    public boolean getPen() {
	    	return penUp;
	    }
	    
	
	    
	    public void penDown()
	    {
	        penUp = false;
	    }

	    
	    public void penUp()
	    {
	        penUp = true;
	    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(image, 0, 0, null);
    }

    public void clear() {
 
        Graphics g = image.getGraphics();

        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());

    }

    public void drawLine(int x1, int y1, int x2, int y2) {

        Graphics g = image.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(Turt.size));
        g.setColor(Turt.rgb);

        g2.drawLine(x1, y1, x2, y2);
    }

}
