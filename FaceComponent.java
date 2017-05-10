
/**
* Program to plot the simple Face. 
* @author Eyad AL-‘Amawi
*/ 

import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {

    public void paintComponent(Graphics g) {
        //Recover Graphics2D
        Graphics2D graph = (Graphics2D) g;
        graph.setColor(Color.BLUE);
        // Draw the Head
        Ellipse2D.Double head = new Ellipse2D.Double(100, 80, 150, 150);
        graph.draw(head);
        
        // Draw the eyes 
       graph.setColor(Color.GREEN);
       Ellipse2D.Double eye1 = new Ellipse2D.Double(130,125,20,20);
       graph.draw(eye1);
       graph.fill(eye1);
       Ellipse2D.Double eye2 = new Ellipse2D.Double(200,125,20,20);
       graph.draw(eye2);
       graph.fill(eye2);
       
        // Draw the noise 
        graph.setColor(Color.RED);
        Line2D.Double noise1 = new Line2D.Double(175, 150, 175, 170);
        graph.draw(noise1);
        Line2D.Double noise2 = new Line2D.Double(175, 150, 165, 170);
        graph.draw(noise2);
        Line2D.Double noise3 = new Line2D.Double(175, 150, 185, 170);
        graph.draw(noise3);
        Line2D.Double noise4 = new Line2D.Double(165, 170, 185, 170);
        graph.draw(noise4);
        
        // Draw the Mouth 
        graph.setColor(Color.GRAY);
        Line2D.Double mouth = new Line2D.Double(150, 200, 200, 200);
        graph.draw(mouth);


    }
}
