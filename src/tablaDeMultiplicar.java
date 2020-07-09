import java.util.Scanner;

public class tablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=9;
        int i;
        int j;


        for(i = 3; i<= num; i++){
            for(j=1; j<=12;j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
