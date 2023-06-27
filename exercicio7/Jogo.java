package exercicio7;
import java.util.Random;
public class Jogo {
    
    private String nome;
    private int creditosNecessarios;
    private int ticketsGanhos;
    
    public Jogo(String nome, int creditosNecessarios, int ticketsGanhos) {
        this.nome = nome;
        this.creditosNecessarios = creditosNecessarios;
        this.ticketsGanhos = ticketsGanhos;
    }

public void jogandoJogo (Cartao cartao){

if(cartao.getSaldoCredito()>= creditosNecessarios){
    cartao.retirarCreditos(creditosNecessarios);
int tickets = gerarNumero();
cartao.adicionarTickets(tickets);
System.out.printf("Cartão numero - %d\n",cartao.getidentificacao());
System.out.printf("Tickets - %d",tickets);
}
else
System.out.printf("Cartão numero - %d\n",cartao.getidentificacao());
System.out.println("Créditos insuficientes");
}

private int gerarNumero() {
    Random random = new Random();
    return Math.abs(random.nextInt());
}






}



   
