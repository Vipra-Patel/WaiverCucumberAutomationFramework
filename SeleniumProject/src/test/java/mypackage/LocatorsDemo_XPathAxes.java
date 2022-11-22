package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo_XPathAxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vpatel\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //Self - Selects the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'Raymond Ltd')]/self::a")).getText();
        System.out.println(text); //Raymond Ltd

        //Parent - Selects the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'Raymond Ltd')]/parent::td")).getText();
        System.out.println(text); //Raymond Ltd

        //Child - Selects all children of the current node (one or many)
        List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements:" + child.size()); //Number of child elements:5

        //Ancestor - Selects all ancestors (parent, grandparent, etc.)
        text = driver.findElement(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr")).getText();
        System.out.println(text); //SKF India A 4,505.75 4,798.40 + 6.50

        //Descendant - Selects all descendants (Children, grandchildren, etc.) of the current node
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/descendant::td"));
        System.out.println("Number of descendant nodes:" + descendants.size());

        //Following - Selects everything in the document after the closing tag of the current node
        List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/following::tr"));
        System.out.println("Number of following nodes:" + followingNodes.size());

        //Following-sibling : Selects all siblings after the current node
        List<WebElement> followingSiblings = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of following siblings:" + followingSiblings.size());

        //Preceding - Selects all nodes that appear before the current node in the document
        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of preceding nodes:" + preceding.size());

        //Preceding-sibling - Selects all siblings before the current node
        List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(text(),'Raymond Ltd')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of Preceding-sibling nodes:" + precedingSibling.size());

        driver.close();










    }
}
