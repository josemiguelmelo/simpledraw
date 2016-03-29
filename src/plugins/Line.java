package plugins;


import com.sun.tools.javac.util.Position;

import java.awt.*;

public class Line implements DrawableObject {

    public Point from;
    public Point to;

    public Line(Point from, Point to)
    {
        this.from = from;
        this.to = to;
    }


    @Override
    public void draw(Graphics g) {
        g.drawLine(from.x, from.y, to.x, to.y);
    }
}
