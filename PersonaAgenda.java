public class PersonaAgenda {
   private String Nombre;
   private String Apellidos;
   private String Telefono;
   private String Correo;
   private String FechaC;

   public String getNombre(){
    return Nombre;
   }
   
   public void setNombre(String nombre){
       this.Nombre = nombre;
   }
   public String getApellidos(){
    return Apellidos;
   }
    
   public void setApellidos(String apellidos){
       this.Apellidos = apellidos;
   }
   
   public String getTelefono(){
   return Telefono;
   }
    
   public void setTelefono(String telefono){
       this.Telefono = telefono;
   }
   
   public String getCorreo(){
    return Correo;
   }
    
   public void setCorreo(String correo){
       this.Correo = correo;
   }
   
   public String getFechaC(){
    return FechaC;
   }
    
   public void setFechaC(String fecha){
       this.FechaC = fecha;
   }
}