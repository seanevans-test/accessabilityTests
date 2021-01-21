package accessibility;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AccessibilityPage;
import pages.Homepage;

import static org.testng.AssertJUnit.assertTrue;

public class AccessibilityTests extends BaseTests {

    @Test
    public void testAccessibilityLinkPresent() {
        String accessibilityLink = homepage.findAccessibilityLink();
        System.out.println(accessibilityLink);
        assertTrue(accessibilityLink.contains("Accessibility"));
    }

//    @Test
//    public void testAccessibilityButton() {
//        System.out.println("start");
//        homepage.acceptCookies();
//        System.out.println("accepted");
//        AccessibilityPage accessibilityPage = homepage.clickAccessibilityPage();
//        String accessibilityPageHeader = accessibilityPage.getHeaderText();
//        System.out.println(accessibilityPageHeader);
//        assertTrue(accessibilityPageHeader.contains("Sky Accessibility"));
//    }
}
