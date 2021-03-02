import javax.swing.*;
import java.awt.*;

public class JFrameDatosAgenda extends JFrame
{
   PanelDatosAgenda pdB = new PanelDatosAgenda();
   public JFrameDatosAgenda()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     setSize(300,400);
     setTitle("Datos Personales");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdB);
     setResizable(false);
     setVisible(true);
   }
}