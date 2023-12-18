import java.util.Scanner;

/**
 * practica2ejercicio2
 */
public class practica2ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        // entrada
        System.out.print (s: "Digite primer numero: ");
        num1= scanner.nextInt();
        System.out.print(s: "Digite segundo numero:");
        num2= scanner.nextInt();
        //conditional
        if (num1 > num2){
            System.out.print(s:"Primer numero es mayor");
         } else if (num2> num1){
            System.out.println(s: "Segundo numero es mayor");
         }else{
            System.out.println(s: "Son iguales");
         }
         scanner.close();
          }
     }

    