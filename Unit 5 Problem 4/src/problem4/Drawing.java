package problem4;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Polygon;

public class Drawing extends JFrame {
	JPanel panel = new JPanel();

	
	public Drawing() {
		add(panel);
		add(new Parabola());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocationRelativeTo(null);
		setVisible(true);


	}
}