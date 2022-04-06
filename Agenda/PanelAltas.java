import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAltas extends JPanel implements ActionListener {
	private JButton btnGuardar, btnMostrar;
	private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreo, txtFechaN;

	ZPersona mpa = new ZPersona();

	public PanelAltas() {
		setLayout(new GridLayout(7, 2));
		JLabel lblNombre = new JLabel("Nombre(s): ", JLabel.RIGHT);
		txtNombre = new JTextField(30);
		add(lblNombre);
		add(txtNombre);

		JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
		txtApellidos = new JTextField(30);
		add(lblApellidos);
		add(txtApellidos);

		JLabel lblTelefono = new JLabel("Numero de Telefono: ", JLabel.RIGHT);
		txtTelefono = new JTextField(15);
		add(lblTelefono);
		add(txtTelefono);

		JLabel lblCorreo = new JLabel("Correo Electronico: ", JLabel.RIGHT);
		txtCorreo = new JTextField(30);
		add(lblCorreo);
		add(txtCorreo);

		JLabel lblFechaN = new JLabel("Fecha de cumpleaños: (MM/AA)", JLabel.RIGHT);
		txtFechaN = new JTextField(30);
		add(lblFechaN);
		add(txtFechaN);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);

		add(btnGuardar);
		add(btnMostrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			if (txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes colocar por lo menos el nombre",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtNombre.requestFocus();
			} else if (txtTelefono.getText() == null || txtTelefono.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes capturar su numero de telefono",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtTelefono.requestFocus();
			} else {
				mpa.agregar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(),
						txtCorreo.getText(), txtFechaN.getText());
				JOptionPane.showMessageDialog(null, "Se guardaran los datossss",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtNombre.setText(null);
				txtApellidos.setText(null);
				txtTelefono.setText(null);
				txtCorreo.setText(null);
				txtFechaN.setText(null);
				txtNombre.requestFocus();
			}

		}
		if (e.getSource() == btnMostrar) {
			new JFrameConsultas();
		}
	}
}
