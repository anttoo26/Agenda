import java.util.*;
import java.util.Scanner;
public class ManejoPersonaAgenda
{
   static ArrayList<PersonaAgenda> Arrperson = new ArrayList<PersonaAgenda>(); 
   private PersonaAgenda objPersona;
   
   public ManejoPersonaAgenda()
   {  }
   
   public void agregar(String nom, String ap, String tel, String correo, String fecha)
   {
    objPersona = new PersonaAgenda();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(correo);
    objPersona.setFechaC(fecha);
    Arrperson.add(objPersona);//Agrega el objeto al arraylist
   }
   public ArrayList datos()
   {
      return Arrperson;
   }
   public void mostrar()
   {
      System.out.println("... Personas en la Agenda ...");
      Iterator<PersonaAgenda> itrPersona = Arrperson.iterator();
      while(itrPersona.hasNext())
      {
	      PersonaAgenda persona = itrPersona.next();
	      System.out.println(" "+ persona.getNombre() + "  "
         + persona.getApellidos() + "  "
         + persona.getTelefono() + "  "
         + persona.getCorreo()+" "+ persona.getFechaC());
      }
   }
}