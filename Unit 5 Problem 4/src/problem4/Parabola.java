package problem4;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Parabola extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();

		double scaleFactor = 0.1;
		for (int x = -100; x <= 100; x++) {
			p.addPoint(x + 200, 200 - (int) (scaleFactor * x * x));
			
		}
		g.drawPolygon(p);
		g.drawLine(0, 100, 350, 100);
		g.drawLine(200, 0, 200, 350);
		g.drawString("x-axis", 15, 100);
		g.drawString("y-axis", 200, 15);
	}

}