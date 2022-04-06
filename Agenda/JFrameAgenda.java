import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameAgenda extends JFrame implements ActionListener {
    JButton btnRegistro, btnConsultar, btnBusqueda, btnModificacion, btnEliminar;

    public JFrameAgenda() {
        InicioMenu(); 
    }
    public void InicioMenu(){

        //Creando opcionessd
        setLayout(new GridLayout(7, 2));
        btnRegistro = new JButton("Registro");
        btnConsultar = new JButton("Consultar");
        btnBusqueda = new JButton("Busqueda");
        btnModificacion = new JButton("Modificacion");
        btnEliminar = new JButton("Eliminar");

        //Para la agregacion al frame
        add(btnRegistro);
        add(btnConsultar);
        add(btnBusqueda);
        add(btnModificacion);
        add(btnEliminar);
         

        //Para las opciones de la tabla
        btnRegistro.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnBusqueda.addActionListener(this);
        btnModificacion.addActionListener(this);
        btnEliminar.addActionListener(this);
        

        this.setBounds(500,100,475,335);
        this.setResizable(isMaximumSizeSet());//Esto hace que la opcion MAXIMIZAR se desactive
    	this.getContentPane().setBackground(Color.LIGHT_GRAY);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistro){
            new JFrameAltas();
        }
        
        if (e.getSource() == btnConsultar){
            if (ZPersona.Arrpersona.size() > 0){
                new JFrameConsultas();
            } else {
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (e.getSource() == btnBusqueda){
            if (ZPersona.Arrpersona.size() > 0){
                new JFrameBuscar();
            }else{
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (e.getSource() == btnModificacion){
            if (ZPersona.Arrpersona.size() > 0){
                new JFrameModificar();
            } else {
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (e.getSource() == btnEliminar){
            if (ZPersona.Arrpersona.size() > 0){
                new JFrameEliminar();
            } else {
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}