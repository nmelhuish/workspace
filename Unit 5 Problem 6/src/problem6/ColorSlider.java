package problem6;
import javax.swing.*;

import java.awt.*;

import javax.swing.event.*;

public class ColorSlider extends JFrame {
	
		JSlider slider1, slider2, slider3;
		JLabel redLabel, greenLabel, blueLabel;
		JPanel colorPanel, sliders, labels; 
		
	public ColorSlider() {
		setLayout(new FlowLayout());
//		Red Slider
		slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255,0);
		slider1.setMajorTickSpacing(20);
		slider1.setPaintTicks(true);
		add(slider1);
		
		redLabel= new JLabel("Red=0");
		add(redLabel);
		
//		Blue Slider
		slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255,0);
		slider2.setMajorTickSpacing(20);
		slider2.setPaintTicks(true);
		add(slider2);
		
		blueLabel= new JLabel("Blue=0");
		add(blueLabel);
		
//		Green Slider
		slider3 = new JSlider(JSlider.HORIZONTAL, 0, 255,0);
		slider3.setMajorTickSpacing(20);
		slider3.setPaintTicks(true);
		add(slider3);
		
		greenLabel= new JLabel("Green=0");
		add(greenLabel);
		
		event e = new event();
		slider1.addChangeListener(e);
		slider2.addChangeListener(e);
		slider3.addChangeListener(e);
	
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.BLACK);
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(1,3,3,3));
		
		sliders = new JPanel();
		labels = new JPanel();
		
		pane.add(sliders);
		pane.add(labels);
		pane.add(colorPanel);
		
		sliders.setLayout(new GridLayout(3,1,2,2));
		sliders.add(slider1);
		sliders.add(slider2);
		sliders.add(slider3);
		
		labels.setLayout(new GridLayout(3,1,2,2));
		labels.add(redLabel);
		labels.add(blueLabel);
		labels.add(greenLabel);
		
	}	
	
	public class event implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = slider1.getValue();
			int b = slider2.getValue();
			int g = slider3.getValue();
			
			redLabel.setText("red" +r);
			blueLabel.setText("blue" +b);
			greenLabel.setText("green" +g);
			
			colorPanel.setBackground(new Color(r,g,b));
			
			
		}
	
	
	}
		
	public static void main(String[] args) {
		ColorSlider gui = new ColorSlider();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,200);
		gui.setVisible(true);
		gui.setTitle("ColorSlider");
		
		
	}

}
