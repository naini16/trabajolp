

import java.util.Scanner;
/**
 * practica4ejercicio2
 * 
 * @author JNAINI AMIRI
 */
public class practica4ejercicio2 {

    public static void main(String[]args){
        //variables
        Scanner scanner=new Scanner (System.in);
        String usario;
        String usaurioCorrecto= "admin";
        int pin;
        int pinCorrecto=1234567;
        int Correcto= 0;
        System.out.println(x:"acceso al sistema");
        While (correcto <= 0){
        // entradas
        System.out.println(s:"ingrese usuario");
        usuario= scanner.nextLine();
        System.out.println(s: "ingrese pin");
        pin= scanner.nextLine();
        //verificar
        if ((usuario.equals(usariocorrecto))&& (pin== pincorrecto)){
            correcto=1;
        }
      System.out.println(x:"Usuario y/o pin incorrecto");
      scanner.nextLine();//reset string
      }
      System.out.println(x:"Bienvenido al sistema");
      scanner.close();
    }
}
