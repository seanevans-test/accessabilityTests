package accessibility;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AccessibilityPage;

public class AccessibilityTests extends BaseTests {

    @Test
    public void testAccessibilityButton(){
        AccessibilityPage accessibilityPage = homepage.clickAccessibilityPage();
    }
}
