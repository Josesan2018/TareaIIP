    public class Estudiante extends Persona{
    
      public Estudiante() { 
       setNombre("Edwin Rodil");
       setCuenta("201310060178");
       setApellidos("Lara Mejia");
       setEdad(26);
       setCarrera("Ingenieria Industrial");
       setClasificacion("Estudiante");
       
    }
    @Override
    public String obtenerInformacion() {
        return ("Informacion relacionada a Estudiante");
    }
}
