# POM Design Pattern
Prepare test framework using "Page Object Model" design pattern and setup framework layer and test layer.

## Framework layer
- Framework layer sits on application folder and each class represents a page of the product under test.
- Locating the web elements is responsibility of the framework along with many other features.
- handlers are used to manage navigation betweeen pages and they are outputs of the interactions such as "click".
- Bunch of Object Oriented principles used in framework to manage simplicity of "Testing".
- "By" is the object type of Selenium Web Driver and for locating the elements "By" object will be used in the Framework.

## Test layer
- Interactions with the product under test will be sitting in Test folder
- Test layer does not need to know locators, They simply call object names which are created in Framework layer
- Test layer interacts with the product under tests and uses handlers to connect process flow from one page to another.

## Dependencies
- Selenium WebDriver version 4.22
- TestNG version 7.8.0
- Java version 23

## Useful Resources
- https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter4.1.html
- https://www.browserstack.com/guide/page-object-model-in-selenium

