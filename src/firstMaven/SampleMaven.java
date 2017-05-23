package firstMaven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleMaven {
	
	@Test
	public void testA()
	{
		Reporter.log("happy",true);
	}

}
