package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum;
        int first, second, third, fourth;
        first = number / 1000;
        second = number % 1000 / 100;
        third = number % 1000 % 100 / 10;
        fourth = number % 1000 % 100 % 10;
        sum = first + second + third + fourth;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator d = new DigitsSumCalculator();
        d.calculateSum(4567);
    }
}
