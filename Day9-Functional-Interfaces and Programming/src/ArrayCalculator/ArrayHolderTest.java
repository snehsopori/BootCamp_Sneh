package ArrayCalculator;

import org.junit.Test;

public class ArrayHolderTest {

        double[] numbers = new double[]{50, 20, 13.3, 52.2, 40.11, 24.111, 45.09, 2.9, 5.6, 9.832};

        ArrayHolder service = new ArrayHolder(numbers);

        @Test
        public void testForEach() {
                service.forEach(num -> System.out.println(num));
        }
        @Test
        public void testModify() {
                service.modify(num -> num * 5);
                service.forEach(num -> System.out.println(num));
        }
        @Test
        public void testDelete() {
                service.delete(num -> num < 20);
                service.forEach(n -> System.out.println(n));
        }
        @Test
        public void testFold() {
                System.out.println(service.fold((num1,num2) -> (num1 + num2)));
        }


}
