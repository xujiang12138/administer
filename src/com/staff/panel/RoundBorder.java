package com.staff.panel;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by asus on 2017/12/20.
 */
public class RoundBorder implements Border {
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHints(rh);
        Color color = g.getColor();
        g2.setColor(color);
        g2.drawRoundRect(0, 0, c.getWidth()-1, c.getHeight()-1, 10, 10);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
