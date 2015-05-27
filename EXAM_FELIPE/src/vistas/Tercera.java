package vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tercera extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField campoMsj;

	
	public Tercera() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID.");
		lblId.setBounds(10, 47, 46, 14);
		add(lblId);
		
		textField = new JTextField();
		textField.setBounds(10, 72, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 72, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(142, 47, 79, 14);
		add(lblerApellido);
		
		JButton btnComrpobar = new JButton("Comprobar");
		btnComrpobar.setBounds(10, 147, 413, 23);
		add(btnComrpobar);
		
		campoMsj = new JTextField();
		campoMsj.setEditable(false);
		campoMsj.setBounds(10, 196, 413, 20);
		add(campoMsj);
		campoMsj.setColumns(10);

	}

}
