public class Main {
    public static void main(String[] args) {
    Estudiante E1= new Estudiante();
    Deportista D1= new Deportista();
 
        System.out.println(" ");    
        System.out.println(E1.obtenerInformacion());
        E1.mostrarResultados();
                
        System.out.println(" ");
        System.out.println(D1.obtenerInformacion());
        D1.mostrarResultados();
    }
}
    
