package onboarding.problem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    public static int getMaxValFromList(List<Integer> allPossibleValues) {
        int biggest = Collections.max(allPossibleValues);
        return biggest;
    }
    public static List<Integer> getPossibleValFromPage(Page page) {
        List<Integer> possibleValues = Arrays.asList(
                getDigitSum(page.getLeftPage()), getDigitSum(page.getRightPage()),
                getDigitMult(page.getLeftPage()), getDigitMult(page.getRightPage()));
        return possibleValues;
    }
    public static int getDigitSum(int number) {
        int result = 0;
        while (number != 0) {
            result += (number % 10);
            number /= 10;
        }
        return result;
    }

    public static int getDigitMult(int number) {
        int result = 1;
        while (number != 0) {
            result *= (number % 10);
            number /= 10;
        }
        return result;
    }
}
