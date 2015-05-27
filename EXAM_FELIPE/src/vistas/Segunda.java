package vistas;

import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import modelo.IngresoLaby;
import modelo.Cadete;
public class Segunda extends JPanel {
	private JTextField CampoNom;
	private JTextField textField;
	private JTextField CampoApe1;
	private JTextField CampoApe2;
	private JTextField CampoNaci;
	private Cadete thelaby;
	/**
	 * Create the panel.
	 */
	public Segunda() {
		setLayout(null);
		
		JComboBox comboEquipo = new JComboBox();
 	comboEquipo.addItem("");
 	
 	

		
		
		
		
		comboEquipo.setBounds(10, 40, 110, 20);
		add(comboEquipo);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 15, 46, 14);
		add(lblEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(136, 15, 46, 14);
		add(lblNombre);
		
		CampoNom = new JTextField();
		CampoNom.setEditable(false);
		CampoNom.setBounds(136, 40, 86, 20);
		add(CampoNom);
		CampoNom.setColumns(10);
		
		JButton button = new JButton("<< Atras");
		button.setBounds(10, 255, 89, 23);
		add(button);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.setBounds(337, 255, 103, 23);
		add(btnSiguiente);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(260, 40, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Id.");
		lblId.setBounds(260, 15, 46, 14);
		add(lblId);
		
		CampoApe1 = new JTextField();
		CampoApe1.setEditable(false);
		CampoApe1.setBounds(136, 94, 86, 20);
		add(CampoApe1);
		CampoApe1.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(136, 69, 86, 14);
		add(lblerApellido);
		
		JLabel lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(136, 125, 86, 14);
		add(lblApellido);
		
		CampoApe2 = new JTextField();
		CampoApe2.setEditable(false);
		CampoApe2.setBounds(136, 155, 86, 20);
		add(CampoApe2);
		CampoApe2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(136, 186, 86, 14);
		add(lblNacionalidad);
		
		CampoNaci = new JTextField();
		CampoNaci.setEditable(false);
		CampoNaci.setBounds(136, 211, 86, 20);
		add(CampoNaci);
		CampoNaci.setColumns(10);

	}
}
