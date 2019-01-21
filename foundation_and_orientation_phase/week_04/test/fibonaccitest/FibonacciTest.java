package fibonaccitest;

import day04.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

  @Test
  public void calcFibNrAtGivenIndexTest() {

    Fibonacci newFib = new Fibonacci();

    assertEquals(0, newFib.calcFibNrAtGivenIndex(0));
    assertEquals(3, newFib.calcFibNrAtGivenIndex(4));
    assertEquals(55,newFib.calcFibNrAtGivenIndex(10));
    assertEquals(144,newFib.calcFibNrAtGivenIndex(12));

  }

}
