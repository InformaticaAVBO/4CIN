public class Vettore {

    String[] v;
    int n, delta;

    public Vettore( int dim, int delta ) {
        v = new String[dim];
        this.delta = delta;
        n = 0;
    }

    public void add( String s ) {
        if (n>=v.length) {
            String[] v2 = new String[v.length + delta];
            for (int i=0; i<n; i++) v2[i]=v[i];
            v = v2;
        }
        v[n++] = s;
    }

    public String toString() {
        String s = "Sono dimensionato a " + v.length + ", ma contengo " + n + " valori, che sono questi:\n";
        for (int i=0; i<n; i++)
            s += v[i] + "\t";
        return s;
    }

}
