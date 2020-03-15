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

WebUI.openBrowser('https://dev.azure.com/BEIRELAND/Test%20Automation')

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login'), 'albert.woloszyn@bearingpoint.com')

WebUI.click(findTestObject('Next button'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Signin'), 'albert.woloszyn@bearingpoint.com')

WebUI.setText(findTestObject('password'), 'aW$1001+')

WebUI.click(findTestObject('SignInButton'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('StaySignedInYes'))

WebUI.waitForPageLoad(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('New Request'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Mobile/Landing Page/SimplCommerce logo'), 5)

WebUI.verifyElementPresent(findTestObject('Mobile/Landing Page/SimplCommerce logo'), 0)

WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForElementPresent(findTestObject('TestAutomationlogo'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

