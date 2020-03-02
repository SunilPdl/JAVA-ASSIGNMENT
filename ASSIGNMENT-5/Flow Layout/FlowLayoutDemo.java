import java.awt.*;
import javax.swing.*;


public class FlowLayoutDemo
{
    JFrame f;

    FlowLayoutDemo()
    {
        f = new JFrame();

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);

        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //setting flow layout of right alignment.

        f.setSize(350,350);
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new FlowLayoutDemo();
    }
}