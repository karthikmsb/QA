import Utilities.CommonFunctions;
import org.junit.After;
import org.junit.Before;


    public class TestFramework extends CommonFunctions
    {
        CommonFunctions commonFunctions=new CommonFunctions();
        @Before
        public void beforeTest()
        {
            commonFunctions.openBrowser();
        }


        @After
        public void afterTest()
        {
            commonFunctions.closeBrowser();

        }

    }


