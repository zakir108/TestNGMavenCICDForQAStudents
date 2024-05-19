
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.example.abc;


public class TestArithmetic {


   @Test(priority = 0)
   public void TestAdd2numberFunction()
   {
     int result =abc.Add2Number(2.5,4.5);
     Assert.assertEquals(result,7,"Total should be 7 ");
   }

    @Test(priority = 3)
    public void TestAdditionFunction(){
       SoftAssert sasert = new SoftAssert();
       abc ab = new abc();
       int sum =  ab.Add2Number(2,5);//ERROR
       Assert.assertEquals(sum,7);
       //sasert.assertEquals(sum,7.5);
    }
    @Test(priority = 2)
    public void TestAdditionFunction1(){
      
       abc ab = new abc();
       int sum =  ab.Add2Number(2,5);
       SoftAssert sa = new SoftAssert();
       sa.assertEquals(sum,7,"Expected Result 7 we found different valuie");
    }
    @Test(priority = 1)
    public void TestMultiFunction1(){
      
       abc ab = new abc();
       int multi =  ab.Multiply2Number(2,5);
       SoftAssert sa = new SoftAssert();
       sa.assertEquals(multi,10,"Expected Result 7 we found different valuie");
    }
}
