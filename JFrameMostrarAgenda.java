import javax.swing.*;
import java.awt.*;

public class JFrameMostrarAgenda extends JFrame
{
   MostrarDatosAgenda pdB = new MostrarDatosAgenda();
   
   public JFrameMostrarAgenda()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     setSize(300,200);
     setTitle("Agenda");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdB);
     setResizable(false);
     setVisible(true);
   }
}