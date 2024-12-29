import java.util.Scanner;

// validar se o numero é par ou impar

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("o numero "+ numero + " é par.");

        }else{
            System.out.println(" o numero " + numero + " é impar");
        }

        scanner.close();




    }
}