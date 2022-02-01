package associationTestImpl.display;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
    private int width;
    private int height;


    public Display() {
        setLayout(null);
        this.width = 100;
        height = 100;
        JButton button = new JButton("Expand");
        button.addActionListener(e -> {
            height = 200;
            width = 200;
            repaint();
        });
        button.setBounds(400,100, 120, 30 );
        add(button);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.green);
        g.fillRect(0, 0, width, height);
    }
}
