package problem2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayout extends JFrame {
		JButton a,b,c,d,e,f;
		JPanel jp= new JPanel();
		
		
	public BorderLayout() {
		// frame
	        JFrame frame = new JFrame();
	        setSize ( 600, 100 );
	        setVisible( true );
	        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        
	        jp.setLayout(new GridLayout(2,4));
	}
	{
			a = new JButton("Button 1");
			jp.add(a);
			b = new JButton("Button 2");
			jp.add(b);
			c = new JButton("Button 3");
			jp.add(c);
			d = new JButton("Button 4");
			jp.add(d);
			e = new JButton("Button 5");
			jp.add(e);
			f = new JButton("Button 6");
			jp.add(f);
	        
	        add(jp);
			
		
	}	
		public static void  main(String[] args) {
			// TODO Auto-generated method stub
			BorderLayout b= new BorderLayout();
	
		}
}
