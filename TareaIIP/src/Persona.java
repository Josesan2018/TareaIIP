public abstract class Persona {
    abstract String obtenerInformacion();
    
    private String Cuenta;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Carrera;
    private String Clasificacion;

    public Persona() {
       setNombre("Hanan Baruc");
       setCuenta("201310060178");
       setApellidos("Tinoco Fiallos");
       setEdad(22);
       setCarrera("Ingenieria Electronica");
       setClasificacion("Persona");
    }
    //establecer y obtener 
    
    public void setNombre(String Nombre){
    this.Nombre = Nombre; }
    public String getNombre() {
    return Nombre;}
    public String getCuenta() {
    return Cuenta;}
    public void setCuenta(String Cuenta) {
    this.Cuenta = Cuenta;}
    public String getApellidos() {
    return Apellidos;}
    public void setApellidos(String Apellidos) {
    this.Apellidos = Apellidos;}
    public int getEdad() {
    return Edad;}
    public void setEdad(int Edad) {
    this.Edad = Edad;}
    public String getCarrera() {
    return Carrera;}
    public void setCarrera(String Carrera) {
    this.Carrera = Carrera;}
    public String getClasificacion() {
    return Clasificacion;}
    public void setClasificacion(String Clasificacion) {
    this.Clasificacion = Clasificacion;}
            
    
   public void mostrarResultados (){
    System.out.println("Nombre           : " + Nombre);
    System.out.println("Apellidos        : " + Apellidos);
    System.out.println("Edad             : " + Edad);
    System.out.println("Carrera          : " + Carrera);
    System.out.println("Cuenta           : " + Cuenta);
    System.out.println("Clasificacion    : " + Clasificacion);
        }
}