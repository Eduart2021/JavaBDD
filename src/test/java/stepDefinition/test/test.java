package stepDefinition.test;

import app.methods;
import org.junit.Assert;

public class test {

    public static boolean testing(int e1, int e2){
      int addition =  methods.respond(e1,e2);
      Assert.assertEquals("Assertion formula not true", 7, addition);
      return true;
    }

}
