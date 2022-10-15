public class Main {

    public static void main(String[] args) {

        Ints calculator = new IntsCalculator();
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator.sum(10, 22));
        System.out.println(calculator.mult(3, 10));
        System.out.println(calculator.pow(2, 10));
    }
}
