import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Kontener01 k1 = new Kontener01(2);
        k1.set(0, 100);
        k1.set(2, 200);
        System.out.println(k1.get(0));
        System.out.println(k1.get(2));

        Kontener02 k2 = new Kontener02(1);
        k2.set(0, "tekst");
        k2.set(2, 3.14);
        System.out.println(k2.get(0));
        System.out.println(k2.get(2));

        Kontener03 k3 = new Kontener03(2);
        k3.set(0, "Ala");
        k3.set(1, 123);
        k3.set(2, true);
        for (Object el : k3) {
            System.out.println(el);
        }
    }
}
// nie można używać for each, ponieważ Kontener01 nie implementuje Iterable
class Kontener01 {
    private int[] tab;

    public Kontener01(int size) {
        tab = new int[size];
    }

    public int get(int index) {
        if (index < 0 || index >= tab.length) throw new IndexOutOfBoundsException();
        return tab[index];
    }

    public void set(int index, int value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index >= tab.length) resize(index + 1);
        tab[index] = value;
    }

    private void resize(int newSize) {
        int[] newTab = new int[newSize];
        for (int i = 0; i < tab.length; i++) newTab[i] = tab[i];
        tab = newTab;
    }
}
//nie można używać for each, ponieważ Kontener02 nie implementuje Iterable
class Kontener02 {
    private Object[] tab;

    public Kontener02(int size) {
        tab = new Object[size];
    }

    public Object get(int index) {
        if (index < 0 || index >= tab.length) throw new IndexOutOfBoundsException();
        return tab[index];
    }

    public void set(int index, Object value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index >= tab.length) resize(index + 1);
        tab[index] = value;
    }

    private void resize(int newSize) {
        Object[] newTab = new Object[newSize];
        for (int i = 0; i < tab.length; i++) newTab[i] = tab[i];
        tab = newTab;
    }
}
//tylko tutaj można bezpośrednio używać for each, ponieważ Kontener03 implementuje Iterable<Object>
class Kontener03 implements Iterable<Object> {
    private Object[] tab;

    public Kontener03(int size) {
        tab = new Object[size];
    }

    public Object get(int index) {
        if (index < 0 || index >= tab.length) throw new IndexOutOfBoundsException();
        return tab[index];
    }

    public void set(int index, Object value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index >= tab.length) resize(index + 1);
        tab[index] = value;
    }

    private void resize(int newSize) {
        Object[] newTab = new Object[newSize];
        for (int i = 0; i < tab.length; i++) newTab[i] = tab[i];
        tab = newTab;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < tab.length && tab[position] != null;
            }

            @Override
            public Object next() {
                return tab[position++];
            }
        };
    }
}
