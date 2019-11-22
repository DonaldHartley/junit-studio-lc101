package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {
  
  @Test
  public void emptyTest(){
    int[] array = new int[] {};
  
    assertEquals(BonusBinarySearch.binarySearch(array,1), -1);
  }
  
  @Test
  public void notInListTest(){
    int[] array = new int[] {0,2,3,4,5};
    
    int returnValue = BonusBinarySearch.binarySearch(array,1);
  
    assertEquals(returnValue, -1);
  }
  
}
