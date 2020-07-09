import java.util.Random;
import java.util.Scanner;

public class adivinanza {
    public static void main(String[] args) {
        System.out.println("Seleccionando un número al azar...");
        int num = new Random().nextInt(200);

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.println("Adivina el número secreto");
            int y = sc.nextInt();

            if(num==y){
                System.out.println("Felicidades, ¡Ganaste!");
                break;
            }
            else if (y > num){
                System.out.println("El número secreto es más pequeño");
            }
            else{
                System.out.println("El número secreto es mayor");
            }
        }
        System.out.println("Número secreto: " + num);

    }
}
