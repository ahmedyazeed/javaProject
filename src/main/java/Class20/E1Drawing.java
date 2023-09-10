package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {

    public static void main(String[] args) {

        JFrame frame=new JFrame();
        MyCanvas  c=new MyCanvas();

        frame.add(c);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
      g.setColor(Color.green);
      g.fillRect(50,50,100,100);
      g.setColor(Color.red);
      g.fill3DRect(200,200,100,100,true);
      g.setColor(Color.pink);
      g.fillOval(100,150,100,100);
        g.setColor(Color.blue);
      g.fillOval(150,150,80,80);
    }
}
