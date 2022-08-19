package com.fleetApp.pages;

import com.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilMenuPage {

    public ProfilMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a/text()")
    public WebElement profilMenu;

    @FindBy(id = "user-menu")
    public WebElement userMenu;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement selectlogout;

   @FindBy(xpath = "//a[text()='Logout']")
    public  WebElement logoutButton;


}
