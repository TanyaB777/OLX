package tb_olx_project.olx_data_provider;

import org.testng.annotations.DataProvider;

public class OLXDataProvider {

    @DataProvider
    public Object[][] getSocialMedia() {
        return new Object[][]{
                {"www.facebook.com/olx.ua", "[data-testid='facebook']"},
                {"www.youtube.com/user/olxua", "[data-testid='youtube']"},
                {"x.com/olx_ua", "[data-testid='twitter']"}
        };
    }

    @DataProvider
    public Object [][] getSearchWords(){

        return new Object[][] {
                {"порцеляна", "порцелян"}
        };
    }
}
