package com.qait.automation.com.mobile.automation;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class AppTest 
    
{
    App obj = new App();
    
    @Test
    public void setttingUp() throws MalformedURLException
    {
    	obj.setup();
    }
    @Test 
    public void launchingChrome() throws MalformedURLException
    {
    	obj.chromeLaunching();
    	String actualTitle = obj.getTitle();
    	String expectedTitle = "HRIS Login";
    	Assert.assertEquals(expectedTitle,expectedTitle,"Title doesn't match");
    }
    
}
