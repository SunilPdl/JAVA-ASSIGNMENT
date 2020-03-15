  
import java.awt.*;


class DrawHouse extends Canvas

{
	public void paint(Graphics g)
	{
        //for building and roof
		g.setColor(Color.RED);
		g.fillRect(100,200,400,300);
		g.drawLine(70,200,300,20);
		g.drawLine(300,20,530,200);
		g.drawLine(70,200,530,200);

		 int x[] = {70,300,530};
		 int y[] = {200,20,200};
		 g.setColor(new Color(255,150,100));
		 g.fillPolygon(x,y,3);

         //for windows
		 g.setColor(new Color(15,195,155));
		 g.fillRect(220,300,150,50);

		 g.setColor(Color.BLACK);
		 g.drawLine(270,300,270,350);
		 g.drawLine(320,300,320,350);
        
	}

	public static void main(String[] args) {
		DrawHouse ob = new DrawHouse();

		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(new Color(55,155,255));
		f.add(ob);
	}
}