package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestNgTest {

    @Test(groups = {"smoke","regression"})
    public void testTestNgExample(){
        Assert.assertEquals(true,false,"I failed");
    }

    @Test(dependsOnMethods = "testTestNgExample",alwaysRun = true)
    public void testSecond(){
        Assert.assertTrue(true);
    }
    @Test(dependsOnGroups = "smoke")
    public void testThird(){
        Assert.assertTrue(true);
    }
    @Test(description = "This is description")
    public void testFourth(){
        Assert.assertTrue(true);
    }
    @Test(enabled = false)
    public void testFifth(){
        Assert.assertTrue(true);
    }
    @Test(priority = 2)
    public void testSixth(){
        Assert.assertTrue(true);
    }
}
