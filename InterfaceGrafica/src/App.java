import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class App {
	
	public static void main(String[] args) {
				
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		MeuRotulo label = new MeuRotulo("Meu rótulo");
		
		JTextField textfield = new JTextField(20);
		textfield.setForeground(Color.BLACK);
		textfield.setBorder(BorderFactory.criar());
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(20);
		textArea.setRows(6);
		textArea.setForeground(Color.black);
		textArea.setBorder(BorderFactory.criar());
		
		
		frame.add(label);
		frame.add(textfield);
		frame.add(textArea);
		
		
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Interface Gráficas");
		
	}

}
