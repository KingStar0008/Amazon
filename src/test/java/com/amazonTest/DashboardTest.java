package com.amazonTest;

import org.amazon.Dashboard;
import org.testng.annotations.Test;

public class DashboardTest extends Base{
    @Test
    public void dashboardPage(){
        getDriver().get("https://www.amazon.in/");
        Dashboard dashboard = new Dashboard(getDriver());
        dashboard.DashboardAssert();
        dashboard.searchBox("Refrigerator");

    }

}
