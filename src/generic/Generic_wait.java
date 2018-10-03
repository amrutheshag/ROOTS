package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Generic_wait {
	
	public static ExpectedCondition<WebElement> waitForElementToContainText(final String cssSelector, final String visibleText) {
	    return new ExpectedCondition<WebElement>() {
	        @Override
	        public WebElement apply(WebDriver webDriver) {
	            WebElement anElement = webDriver.findElement(By.cssSelector(cssSelector));
	            if (anElement.getText().contains(visibleText)) {
	                return anElement; // Condition passed
	            }
	            return null; // Condition failed
	        }

	        public String toString() {
	            return "first occurance of text '" + visibleText + "' in element " + cssSelector;
	        }
	    };
	}

}
