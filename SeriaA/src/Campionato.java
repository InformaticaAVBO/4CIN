import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {

    Squadra[] elenco;

    public Campionato( String fname ) throws FileNotFoundException {
        elenco = new Squadra[20];
        File f = new File(fname);
        Scanner leggi = new Scanner(f);

        int i = 0;
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            elenco[i] = new Squadra( ss[0], Integer.parseInt(ss[1]) );
            if (++i>=20) break;
        }
        leggi.close();
    }

    public Squadra getSquadra(int i) {
        return elenco[i];
    }

    public Squadra getSquadraByName( String nome ) {
        
    }
}
