package LW4;

public class Ex7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException("арифметическая ошибка");
            } catch (ArithmeticException ex) {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
