public class App {
    public static void main(String[] args) throws Exception {
        Vettore x = new Vettore(100, 50);
        for (int i=0; i<2000; i++)
            x.add("X" + i);
        System.out.println(x);
    }
}
