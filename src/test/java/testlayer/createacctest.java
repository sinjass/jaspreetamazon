package testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.baseamazonclass;
import pompacakge.createacc;

public class createacctest extends baseamazonclass {

	createacc creacc;
	public createacctest() {
		super();
	}
	@BeforeMethod
public void intialsetup() {
		initiate ();
		
		 creacc= new createacc(); 
	}
	@Test 
	public void title() {
	String actual creacc.verify();
	assert.assertEquals(actual,"amazon");
		
	
		
	}}
	
	
	
	
	
	
	
	
	
	
}


