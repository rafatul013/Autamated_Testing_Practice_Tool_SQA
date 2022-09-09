package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class toolsqa extends BaseDriver{
	public static String baseUrl="https://demoqa.com/text-box";
   @Test(priority=0)
   public void openUrl() throws InterruptedException {
		Driver.get(baseUrl);
		Driver.manage().window().maximize();	
		Thread.sleep(500);	
         }
   @Test(priority=1)
   public void Test1() throws InterruptedException {
	   WebElement textbox=Driver.findElement(By.id("item-0"));
	   textbox.click();
	   
//	   WebElement namefield=Driver.findElement(By.xpath("//*[@id=\"userName\"]"));
//	   namefield.clear();
//	   namefield.sendKeys("Rafatul");
//	   
//	   WebElement emailfield=Driver.findElement(By.id("userEmail"));
//	   emailfield.clear();
//	   emailfield.sendKeys("zahid@gmail.com");
//	   
//	   WebElement currentaddress=Driver.findElement(By.id("currentAddress"));
//	   currentaddress.clear();
//	   currentaddress.sendKeys("Dhaka");
//	   
//	   WebElement permanentaddress=Driver.findElement(By.id("permanentAddress"));
//	   permanentaddress.clear();
//	   permanentaddress.sendKeys("Barisal");
//	   Thread.sleep(500);
   }
   @Test(priority=2)
   public void Test2() throws InterruptedException {
	   WebElement submit=Driver.findElement(By.xpath("//button[@id='submit']"));
	   submit.click();	
	   Thread.sleep(2000);
   }
   
   @Test(priority=3)
   public void Test3() throws InterruptedException {
	   WebElement checkbox=Driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
	   checkbox.click();
	   Thread.sleep(2000);
	   
//	   WebElement togglebtn0=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
//	   togglebtn0.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement togglebtn1=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
//	   togglebtn1.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement selectbtn0=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
//	   selectbtn0.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement selectbtn1=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
//	   selectbtn1.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement togglebtn2=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
//	   togglebtn2.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement selectbtn2=Driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
//	   selectbtn2.click();
//	 
   }
   @Test(priority=4)
   public void Test4() throws InterruptedException{
	   WebElement radiobtn = Driver.findElement(By.id("item-2"));
	   radiobtn.click();
	   Thread.sleep(1000);
	   
//	   WebElement radiobtn1 = Driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
//	   radiobtn1.click();
//	   
//	   WebElement radiobtn2 = Driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
//	   radiobtn2.click();
//	   Thread.sleep(1000);
   }
   
   @Test(priority=5)
   public void Test5() throws InterruptedException {
	   WebElement webtables = Driver.findElement(By.id("item-3"));
	   webtables.click();
	   Thread.sleep(1000);
//	   WebElement dltrecord = Driver.findElement(By.id("delete-record-1"));
//	   dltrecord.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement edtrecord = Driver.findElement(By.id("edit-record-3"));
//	   edtrecord.click();
//	   Thread.sleep(1000);
//	   
//	   WebElement edtfname = Driver.findElement(By.id("firstName"));
//	   edtfname.clear();
//	   edtfname.sendKeys("RAFAT");
//	   Thread.sleep(1000);
//	   
//	   WebElement edtlname = Driver.findElement(By.id("lastName"));
//	   edtlname.clear();
//	   edtlname.sendKeys("Islam");
//	   Thread.sleep(1000);
//	   
//	   WebElement edtemail = Driver.findElement(By.id("userEmail"));
//	   edtemail.clear();
//	   edtemail.sendKeys("rafa95559@gmail.com");
//	   Thread.sleep(1000);
//	   
//	   WebElement edtage = Driver.findElement(By.id("age"));
//	   edtage.clear();
//	   edtage.sendKeys("50");
//	   Thread.sleep(1000);
//	   
//	   WebElement edtsalary = Driver.findElement(By.id("salary"));
//	   edtsalary.clear();
//	   edtsalary.sendKeys("50000");
//	   Thread.sleep(1000);
//	   
//	   WebElement tsubmit = Driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//	   tsubmit.click();
//	   Thread.sleep(1000);  
   }
   @Test(priority=5)
   public void Test6() throws InterruptedException {
	   Driver.get("https://demoqa.com/alerts");
	   WebElement alert = Driver.findElement(By.id("alertButton"));
	   alert.click();
	   Thread.sleep(1000); 
	   Driver.switchTo().alert().accept();
	   
	   WebElement alert1 = Driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
	   alert1.click();
	   Thread.sleep(1000); 
	   Driver.switchTo().alert().dismiss(); 
	   
	   WebElement alert2 = Driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
	   alert2.click();
	   Thread.sleep(1000); 
	   Driver.switchTo().alert().sendKeys("Rafat"); 
	   Thread.sleep(1000); 
	   Driver.switchTo().alert().accept();
	   
	 
   }
   
   }
	
	
