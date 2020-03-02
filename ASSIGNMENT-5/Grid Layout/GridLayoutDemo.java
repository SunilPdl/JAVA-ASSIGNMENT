import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo
{
    JFrame f;
    GridLayoutDemo()
    {
        f = new JFrame();

        JButton btn1 = new JButton("12");
        JButton btn2 = new JButton("11");
        JButton btn3 = new JButton("10");
        JButton btn4 = new JButton("9");
        JButton btn5 = new JButton("8");
        JButton btn6 = new JButton("7");
        JButton btn7 = new JButton("6");
        JButton btn8 = new JButton("5");
        JButton btn9 = new JButton("4");
        JButton btn10 = new JButton("3");
        JButton btn11 = new JButton("2");
        JButton btn12 = new JButton("1");
    

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(btn10);
        f.add(btn11);
        f.add(btn12);

        f.setLayout(new GridLayout(4,3,1,1));/*making 4 rows and 3 columns
        and 1,1 for horizontal and vertical  gap respectively.*/

        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GridLayoutDemo();
        
    }

}