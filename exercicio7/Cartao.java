package exercicio7;
public class Cartao {
 
    private int identificacao;
    private int saldoCredito;
    private int saldoTickets; 

    public Cartao(int identificacao) {
        this.identificacao = identificacao;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

        public int getidentificacao() {
            return identificacao;
        }
        
        public int getSaldoCredito() {
            return saldoCredito;
        }
        
        public int getSaldoTickets() {
            return saldoTickets;
        }

public void adicionarcreditos(int creditos){
    saldoCredito += creditos;
}

public void retirarCreditos(int creditos){
    saldoCredito += creditos;
}

public void adicionarTickets(int tickets) {
    saldoTickets += tickets;
}

public void subtrairTickets(int tickets) {
    saldoTickets -= tickets;
}
public void MostrarSaldos() {
    System.out.println("Cartão - " + identificacao);
    System.out.println("Saldo de crédito: " + saldoCredito);
    System.out.println("Saldo de tickets: " + saldoTickets);
}
}