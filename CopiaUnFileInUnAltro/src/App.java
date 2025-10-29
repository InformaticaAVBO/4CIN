import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {

    public void copyFile( String fileIn, String fileOut ) {
        File f = new File(fileIn);
        Scanner leggiFile = new Scanner(f);
        FileWriter scriviFile = new FileWriter(fileOut);
        // legge riga per riga e le scrive in output
        while (leggiFile.hasNextLine()) {
            String s = leggi.nextLine();
            scriviFile.write(s);
        }
        leggiFile.close();
        scriviFile.close();
    }


    public static void main(String[] args) throws Exception {

        // chiede i nomi dei file all'utente
        Scanner leggiDaTastiera = new Scanner(System.in);
        System.out.print("Nome del file di input: ");
        String inputFilename = leggiDleggiDaTastiera.nextLine();
        System.out.print("Nome del file di output: ");
        String outputFilename = leggiDleggiDaTastiera.nextLine();
        leggiDaTastiera.close();

        // copia input in output
        copyFile( inputFilename, outputFilename);



        // prima scrivo dentro un file
        /*
        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i=0; i<100; i++) {
            myWriter.write("Questa è una prima frase scritta in un file\n");
        }
        myWriter.close();
        System.out.println("Ok, ho scritto sul file!");
        */

    }
}
