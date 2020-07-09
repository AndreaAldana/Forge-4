import java.util.Scanner;

public class ejercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int personas = 5;
        int sum = 0;


        for(int i = 1; i<=personas; i++){
            boolean flag = true;
            while(flag){
                System.out.println("Ingrese sus compras");
                int compras = sc.nextInt();
                sum += compras;
                if(compras==0){
                    flag = false;
                }

            }

            if(i == personas){
                System.out.println("El total de las compras es "+ sum);
            }
        }

    }
}