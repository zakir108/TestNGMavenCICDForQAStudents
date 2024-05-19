import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.example.FBFriend;
import com.example.abc;





public class TestFriedRequest {
    
    //int totalFriend = 0;
    FBFriend fb = null;
    int count = 0;
    @BeforeTest
    private void SeteFriendCount()
    {
        fb = new FBFriend();
        count = fb.totalFriend;
    }
    @Test(priority = 2)
    public void TestAddFriend(){
       
        int before = count;
        fb.AddFriend();
        SoftAssert sasert = new SoftAssert();      
        Assert.assertEquals(fb.totalFriend,before+1,"Total Frined wil be one more");       
    }
    @Test(priority = 1)
    public void TestRemoveFriend(){
        int before = count;
        fb.RemoveFriend();
        SoftAssert sasert = new SoftAssert();      
        Assert.assertEquals(fb.totalFriend,before-1,"Total Frined wil be one more");       
    }
    @AfterTest
    private void ClearEverything()
    {
        fb = null;
    }

}
