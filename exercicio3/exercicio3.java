package exercicio3;
import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome= teclado.nextLine();

        System.out.println("Informe o restaurante que fez a reserva:");
        String restaurante= teclado.nextLine();

        System.out.println("Informe a hora da reserva");
        int hora= teclado.nextInt();
    
        System.out.println("Informe o valor da refeição:");
        double valor = teclado.nextDouble();

double valorfinal = valor + (valor*0.1);
int horafinal = hora + 1;

teclado.close();

System.out.println("Um dia " + nome + " fez uma reserva no restaurante " + restaurante + " ás " + hora + " horas, ao chegar lá o restaurante estava lotado e acabou tendo que esperar mais uma hora até conseguir pegar alguma mesa." );
System.out.println("Por causa da confusão só conseguiu comer ás " + horafinal + " horas, " + nome + " pediu um prato que custou R$ " + valor + " e precisou pagar os 10%, pagando ao todo: R$ " + valorfinal );
 }
}