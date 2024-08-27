import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'sample.Login.loginIntoApplicationWithGlobalVariable'()

WebUI.waitForElementPresent(findTestObject('Pages/Shop page/lnkShop'), GlobalVariable.waitPresentTimeout)

WebUI.click(findTestObject('Pages/Shop page/lnkShop'))

CustomKeywords.'sample.Shop.addToCartWithGlobalVariable'()

CustomKeywords.'sample.Checkout.CheckoutShop'(firstName,lastName,companyName, country, address, city, postCode, Phone)

<<<<<<<< HEAD:Scripts/Custom-keyword samples/Order and check out a single product/Script1566468504501.groovy
CustomKeywords.'sample.Login.logoutFromApplication'()
========
WebUI.takeFullPageScreenshotAsCheckpoint('current_viewport')

WebUI.takeFullPageScreenshotAsCheckpoint('full_view_no_elements', [findTestObject('UI/logo')])

WebUI.click(findTestObject('UI/lo'))

WebUI.takeScreenshot()
>>>>>>>> origin/main:Scripts/Take screenshot when execution failed/Take screenshot when execution failed/Script1604908806506.groovy

WebUI.closeBrowser()