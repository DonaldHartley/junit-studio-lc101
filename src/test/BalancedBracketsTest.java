package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;


public class BalancedBracketsTest {
  
  @Test
  public void emptyTest() { assertTrue(BalancedBrackets.hasBalancedBrackets("")); }
  @Test
  public void noneTest() { assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode Rocks!")); }
  @Test
  public void simpleBalancedTest () { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }
  @Test
  public void complexBalancedTest () { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]Rocks!")); }
  @Test
  public void simpleUnBalancedTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("[")); }
  @Test
  public void complexUnBalancedTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code Rocks!")); }
  @Test
  public void simpleOutOfOrderTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }
  @Test
  public void complexOutOfOrderTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[Rocks!")); }
  @Test
  public void simpleTooManyOpenTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]")); }
  @Test
  public void complexTooManyOpenTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code[Rocks]!")); }
  @Test
  public void simpleTooManyClosedTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("[]]")); }
  @Test
  public void complexTooManyClosedTest () { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code]Rocks]!")); }
  
}
