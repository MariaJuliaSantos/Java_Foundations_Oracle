package exercicio7;
public class Terminal {
    
    private Cartao cartao;
    private CategoriaPremio[] categoriasPremio;

    public Terminal(){
        cartao = null;
        categoriasPremio = new CategoriaPremio[3];
        categoriasPremio[0] = new CategoriaPremio("Categoria 1", 5, 10);
        categoriasPremio[1] = new CategoriaPremio("Categoria 2", 10, 5);
        categoriasPremio[2] = new CategoriaPremio("Categoria 3", 15, 3);
    
    }
    public void inserirCartao(Cartao cartao) {
        this.cartao = cartao;
        System.out.println("Cartão - " + cartao.getidentificacao() + " inserido no terminal.");
    }

    public void carregarCreditos(int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarTickets(creditos);
        System.out.println("Cartão - " + cartao.getidentificacao() + " - Créditos carregados: " + creditos);
        cartao.MostrarSaldos();
    }

public void transferSaldo(Cartao cartaoorigem, Cartao cartaodestino){
    int creditosTransferidos = cartaoorigem.getSaldoCredito();
        int ticketsTransferidos = cartaodestino.getSaldoTickets();

        cartaoorigem.retirarCreditos(creditosTransferidos);
        cartaoorigem.subtrairTickets(ticketsTransferidos);
        cartaodestino.adicionarcreditos(creditosTransferidos);
        cartaodestino.adicionarTickets(ticketsTransferidos);
    
        System.out.println("Transferência de saldo do Cartão - " + cartaoorigem.getidentificacao() +
        " para o Cartão - " + cartaodestino.getidentificacao());
    System.out.println("Créditos transferidos: " + creditosTransferidos);
    System.out.println("Tíquetes transferidos: " + ticketsTransferidos);
    System.out.println();
    
    cartaoorigem.MostrarSaldos();
    cartaodestino.MostrarSaldos();
    }
    
    public void trocarTicketsPorPremios(int categoria) {
        if (categoria >= 0 && categoria < categoriasPremio.length) {
            CategoriaPremio categoriaPremio = categoriasPremio[categoria];
            categoriaPremio.solicitarPremio(cartao);
        } else {
            System.out.println("Categoria de prêmio inválida.");
        }
    }  
    public void jogandoJogo(Jogo jogo) {
        jogo.jogandoJogo(cartao);
    }
}