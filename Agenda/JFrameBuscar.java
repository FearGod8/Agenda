import javax.swing.*;

public class JFrameBuscar extends JFrame {
	PanelBuscar md = new PanelBuscar();

	public JFrameBuscar() {
		initComponents();
	}

	private void initComponents() {
		this.setBounds(500,100,475,300);
		setTitle("Busqueda de contacto");
		setResizable(false);
		setContentPane(md);
		setVisible(true);
	}
}