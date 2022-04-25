package stepDefinition.test;

import app.methods;
import org.junit.Assert;

public class test {

    public static boolean testing(int e1, int e2){
      int doli =  methods.respond(e1,e2);
      Assert.assertEquals("Assertion formula not true", 7, doli);
      return true;
    }

}
