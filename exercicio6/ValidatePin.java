package exercicio6;
import java.util.Scanner;

public class ValidatePin {
    
  public static void main(String[] args) {         
  int pin = 1234; 
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o PIN: ");
    int pindigitado = teclado.nextInt();
    
    while (pindigitado != pin) {
      System.out.println("PIN incorreto. Tente novamente.");
      System.out.print("Digite o PIN: ");
      pindigitado = teclado.nextInt();
      }
    teclado.close();

    System.out.println("PIN correto. Acesso concedido.");
    }
  }