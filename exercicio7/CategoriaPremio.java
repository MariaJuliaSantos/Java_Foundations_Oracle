package exercicio7;
public class CategoriaPremio {
    
private String nome;
private int ticketsNecessarios;
private int qntdisponivel;

public CategoriaPremio (String nome, int  ticketsNecessarios, int qntdisponivel ){
    this.nome = nome;
    this.ticketsNecessarios = ticketsNecessarios;
    this.qntdisponivel = qntdisponivel;
}

public boolean SolicitarPremio(Cartao cartao) {
    return cartao.getSaldoTickets() >= ticketsNecessarios && qntdisponivel > 0;
}

public void solicitarPremio(Cartao cartao) {
    if (SolicitarPremio(cartao)) {
        cartao.subtrairTickets(ticketsNecessarios);
        qntdisponivel--;
        
        System.out.println("Cartão -" + cartao.getidentificacao() + " - Solicitação de prêmio (" + nome + ")");
        System.out.println("Prêmio concedido! Restam " + qntdisponivel + " prêmios dessa categoria.");
    }
else {
    System.out.println("cartão - "+ cartao.getidentificacao());
    System.out.println("Tickets insuficientes ou premio esgotado");
}
}
}