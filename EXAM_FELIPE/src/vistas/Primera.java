package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Primera extends JPanel {
	private JTextField CampoNombre;
	private JTextField campoID;
	private JTextField campoApellidos;
	private JTextField CampoEdad;
	private JTextField CampoNac;

	/**
	 * Create the panel.
	 */
	public Primera() {
		setLayout(null);
		
		JLabel lblUsuar = new JLabel("New label");
		lblUsuar.setIcon(new ImageIcon(Primera.class.getResource("/imagenes/usuario.jpg")));
		lblUsuar.setBounds(10, 11, 198, 209);
		add(lblUsuar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(218, 26, 46, 14);
		add(lblNombre);
		
		CampoNombre = new JTextField();
		CampoNombre.setEditable(false);
		CampoNombre.setBounds(218, 51, 86, 20);
		add(CampoNombre);
		CampoNombre.setColumns(10);
		
		campoID = new JTextField();
		campoID.setEditable(false);
		campoID.setBounds(328, 51, 86, 20);
		add(campoID);
		campoID.setColumns(10);
		
		JLabel lblId = new JLabel("Id.");
		lblId.setBounds(328, 26, 46, 14);
		add(lblId);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(218, 87, 46, 14);
		add(lblApellidos);
		
		campoApellidos = new JTextField();
		campoApellidos.setEditable(false);
		campoApellidos.setBounds(218, 105, 86, 20);
		add(campoApellidos);
		campoApellidos.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(218, 136, 46, 14);
		add(lblEdad);
		
		CampoEdad = new JTextField();
		CampoEdad.setEditable(false);
		CampoEdad.setBounds(218, 161, 86, 20);
		add(CampoEdad);
		CampoEdad.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(218, 192, 86, 14);
		add(lblNacionalidad);
		
		CampoNac = new JTextField();
		CampoNac.setEditable(false);
		CampoNac.setBounds(218, 217, 86, 20);
		add(CampoNac);
		CampoNac.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Segunda segunda = new Segunda();
				segunda.setVisible(true);
				segunda.getClass();
			}
		});
		btnSiguiente.setBounds(328, 231, 104, 23);
		add(btnSiguiente);

	}
}
