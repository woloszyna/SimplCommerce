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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SuportiveActions/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://betestautomation.azurewebsites.net/')

WebUI.click(findTestObject('Retail/Buttons/button_Accept'))

WebUI.click(findTestObject('Retail/Buttons/a_Log in'))

WebUI.click(findTestObject('Retail/Buttons/a_Register as a new user'))

String emailPrefix = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('Retail/Text Fields/input_Email_Email'), emailPrefix + '@email.com')


WebUI.setText(findTestObject('Retail/Text Fields/input_Full name_FullName'), 'Tester McTest')

WebUI.setEncryptedText(findTestObject('Retail/Text Fields/input_Password_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Retail/Text Fields/input_Confirm password_ConfirmPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Retail/Buttons/button_Register'))

WebUI.click(findTestObject('Retail/Text Fields/a_Hello Tester McTest'))

WebUI.verifyElementPresent(findTestObject('Retail/Objects/h2_Account Dashboard'), 5)

WebUI.callTestCase(findTestCase('SuportiveActions/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

