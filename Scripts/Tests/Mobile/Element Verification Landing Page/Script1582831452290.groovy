import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('SuportiveActions/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://betestautomation.azurewebsites.net/')

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/SimplCommerce logo'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Searchbar'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/All Categories dropdown'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Search button'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/shopping cart icon'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Free Shipping icon'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - All Phones option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - Smart Phones option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - Smart Phones - All Smartphones option'), 
    0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - Smart Phones - Test 1 option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - Smart Phones - Test 2 option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Phones - Basic Phones option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Tablets option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Tablets option - All tablets option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Tablets option - wifi  cellular option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Tablets option - cellular option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Computers option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Computers - All Computers option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Computers - Gaming option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Computers - Business option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Accessories option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Accessories - All Accessories option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Accessories - Headphones option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Accessories - Cables option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top Bar - Accessories - USB Drives option'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Next button'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Previous button'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Top image'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Latest Products - Dell XPS'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Latest Products - iPhone 6s 16GB'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Latest Products - Samsung Galaxy A5'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Latest Products - iPad Pro Wi-Fi 4G 128GB'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Free Shipping icon'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Money Return icon'), 0)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/Safe Payment icon'), 0)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('SuportiveActions/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

