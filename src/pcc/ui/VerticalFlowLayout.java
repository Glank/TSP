package pcc.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.Vector;

//Source: http://stackoverflow.com/questions/4495094/swing-layout-vertical-flow
public class VerticalFlowLayout implements LayoutManager2
{
    final private Vector<Component> components = new Vector<Component>();
    private int vgap = 2;
    private int height = 0;
    public void setVGap(int vgap) { this.vgap = vgap; }

    @Override public void addLayoutComponent(Component comp, Object constraints) {
        this.components.add(comp);
    }

    /* these 3 methods need to be overridden properly */
    @Override public float getLayoutAlignmentX(Container target) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override public float getLayoutAlignmentY(Container target) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override public void invalidateLayout(Container target) {
        // TODO Auto-generated method stub

    }


    @Override public void addLayoutComponent(String name, Component comp) {
        this.components.add(comp);
    }

    @Override public void layoutContainer(Container parent) {
        int x = 0;
        int y = 0;
        height = 0;
        for (Component c : this.components)
        {
            if (c.isVisible())
            {
                Dimension d = c.getPreferredSize();
                c.setBounds(x, y, parent.getWidth(), d.height);
                y += d.height + this.vgap;  
                height+=d.height + this.vgap;
            }
        }       
    }

    /* these 3 methods need to be overridden properly */
    @Override public Dimension minimumLayoutSize(Container parent) {
        return new Dimension(0,0);
    }

    @Override public Dimension preferredLayoutSize(Container parent) {
        return new Dimension(0,height);
    }

    @Override public Dimension maximumLayoutSize(Container target) {
        return new Dimension(600,600);
    }


    @Override public void removeLayoutComponent(Component comp) {
        this.components.remove(comp);
    }
}
