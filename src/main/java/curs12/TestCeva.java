package curs12;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.*;
import java.text.*;


public class TestCeva {
	
	//@NeedSpecialSetup
	@Test(priority =1)
	public void loginTest() {
		Log.info("Start login tests");
		System.out.println("Test Login");
	}
	
	//priority -- seteaza prioritarea
	
	//dependsOnMethod = loginTest
	
	
	
	@NeedSpecialSetup
	@Test(priority = 2)
	public void altTest() {
		Log.info("Start ALT test");
		System.out.println("Test ALT");
	}
	
	
	
	@AfterMethod
	public void resetPage(Method method) {
		
		NeedSpecialSetup needSpecialSetup =  method.getAnnotation(NeedSpecialSetup.class);
		if(needSpecialSetup == null ) {
			return;
		}
		String timestamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.ms").format(new Date());
		System.out.println("Inside After Method" + timestamp);
	}
	

}
