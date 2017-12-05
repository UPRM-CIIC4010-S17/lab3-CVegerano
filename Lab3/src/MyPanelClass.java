import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.WHITE);
		g.fillRect(x1, y1, width+1, height+1);

		//                      //Draw a border
		//                        g.setColor(Color.YELLOW);
		//                        g.drawRect(x1, y1, width, height);
		//                        g.setColor(Color.RED);
		//                        g.drawRect(x1+5, y1+5, width-10, height-10);
		//                        
		//                        //Draw a line
		//                        g.setColor(Color.WHITE);
		//                        g.drawLine(x1, y1, x2, y2);
		//   
		//                        g.setColor(Color.ORANGE);
		//                        g.drawLine(x1+width, y1, x1, y1+height);
		//
		//		g.setColor(Color.LIGHT_GRAY);
		//		g.fillOval((width/2)-55/2, (height/2)-55/2, 55, 55);  
		//		
		//	     Polygon p = new Polygon();
		//         p.addPoint(x1 + 5, y1 + 25);
		//         p.addPoint(x1 + 20, y1 + 10);
		//         p.addPoint(x1 + 35, y1 + 25);
		//         p.addPoint(x1 + 25, y1 + 25);
		//         p.addPoint(x1 + 25, y1 + 45);
		//         p.addPoint(x1 + 15, y1 + 45);
		//         p.addPoint(x1 + 15, y1 + 25);
		//         g.setColor(Color.YELLOW);
		//         g.fillPolygon(p);
		//
		//		Polygon p2 = new Polygon();
		//		p2.addPoint(x1 + 25, y1 + 73);
		//		p2.addPoint(x1 + 41, y1 + 73);
		//		p2.addPoint(x1 + 47, y1 + 58);
		//		p2.addPoint(x1 + 53, y1 + 73);
		//		p2.addPoint(x1 + 69, y1 + 73);
		//		p2.addPoint(x1 + 56, y1 + 83);
		//		p2.addPoint(x1 + 61, y1 + 98);
		//		p2.addPoint(x1 + 47, y1 + 88);
		//		p2.addPoint(x1 + 34, y1 + 98);
		//		p2.addPoint(x1 + 38, y1 + 83);
		//		g.setColor(Color.WHITE);
		//		g.fillPolygon(p2);

		//Background
		g.setColor(Color.white);
		g.fillRect(x1, y1, width + 1, height + 1);


		//Red stripes
		g.setColor(Color.red);
		g.fillRect(x1, y1+10, width,30);
		g.fillRect(x1, y1+70, width,30);
		g.fillRect(x1, y1+130, width,30);


		//Triangle
		g.setColor(Color.BLUE);
		Polygon p1=new Polygon();
		p1.addPoint(x1+0,y1+10);
		p1.addPoint(x1+115,y1+150/2);
		p1.addPoint(x1+0,y1+150);
		g.fillPolygon(p1);

		//Star from the past code
		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25, y1 + 73);
		p2.addPoint(x1 + 41, y1 + 73);
		p2.addPoint(x1 + 47, y1 + 58);
		p2.addPoint(x1 + 53, y1 + 73);
		p2.addPoint(x1 + 69, y1 + 73);
		p2.addPoint(x1 + 56, y1 + 83);
		p2.addPoint(x1 + 61, y1 + 98);
		p2.addPoint(x1 + 47, y1 + 88);
		p2.addPoint(x1 + 34, y1 + 98);
		p2.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);



	}
}