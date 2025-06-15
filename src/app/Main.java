package app;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = new MathOperation() {
            @Override
            public int operate(int a, int b){
                return a+b;
            }
        };
        StringManipulator upperCased = str -> str.toUpperCase();
    }
}
