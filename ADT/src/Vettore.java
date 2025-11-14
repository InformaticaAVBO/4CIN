
public class Vettore<T> {

    T[] v;
    int n, start, delta;
    String separator;

    public Vettore() {
        this(10,5);
    }

    @SuppressWarnings("unchecked")
    public Vettore( int start, int delta ) {
        if (start<=0) start=10;
        if (delta<=10) delta=10;
        v = (T[]) new Object[start];
        this.start = start;
        this.delta = delta;
        n = 0;
        separator = "\n";
    }

    // @SuppressWarnings("unchecked")
    @SuppressWarnings("unchecked")
    public void add( T s ) {
        if (v.length==n) {
            T[] nuovo_v = (T[]) new Object[v.length + delta];
            for (int i=0; i<n; i++) nuovo_v[i]=v[i];
            v = nuovo_v;
        }
        v[n++] = s;
    }

    public T get( int i ) {
        if (i<0 || i>=v.length) return null;
        return v[i];
    }

    public void setSeparator( String sep ) {
        this.separator = sep;
    }

    @Override
    public String toString() {
        String s = "Sono un Vettore grande " + v.length + ", di cui " + n + " elementi occupati:\n";
        for (int i=0; i<n; i++) s += v[i] + separator;
        return s;
    }

}
