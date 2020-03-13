## Java Adapter Classes
Java adapter classes provide the default implementation of listener interfaces. If you inherit the adapter class, you will not be forced to provide the implementation of all the methods of listener interfaces. So it saves code.

The adapter classes are found in java.awt.event, java.awt.dnd and javax.swing.event packages. The Adapter classes with their corresponding listener interfaces are given below.

java.awt.event Adapter classes

Adapter class  | Listener interface
--------------|------------------
WindowAdapter |	WindowListener
KeyAdapter | KeyListener
MouseAdapter |	MouseListener
MouseMotionAdapter | MouseMotionListener
FocusAdapter |	FocusListener
ComponentAdapter |	ComponentListener
ContainerAdapter |	ContainerListener
HierarchyBoundsAdapter | HierarchyBoundsListener

 
#### java.awt.dnd Adapter classes
Adapter class |	Listener interface
-------------------|----------------
DragSourceAdapter |	DragSourceListener
DragTargetAdapter |	DragTargetListener


#### javax.swing.event Adapter classes
Adapter class |	Listener interface
----------------------|--------------------
MouseInputAdapter |	MouseInputListener
InternalFrameAdapter |	InternalFrameListener


### Java WindowAdapter Example:
```java
import java.awt.*;  
import java.awt.event.*;  
public class AdapterExample{  
    Frame f;  
    AdapterExample(){  
        f=new Frame("Window Adapter");  
        f.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        });  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public static void main(String[] args) {  
    new AdapterExample();  
}  
}  
```

### Java MouseAdapter Example

```java
import java.awt.*;  
import java.awt.event.*;  
public class MouseAdapterExample extends MouseAdapter{  
    Frame f;  
    MouseAdapterExample(){  
        f=new Frame("Mouse Adapter");  
        f.addMouseListener(this);  
          
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=f.getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
      
public static void main(String[] args) {  
    new MouseAdapterExample();  
}  
}  
```
