import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Ingrese  su nombre ");
       String nombre=scanner.nextLine();
       // System.out.println("Su nombre es "+nombre);
       System.out.println(saludar(nombre));
    }
      
    public static String saludar(String nombre){
    return "hola "+nombre;
       

    }
}