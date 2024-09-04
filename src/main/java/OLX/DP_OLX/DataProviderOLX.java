package OLX.DP_OLX;

public class DataProviderOLX {

    @org.testng.annotations.DataProvider
    public Object[] getSocialMedia() {
        return new Object[]{"https://www.facebook.com/olx.ua", "[data-testid='facebook']"};
    }

}
