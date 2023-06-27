package exercicio5;
import java.util.Scanner;

public class SwitchTrafficLightChecker {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

System.out.println("Digite a cor atual");
int CorAtual = teclado.nextInt();
teclado.close();

switch(CorAtual) {
    case 1: System.out.println("Verde");
            break;
    case 2: System.out.println("Amarelo");
            break;
    case 3: System.out.println("Vermelho");
            break;
            default: System.out.println("Cor inválida!");

}
    }
}