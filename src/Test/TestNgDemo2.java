package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo2 {
  @Test
  public void f() {
	  String s1 ="Selenium";
	  String s2="Selenius";
	  Assert.assertEquals(s1,s2);
	  
  }
}
