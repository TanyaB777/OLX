package OLX.DP_OLX;

import org.testng.annotations.DataProvider;

public class DataProviderOLX {

    @DataProvider
    public Object[][] getSocialMedia() {
        return new Object[][]{
                {"https://www.facebook.com/olx.ua", "[data-testid='facebook']"},
                {"https://www.youtube.com/user/olxua", "[data-testid='youtube']"},
                {"https://x.com/olx_ua", "[data-testid='twitter']"}
        };
    }

    @DataProvider
    public Object [][] getSearchWords(){

        return new Object[][] {
                {"порцеляна", "порцелян"}
        };
    }
}
