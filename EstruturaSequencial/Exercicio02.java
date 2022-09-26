import java.util.InputMismatchException;
import java.util.Scanner;

/*Faça um Programa que peça um número 
e então mostre a mensagem O número informado foi [número].*/


public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String numero;
        boolean continuaLoop = true;
        
        do{
          try{
            System.out.print(" informe um numero : ");
            numero = sc.next().replace(",",".");
            System.out.printf(" O numero informado foi %.2f " , Double.parseDouble(numero));
            continuaLoop = false;
          }catch(InputMismatchException e){
            System.out.println(" informe um numero Valido ");         
          }catch(NumberFormatException e){
            System.out.println(" informe um numero Valido ");
          }

        }while(continuaLoop);
        System.out.print("Fim do progama .");
        sc.close();
    }
}
