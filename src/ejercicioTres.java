import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int personas = 5;
        int sum = 0;
        int counter = 0;

        for(int i = 1; i<=personas; i++) {
            boolean flag = true;
            while (flag) {
                System.out.println("Ingrese sus compras");
                int compras = sc.nextInt();
                sum += compras;

                if (compras != 0) {
                    counter++;

                } else if (compras == 0) {
                    flag = false;
                }

                if(i == personas && compras ==0){
                    System.out.println("El total de las compras es "+ sum/counter);
                    System.exit(-1);
            }


        }
        }
    }

}

