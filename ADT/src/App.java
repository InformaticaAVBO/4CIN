
public class App {
    public static void main(String[] args) throws Exception {

        Coppia<String, Persona> p = new Coppia<>("Prof", new Persona("Sandro", "Gallo"));
        Coppia<String, Persona> q = new Coppia<>("Comandante", new Persona("Giuseppe", "Garibaldi"));
        System.out.println(p);
        System.out.println("Primo: " + q.getPrimo());
        System.out.println("Secondo: " + q.getSecondo());


/* 
        Vettore<Integer> serie = new Vettore<>();
        for (int i=1; i<=20; i++) serie.add(i);
        serie.setSeparator("\t");
        System.out.println(serie);
        System.out.println(serie.get(3));
        System.out.println(serie.get(3).getClass());

        Vettore<Persona> elenco = new Vettore<>(10, 5);
        elenco.add( new Persona("Mario", "Rossi"));
        elenco.add( new Persona("Maria", "Bianchi"));
        System.out.println(elenco);
*/
        
    }
}
