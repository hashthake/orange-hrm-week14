package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name="searchCriteria")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Manager","Harrow","15","20000","60000","annum","Permanent","Manager"},
                {"Project Manager","Harrow","10","40000","50000","annum","Contract","Project Manager"},
                {"Project Director","Harrow","10","70000","80000","annum","Permanent","Project Director"},
                {"Project Management","Luton","25","30000","50000","annum","Contract","Project Management"},
                {"Project Controller","Harrow","10","500","1000","day","Temporary","Project Controller"}

        };
        return data;
    }
}
