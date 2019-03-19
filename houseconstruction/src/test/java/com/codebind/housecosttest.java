package com.codebind;
import com.codebind.housecost;

import static org.junit.Assert.assertEquals;

public class housecosttest {
	housecost h=new housecost();
	/*User Options
	 * 1.Standard Material.
	 * 2.Above Standard Material.
	 * 3.High Standard Material.
	 * 4.Highly Standard material With Fully Automated Home.
	 */
	public void test() {
		
		//Test Cases for Standard Materials.
		assertEquals("Wrong Answer",960000,h.construction(1,800),0.0);
		assertEquals("Wrong Answer",992160,h.construction(1,826.5),0.0);
		assertEquals("Wrong Answer",511200,h.construction(1,426),0.0);
		//Test Cases for Above Standard Materials.
		assertEquals("Wrong Answer",1350000,h.construction(2,900),0.0);
		assertEquals("Wrong Answer",874500,h.construction(2,583),0.0);
		assertEquals("Wrong Answer",677850,h.construction(2,451.8),0.0);
		//Test Cases for High Standard Material.
		assertEquals("Wrong Answer",900000,h.construction(3,500),0.0);
		assertEquals("Wrong Answer",1710450,h.construction(3,950.9),0.0);
}
	
	
}	