package testnglistenerconcept;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class) // for output purpose we use listeners 


public class ScreenShotTest extends Base{
	
	@BeforeMethod
	public void setUp() {
		Base.initialization();
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	@Test
	public void loginTest() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void searchTest() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void createDealsTest() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void createcontactstest() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void homepagetest() {
		Assert.assertEquals(true, false);
	}
	
	
	
}


