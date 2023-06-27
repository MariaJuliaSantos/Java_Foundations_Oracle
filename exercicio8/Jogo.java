package exercicio8;

public class Jogo {
    private int placartime1;
    private int placartime2;
    private double temperatura;
    private int ID;
    private Equipe time1;
    private Equipe time2;

    private static int _ID = 0;

    private static int GeraID() {
        _ID++;
        return _ID;
    }

    public Jogo() {

    }

    public Jogo(Equipe equipe1, Equipe equipe2, int p1, int p2, double temperatura) {
        this.time1 = equipe1;
        this.time2 = equipe2;
        this.placartime1 = p1;
        this.placartime2 = p2;
        this.temperatura = temperatura;
        this.ID = Jogo.GeraID();
    }
// classificação 
    public void atualizarTabela() {
        time1.setGolsMarcados(placartime1);
        time1.setGolsSofridos(placartime2);
        time2.setGolsMarcados(placartime2);
        time2.setGolsSofridos(placartime1);
    
        if (placartime1 > placartime2) {
            time1.setPontos(time1.getPontos() + 3);
        } else if (placartime1 < placartime2) {
            time2.setPontos(time2.getPontos() + 3);
        } else {
            time1.setPontos(time1.getPontos() + 1);
            time2.setPontos(time2.getPontos() + 1);
        }
    }    

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getplacartime1() {
        return placartime1;
    }

    public void setplacartime1(int placartime1) {
        placartime1 = placartime1;
    }

    public int getplacartime2() {
        return placartime2;
    }

    public void setplacartime2(int placartime2) {
        placartime2 = placartime2;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Equipe getTime1() {
        return time1;
    }

    public void setTime1(Equipe time1) {
        this.time1 = time1;
    }

    public Equipe getTime2() {
        return time2;
    }

    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }
}