package plugins;

import javafx.util.Pair;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class DrawPanel extends JPanel {

    public int oldX,oldY, currentX, currentY;
    public ArrayList<DrawableObject> objectsToDraw;

    public int tool = 1;



    public DrawPanel()
    {
        objectsToDraw = new ArrayList<>();

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
            private void jPanel2MousePressed(MouseEvent evt) {
                oldX = evt.getX();
                oldY = evt.getY();
                System.out.println(oldX + " " + oldY);
            }

            private void jPanel2MouseReleased(MouseEvent evt) {
                currentX = evt.getX();
                currentY = evt.getY();
                System.out.println("line!!!! from" + oldX + "to" + currentX);

                
                objectsToDraw.add(new Line(new Point(oldX, oldY), new Point(currentX, currentY)));
                repaint();
            }
        });

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(DrawableObject o : objectsToDraw)
        {
            o.draw(g);
        }
    }
}
