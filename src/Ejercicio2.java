import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int numero=scanner.nextInt();
        int resultado=contadordigitos(numero);
        System.out.println(resultado);
    }
    public static int contadordigitos(int numero){
        int cifras=0;
        while(numero!=0){
            numero /=10;
            cifras++;
        }      
         return cifras;
       }
}   
