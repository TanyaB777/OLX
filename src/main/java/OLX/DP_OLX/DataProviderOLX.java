package OLX.DP_OLX;

import org.testng.annotations.DataProvider;

public class DataProviderOLX {

    @DataProvider
    public Object[] getSocialMedia() {
        return new Object[]{"https://www.facebook.com/olx.ua", "[data-testid='facebook']"};
    }

}
