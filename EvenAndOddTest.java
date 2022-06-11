package Lab2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class EvenAndOddTest {
        @Test
        public void isEven() {
            EvenAndOdd l2 = new EvenAndOdd();
            assertEquals("even", l2.Even_or_Odd(4));
            assertEquals("odd", l2.Even_or_Odd(9));
        }

        int[] array = new int[]{1, 2, 3, 58, 47, 229, 40};

        @Test
        public void shouldBeMaxValue() {
            int maxValue = EvenAndOdd.getMaxValue(array);
            assert (maxValue == 229);
        }

        @Test
        public void shouldBeMinValue() {
            int minValue = EvenAndOdd.getMinValue(array);
            assert (minValue == 1);
        }

        @Test(expected = IllegalArgumentException.class)
        public void shouldBeIllegalArgumentException() {
            int[] emptyArray = new int[]{};
            int maxValue = EvenAndOdd.getMaxValue(emptyArray);
            int minValue = EvenAndOdd.getMinValue(emptyArray);
        }

    }