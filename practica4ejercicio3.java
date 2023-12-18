import java.util.Scanner;

public class practica4ejercicio3 {
    private Scanner scanner;
    private String nombre;
    private int edad;

    public void inicializar (){
        scanner=new Scanner (System.in);
        System.out.print ("ingrese nombre");
        nombre= scanner.nextLine();
        System.out.print("Digite edad");
        edad= scanner.nextLine();

    }
    public void imprimir(){
        System.out.println("nombre ingresado= "+nombre);
        System.out.println("edad digitado="+ edad);

    }
    public void buscarMayor(){
        if (edad >= 18){
            System.out.println(nombre + "es mayor de edad");
        } else{
            System.out.println(nombre + "es mayor de edad");
        }
     }
     public static void main(String[] args) {
        Persona persona=new Persona ();
        persona.inicializar();
        persona.imprimir();
        persona.buscarMayor();
     }
    }

