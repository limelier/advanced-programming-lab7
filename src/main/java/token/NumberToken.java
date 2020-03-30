package token;

public class NumberToken implements Token, Comparable<NumberToken> {
    private int number;

    public NumberToken(int number) {
        this.number = number;
    }

    public int getValue() {
        return number;
    }

    @Override
    public int compareTo(NumberToken o) {
        return Integer.compare(number, o.number);
    }
}
