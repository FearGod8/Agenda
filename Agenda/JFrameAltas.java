import javax.swing.*;
public class JFrameAltas extends JFrame {
   PanelAltas mostrar = new PanelAltas();
   
    public JFrameAltas(){
      initComponents();
   }
   
   private void initComponents(){
      this.setBounds(580,180,300,200);
      setSize(300, 200);
      setTitle("AGENDA");
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}
