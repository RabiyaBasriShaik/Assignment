package applicationPages;


import org.junit.Assert;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;

public class SelectedCarDetailsPage extends SuperTestNG{

	 		 public void clickOnLinkHere() {
			
			 Generic.clickInApp("ClickLinkHere");;
			System.out.println("Clicked on link");
			 }

			public void verifySelectedCarAndNameDsiplayed() {
				Generic.waitForObject("NameDsiplayedAfterEntering", 5);
				String nameDisplayed = Generic.findObjectInApp("NameDsiplayedAfterEntering").getText();
				Assert.assertEquals(enterusername.toLowerCase(), nameDisplayed.replaceAll("^[\"']+|[\"']+$", "").toLowerCase());
				System.out.println("verifieed selcted username " +enterusername+ nameDisplayed);
				Generic.waitForObject("CarDsiplayedAfterEntering", 5);
				String carDisplayed = Generic.findObjectInApp("CarDsiplayedAfterEntering").getText();
				Assert.assertEquals(expectedCarName.toLowerCase(),carDisplayed.replaceAll("^[\"']+|[\"']+$", "").toLowerCase());
				System.out.println("verifieed selcted carname " +expectedCarName+ carDisplayed);
			}

			public void verifyTextThisIsMyWay() {
				Generic.waitForObject("MyWayOfSayingHello", 10);
				String textFromApp = Generic.findObjectInApp("MyWayOfSayingHello").getText();
				Assert.assertEquals(textFromApp,"This is my way of saying hello");
				System.out.println("verifieed this is my way of saying hello ");
				
			}

}
