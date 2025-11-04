public class Squadra {
    
    private String nome;
    private int partite, vinte, pareggiate, perse, punti;

    public Squadra( String nome, int punti ) {
        this.nome = nome;
        this.punti = punti;
    }

    @Override
    public String toString() {
        return "Squadra [nome=" + nome + ", partite=" + partite + ", vinte=" + vinte + ", pareggiate=" + pareggiate
                + ", perse=" + perse + ", punti=" + punti + "]";
    }}
