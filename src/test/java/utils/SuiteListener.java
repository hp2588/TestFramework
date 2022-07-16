package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import corePackage.BaseTest;



public class SuiteListener implements ITestListener,IAnnotationTransformer{
	
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult iTestResult) {					
        String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();
        File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try {
        FileUtils.copyFile(f, new File(fileName + ".png"));
        }catch(IOException e){
        	e.printStackTrace();
        }
    }		

    @Override		
    public void onTestSkipped(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }

	@Override
	public void transform(ITestAnnotation iTestAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
		iTestAnnotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}
    
    
	
	
}
