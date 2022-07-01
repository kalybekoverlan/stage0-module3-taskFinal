package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds;
        int tens;
        int ones;
        ones = number / 100;
        tens = number % 100 / 10;
        hundreds = number % 100 % 10;
        System.out.println("" + hundreds + tens + ones);
    }
}
