public class App {


    1) stampa classifica
    2) calcola punteggi
    3) ordina squadre
    4) trova squadra


    
    public static void main(String[] args) throws Exception {

        Campionato seriea = new Campionato("data/seriea.csv");

        System.out.println(seriea.getSquadra(0));
    }
}
