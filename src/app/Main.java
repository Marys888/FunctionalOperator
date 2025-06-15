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

        getOutput("Сума чисел: " + sum.operate(3,14));
        getOutput("У верхньому регістрі: " + upperCased.manipulate(("to become a programmer, you should program!")));
        getOutput("Скільки слів у верхньому регістрі: " + counter.apply("to become a Programmer, you should Program!"));
        getOutput("Випадкове число в діапазоні 1-100: " + randomSupplier.get());


    }
    public static void getOutput(String output){
        System.out.println(output);
    }
}
