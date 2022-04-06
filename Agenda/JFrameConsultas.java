import javax.swing.*;

public class JFrameConsultas extends JFrame {
	PanelConsultas md = new PanelConsultas();

	public JFrameConsultas() {
		initComponents();
	}

	private void initComponents() {
		this.setBounds(500,100,475,300);
		setTitle("Contactos ya Registrados");
		setResizable(false);
		setContentPane(md);
		setVisible(true);
	}
}