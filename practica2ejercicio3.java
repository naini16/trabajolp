import java.util.Scanner;

public class practica2ejercicio3 {
public static void main(String[] args) {
    Scanner scanner= new Scanner( System.in);
    String caracter;
    System.out.println(x: "Programa Java condicional String");
    System.out.println(x: "Tipee un caracter");
    caracter= scanner.nextLine();
    if (caracter.length() !=1){
        System.out.println(x: "el caracter no existe!");
    }else if ( (caracter. compareTo(anotherString: "A")>=0)&& (caracter.compareTo(anotherString:"Z")<= 0)) {
        System.out.println(x: "El caracter es una mayuscula");
    } else{
        System.out.println(x: "el caracter no es una mayuscula");

    }
    scanner.close();
 }
}

