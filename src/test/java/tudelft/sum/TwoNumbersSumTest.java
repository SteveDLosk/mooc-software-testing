package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TwoNumbersSumTest {

    ArrayList<Integer> list1;
    ArrayList<Integer> list2;
    ArrayList<Integer> expected;
    ArrayList<Integer> result;
    TwoNumbersSum tns;

    @BeforeEach
    public void initialize() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        expected = new ArrayList<>();
        tns = new TwoNumbersSum();
    }
    @Test
    public void addTwoThreeDigitNumbers() {
        list1.add(1);
        list1.add(4);
        list1.add(7);

        list2.add(1);
        list2.add(4);
        list2.add(7);

        // should equal 294
        expected.add(2);
        expected.add(9);
        expected.add(4);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    @Test
    public void addTwoDigitAndThreeDigitNumber() {
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(4);
        list2.add(7);

        // should equal 181
        expected.add(1);
        expected.add(8);
        expected.add(1);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    @Test
    public void addThreeDigitAndTwoDigitNumber() {
        list1.add(5);
        list1.add(5);
        list1.add(5);

        list2.add(2);
        list2.add(7);

        // should equal 582
        expected.add(5);
        expected.add(8);
        expected.add(2);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    @Test
    public void addEmptyAndThreeDigitNumber() {

        list2.add(1);
        list2.add(4);
        list2.add(7);

        // should equal 181
        expected.add(1);
        expected.add(4);
        expected.add(7);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    @Test
    public void addThreeDigitAndEmpty() {
        list1.add(3);
        list1.add(4);
        list1.add(0);

        // should equal 340
        expected.add(3);
        expected.add(4);
        expected.add(0);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    @Test
    public void carryingIntoNewPlaceValueTest() {
        list1.add(9);
        list1.add(9);

        list2.add(9);
        list2.add(9);

        // should equal 198
        expected.add(1);
        expected.add(9);
        expected.add(8);

        boolean result = expected.equals(tns.addTwoNumbers(list1, list2));
        Assertions.assertTrue(result);

    }

    }
