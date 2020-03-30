package util;

import token.NumberToken;

import java.util.Random;

public class TokenUtil {
    static Random random = new Random();

    public static NumberToken randomNumberToken(int upperBound) {
        int number = random.nextInt(upperBound) + 1;
        return new NumberToken(number);
    }


}
