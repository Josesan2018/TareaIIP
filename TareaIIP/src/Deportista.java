public class Deportista extends Persona{
    private String Deporte;
       
    public Deportista() {
       setNombre("Jose");
       setCuenta("201610060108");
       setApellidos("Santos Garcia");
       setEdad(25);
       setCarrera("Ingenieria en Computacion");
       setClasificacion("Deportista");
}

    @Override
    public String obtenerInformacion() {
        return ("Informacion relacionada al Deportista");
    }
    }