package curs12;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++");
		Log.info("++++++Success++++++++" + result.getMethod().getMethodName() + "++++++++++++++++");
		Log.info("++++++++++++++++++++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time: " + timeStamp);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++");
		Log.info("++++++Fail++++++++" + result.getMethod().getMethodName() + "++++++++++++++++");
		Log.info("++++++++++++++++++++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time: " + timeStamp);
		Log.error(result.getThrowable().toString());
	}

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++");
		Log.info("++++++Start++++++++" + result.getMethod().getMethodName() + "++++++++++++++++");
		Log.info("++++++++++++++++++++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time: " + timeStamp);
	}
	
	
	

}
