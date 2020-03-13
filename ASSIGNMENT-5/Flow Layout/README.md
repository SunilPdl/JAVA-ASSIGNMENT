## FlowLayout

The FlowLayout is usedd to arrange the components on a line one after another (ina flow). It is default layout of applet or panel.

### Fields of FlowLayout class

1- public static final int LEFT
2- public static final int RIGHT
3- public static final int CENTER
4- public static final int LEADING
5- public static final int TRAILING

### Constructors of FlowLayout class

1- Flowlayout():  Creates a flow layout with centered alignment and a default 5 unit horizontial and vertical gap.

2- FlowLayout(int align): Creates a flow layout with the given alignment and a defaults 5 units horizontal and vertical gap.

3- FlowLayout(int align,int hgap,int vgap): Creates a flow layout with the given alignment and the given horizontal and vertical gap.



## Example of FlowLayout class

```java
import java.awt.*;  
import javax.swing.*;  
  
public class MyFlowLayout{  
JFrame f;  
MyFlowLayout(){  
    f=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
      
    f.setLayout(new FlowLayout(FlowLayout.RIGHT));  
    //setting flow layout of right alignment  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyFlowLayout();  
}  
}  
```
