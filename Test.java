import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
public class Test extends JFrame implements ActionListener{
	private JButton button;
	private JFrame frame;
	public Test(){
		setTitle("Nonsensical Haiku Generator that may or may not rhyme");
		setSize(500, 500);
	}
	public void start(){
		try{
		frame = new Test();
		frame.show();
		Gen g = new Gen();
		g.generate();
		JLabel back = (new JLabel(new ImageIcon(ImageIO.read(new File("peaceful.jpg")))));
		back.setOpaque(false);
		frame.setContentPane(back);
		button = new JButton("Click here to generate another Haiku!");
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JLabel j1 = new JLabel("<html>"  +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" + "Beautiful Haiku:" + "<br>" + g.getLine1() +  "<br>" + g.getLine2() + "<br>"  + g.getLine3() + "</html>");
		button.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(j1);
		button.setVerticalAlignment(JLabel.TOP);
		j1.setVerticalAlignment(JLabel.TOP);
		frame.setVisible(true);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			start();
		}
	}
	
}
