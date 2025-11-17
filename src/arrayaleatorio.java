import java.util.Scanner;
public class arrayaleatorio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int elementos = 0;
        System.out.println("Introduce el número de elementos que hay en el array");
        elementos = sc.nextInt();

        System.out.println("Pon un valor mínimo");
        double min = sc.nextInt();

        System.out.println("Pon un máximo");
        double max = sc.nextInt();
        double[] numeros = new double[elementos];
            for(int i = 0; i < elementos; i++){
                numeros[i] = Math.random() * (max - min) + min;
            }
        System.out.println("\nContenido del array: ");
            for(int i = 0; i < numeros.length; i++){
                System.out.println("posicion " + i + " contiene: " + numeros[i]);
            }









        
    }
}
