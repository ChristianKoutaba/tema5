public class tema5 {
    public tema5(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (int i = 0; i < Math.min(4, links.size()); i++) {
                WebElement link = links.get(i);
                link.click();
                List<WebElement> elements = driver.findElements(By.xpath("//*[not(self::script)]/text()"));
                for (WebElement element : elements) {
                    System.out.println(element.getText());
                }
                driver.navigate().back();
            }
            driver.get("https://demoqa.com/elements");
            WebElement textBoxTab = driver.findElement(By.xpath("//span[text()='Text Box']"));
            textBoxTab.click();
            WebElement checkBoxTab = driver.findElement(By.xpath("//span[text()='Check Box']"));
            checkBoxTab.click();
            WebElement radioButtonTab = driver.findElement(By.xpath("//span[text()='Radio Button']"));
            radioButtonTab.click();
            WebElement webTablesTab = driver.findElement(By.xpath("//span[text()='Web Tables']"));
            webTablesTab.click();
            WebElement radioButtonsTab = driver.findElement(By.xpath("//span[text()='Radio Buttons']"));
            radioButtonsTab.click();
            WebElement linksTab = driver.findElement(By.xpath("//span[text()='Links']"));
            linksTab.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
