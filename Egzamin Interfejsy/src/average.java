// src/SquareSequence.java
class SquareSequence implements IntSequence {
    private int i = 0;
    public boolean hasNext() { return true; }
    public int next() {
        i++;
        return i * i;
    }
}
