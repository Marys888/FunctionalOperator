package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = new MathOperation() {
            @Override
            public int operate(int a, int b){
                return a+b;
            }
        };
        StringManipulator upperCased = str -> str.toUpperCase();
        Function<String, Integer> counter = StringListProcessor::countUpperCase;
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
    }
}
