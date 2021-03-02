import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MostrarDatosAgenda extends JPanel
{
   JTable tabla;
   JScrollPane scroll = new JScrollPane();
   ManejoPersonaAgenda mp = new ManejoPersonaAgenda();
   ArrayList<PersonaAgenda> datosPer = new ArrayList<PersonaAgenda>();
   
   public MostrarDatosAgenda()
   {
      datosPer = mp.datos();
      String titulos[] = {"Nombre", "Apellidos", "Telefono", "Correo electrónico","Fecha de Cumpleaños"};
      String info[][] = obtenerDatos();
      
      setLayout(new GridLayout(1,1));
      
      tabla = new JTable(info, titulos);
      tabla.setEnabled(false);
      tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      scroll.setViewportView(tabla);
      add(scroll);
   }
   private String[][] obtenerDatos()
   {
      int x=0;
      String informacion[][] = new String[datosPer.size()][5];
      Iterator<PersonaAgenda> itrPersona = datosPer.iterator();
      while(itrPersona.hasNext()){
            PersonaAgenda persona = itrPersona.next();
            informacion[x][0] = persona.getNombre();
            informacion[x][1] = persona.getApellidos();
            informacion[x][2] = persona.getTelefono();
            informacion[x][3] = persona.getCorreo();
            informacion[x][4] = persona.getFechaC();
            x++;
           }
      return informacion; 
   }
}