import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int personas = 5;
        int sum = 0;
        int counter = 0;
        int promedio = 0;
        int compras = 0;


        for (int i = 1; i <= personas; i++) {
            boolean flag = true;
            while (flag) {
                System.out.println("Ingrese sus compras");
                compras = sc.nextInt();
                sum += compras;
                if (compras != 0) {
                    counter++;
                }
                    if (compras == 0) {
                        promedio = sum / counter;
                        System.out.println(promedio);
                        flag = false;
                    }

                }
            }

        }
    }
