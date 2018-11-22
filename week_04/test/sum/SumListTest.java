package sum;

import day04.sum.SumList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumListTest {

  @Test
  public void sumTestWithEmptyList() {
    SumList testList3 = new SumList();
    assertEquals(0, testList3.sum(testList3.listToSum));
  }

  @Test
  public void sumTestWithOneValues() {
    SumList testList1 = new SumList();
    testList1.listToSum.add(1);
    assertEquals(1,testList1.sum(testList1.listToSum));
  }

  @Test
  public void sumTestWithMoreValues() {
    SumList testList2 = new SumList();
    testList2.listToSum.add(1);
    testList2.listToSum.add(4);
    testList2.listToSum.add(6);
    testList2.listToSum.add(8);
    assertEquals(19,testList2.sum(testList2.listToSum));
  }

}
