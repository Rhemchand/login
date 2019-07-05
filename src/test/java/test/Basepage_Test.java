package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.Test;


import page.Basepage_Object;
import page.Basepagee;

public class Basepage_Test extends Basepage_Object {
			
				Basepage_Object hp;
				 Basepage_Test bt;
				 
				 public  Basepage_Test()
					{
					hp= new Basepage_Object();
					bt= new Basepage_Test();
				}
				
				@Test
				public void verifyTabs()
				{
					AssertJUnit.assertTrue(hp.WomenTab().isDisplayed());
					hp.WomenTab().click();
					hp.Winback();
					AssertJUnit.assertTrue(hp.DressesTab().isDisplayed());
					hp.DressesTab().click();
					hp.Winback();
					AssertJUnit.assertTrue(hp.TshirtsTab().isDisplayed());
					hp.TshirtsTab().click();
			        hp.Winback();
				}
			
			}

			

		



