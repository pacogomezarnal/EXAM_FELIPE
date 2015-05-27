package vistas;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private Primera primera;
	private Segunda	segunda;
	private Tercera tercera;

	public Ventana1() {
		this.setTitle("The Laby");
		contentPane=new JPanel();
		primera= new Primera();
		segunda= new Segunda();
		tercera= new Tercera();
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(primera);
		
		
		
	}

}
