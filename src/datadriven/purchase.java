package datadriven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 	
public class purchase {
	
//2. Sort product low to high
	public void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users/p/Desktop/D/Driver/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manange().timeouts().implicitlyWait(10,TimeUnit, SECONDS);
		driver.get("https://www.saucedemo.com/inventory.html");
		
		WebElement ddown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")); 
		Select select = new Select(ddown);
		
		select.selectByValue("hilo");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Price (low to high)");
		Thread.sleep(2000);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
	}
	
//3. All  Addtocart
	
	public static void main(String[] args) AddToCart {
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		
		WebElement item 1 = driver.findElements(By.inventory_item_name("Sauce Labs Bike Light"));
		for (WebElement item : items) {
            WebElement addToCartButton1 = item.findElement(By.id("add-to-cart-sauce-labs-onesie"));
            addToCartButton.click();
         Thread.sleep(2000);
		}
         
        WebElement item 2 = driver.findElements(By.inventory_item_name("Sauce Labs Bike Light"));
 		for (WebElement item : items) {
             WebElement addToCartButton2 = item.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
             addToCartButton.click();
          Thread.sleep(2000);
 		}
          
        WebElement item 3 = driver.findElements(By.inventory_item_name("Sauce Labs Bolt T-Shirt"));
   		for (WebElement item : items) {
             WebElement addToCartButton3 = item.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
             addToCartButton.click();
        Thread.sleep(2000);
   		}
            
        WebElement item 4 = driver.findElements(By.inventory_item_name("Test.allTheThings() T-Shirt (Red)"));
        for (WebElement item : items) {
             WebElement addToCartButton4 = item.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
             addToCartButton.click();
         Thread.sleep(2000);
        }
                
         WebElement item 5 = driver.findElements(By.inventory_item_name("Sauce Labs Backpack"));
         for (WebElement item : items) {
              WebElement addToCartButton5 = item.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
              addToCartButton.click();
          Thread.sleep(2000);
         }
                    
          WebElement item 6 = driver.findElements(By.inventory_item_name("Sauce Labs Fleece Jacket"));
          for (WebElement item : items) {
        	  WebElement addToCartButton6 = item.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
              addToCartButton1.click();
              Thread.sleep(2000);
         driver.quit();
		}
	}
        
//4. Removethe items <$15  
          
       public static void main(String[] args) RemoveItems {
    	   
    	   WebDriver driver=new ChromeDriver();
   		   driver.manange().timeouts().implicitlyWait(10,TimeUnit, SECONDS)
   		   driver.navigate().to("https://www.saucedemo.com/cart.html");

        	        
    	   WebElement items = driver.findElements(By.class("inventory_item_desc"));
    	   WebElement prices = driver.findElements(By.class("inventory_details_price"));

    	   WebElement filteredItems = new Array();

        	      
        	    for (int i = 0; i < items.size(); i++) {
        	         WebElement item = items.get(i);
        	         WebElement price = prices.get(i);
        	    }

        	        
        	    double itemPrice = Double.parseDouble(price.getText().replace("$", ""));

        	         
        	     if (itemPrice >= 15) {
        	         filteredItems.add(item);
        	     Thread.sleep(3000);
        	     }
       		}	
        	
//5. the Checkout button Enter the details on your information page and click on the Continue button Finish the checkout
     
     public static void main(String[] args) {
        	   
        	     
        	driver.get("https://www.saucedemo.com/cart.html");
        	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        	driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
        	driver.findElement(By.id("first-name")).sendKeys("Vishnu");
        	driver.findElement(By.id("last-name")).sendKeys("Mohan");
        	driver.findElement(By.id("postal-code")).sendKeys("695561");
        	driver.findElement(By.id("continue")).click();
        	driver.navigate().to("https://www.saucedemo.com/checkout-complete.html");
        	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/button")).click();
        	driver.navigate().to("https://www.saucedemo.com/inventory.html");
        	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
        	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
        	driver.quit();	
      }  
	}
