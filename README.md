# How to run the Test #

**Prerequisite**
1. Java environment 
2. Maven 


**Note: Configure web-driver path and amazon account.**
	
- Configure webdriver.
    - I used ChromeDriver
    - So first download ChromeDriver from [http://chromedriver.chromium.org/downloads](http://chromedriver.chromium.org/downloads).
    - Update the path in WebdriverSetting class to point to your driver


- Configure amazon account.
    - Update Configures file to point to your amazon.config file path
    - first line: username
    - second line: password
    
**Place Orders**

This program is only tested for Whole-foods on Amazon. It may not work if you have orders from amazon.com amazon fresh, etc
- Place orders from Wholefoods and get ready in Carts

**Run Program**    
	
Project is ready to run. Execute following commands and enjoy the automatic web-driver test.
- Go to project path in terminal
- Run `mvn clean`
- Run `mvn compile`
- Run `mvn test`

The program uses a headless chrome browser and will tries to login and get a delivery slot every 2 mins. It exits when order is placed successfully.