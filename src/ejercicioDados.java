public class ejercicioDados {
    public static void main(String[] args) {
      int caras = 6;
        int sum = 0;


      for(int i = 1; i<=caras;i++){
          for(int j = 1; j<=6; j++){
              sum = i+j;


              if(sum<8)
              System.out.println("Combinaciones: " + i + " y " + j + " = " + sum);


          }
          System.out.print("*********");


      }



    }
}
