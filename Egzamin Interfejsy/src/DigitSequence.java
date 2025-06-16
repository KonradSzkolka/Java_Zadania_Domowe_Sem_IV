// src/DigitSequence.java
public class DigitSequence implements IntSequence {
    private int n;
    public DigitSequence(int n) {
        this.n = n;
    }
    public boolean hasNext() {
        return n != 0;
    }
    public int next() {
        int digit = n % 10;
        n /= 10;
        return digit;
    }
}