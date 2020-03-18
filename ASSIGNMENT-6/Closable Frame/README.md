## Closable Frame

We can close the AWT Window or Frame by calling dispose() or System.exit() inside windowClosing() method. The windowClosing() method is found in WindowListener interface and WindowAdapter class.

The WindowAdapter class implements WindowListener interfaces. It provides the default implementation of all the 7 methods of WindowListener interface. To override the windowClosing() method, you can either use WindowAdapter class or WindowListener interface.

## EXAMPLE:

### By using Adapter Class
```java
import java.awt.*;  
import java.awt.event.*;  
public class AdapterExample extends WindowAdapter{  
    Frame f;  
    AdapterExample(){  
        f=new Frame();  
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void windowClosing(WindowEvent e) {  
    f.dispose();  
}  
public static void main(String[] args) {  
    new AdapterExample();  
}  
}  
```

### By using  Anonymous class

```java
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
public class WindowExample extends Frame{  
    WindowExample(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
public static void main(String[] args) {  
    new WindowExample();  
}  
```

### By Implementing WindowListener

```java
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
public class WindowExample extends Frame implements WindowListener{  
    WindowExample(){  
        addWindowListener(this);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new WindowExample();  
}  
public void windowActivated(WindowEvent e) {}  
public void windowClosed(WindowEvent e) {}  
public void windowClosing(WindowEvent e) {  
    dispose();  
}  
public void windowDeactivated(WindowEvent e) {}  
public void windowDeiconified(WindowEvent e) {}  
public void windowIconified(WindowEvent e) {}  
public void windowOpened(WindowEvent arg0) {}  
}  
```