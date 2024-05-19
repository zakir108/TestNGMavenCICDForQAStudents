import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.example.abc;

public class JavaBasicFunctions {
    @Test(priority = 2)
    public void TestAdditionFunction1(){
      
       abc ab = new abc();
       int sum =  ab.Add2Number(2,5);
       SoftAssert sa = new SoftAssert();
       sa.assertEquals(sum,7,"Expected Result 7 we found different valuie");
    }
    @Test(priority = 1)
    public void TestMultiplication(){
      
       abc ab = new abc();
       int sum =  ab.Multiply2Number(2,5);
       int result = 2*5;
       SoftAssert sa = new SoftAssert();
       sa.assertEquals(sum,result,"....");
    }
    @Test(priority = 1)
    public void TestMultiplicationLargeNumber(){
      
       abc ab = new abc();
       int sum =  ab.Multiply2Number(545454554,545454554);
       SoftAssert sa = new SoftAssert();
       sa.assertEquals(sum,545454554*545454554,"Possibly Fail");
    }
}
