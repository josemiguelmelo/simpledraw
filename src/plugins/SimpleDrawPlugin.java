package plugins;

import framework.Plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

public class SimpleDrawPlugin extends Plugin {



    public SimpleDrawPlugin()
    {
        this.name = "SimpleDrawPlugin";
        DrawPanel panel = new DrawPanel();



        this.component = panel;

    }
}
