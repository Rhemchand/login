package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage_Object extends Basepagee {
	
		public Basepage_Object() {
		     PageFactory.initElements(driver,this);
		}
	
		
		@FindBy(xpath ="//ul/li[1]/a[@title='Women']")
		public WebElement WomenTab;
		
		@FindBy(xpath ="//ul/li[2]/a[@class='sf-with-ul']")
		public WebElement DressesTab;
		
		@FindBy(xpath ="//ul/li[2]/a[@class='T-shirts']")
		public WebElement TshirtsTab;
		
		@FindBy(xpath ="inputNew form-control grey newsletter-input")
		public WebElement NewsLetter;
		
		
		

		
		
		
		public WebElement WomenTab()
		{
			return WomenTab;
		}
		public WebElement DressesTab()
		{
			return DressesTab;
		}
		public WebElement TshirtsTab()
		{
			return TshirtsTab;
		}
		
		}

	



