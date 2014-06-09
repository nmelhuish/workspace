package problem1;
import javax.swing.*;
import javax.swing.JFrame;

public class FlowLayout extends JFrame {
	JButton jbtButton1;
	JButton jbtButton2;
	JButton jbtButton3;
	JButton jbtButton4;
	JButton jbtButton5;
	JButton jbtButton6;
	JPanel panel;


public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// frame
        JFrame frame = new JFrame();
        frame.setSize ( 600, 100 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "FlowLayout");
        frame.setVisible( true );
      
//        PANEL
        JLabel label= new JLabel();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(label);
        
        JButton jbtButton1 = new JButton("Button 1");
        panel.add(jbtButton1);
        JButton jbtButton2 = new JButton("Button 2");
        panel.add(jbtButton2);
        JButton jbtButton3 = new JButton("Button 3");
        panel.add(jbtButton3);
        JButton jbtButton4 = new JButton("Button 4");
        panel.add(jbtButton4);
        JButton jbtButton5 = new JButton("Button 5");
        panel.add(jbtButton5);
        JButton jbtButton6 = new JButton("Button 6");
        panel.add(jbtButton6);
		
	
	
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

