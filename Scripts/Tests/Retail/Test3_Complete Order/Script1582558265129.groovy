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

'Opens Webbrowser of a choice'
WebUI.callTestCase(findTestCase('SuportiveActions/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

'Access Testing site'
WebUI.navigateToUrl('https://betestautomation.azurewebsites.net/')

'Click on Accept Cookies'
WebUI.click(findTestObject('Retail/Buttons/button_Accept'))

'Click on Log-In button\n'
WebUI.click(findTestObject('Retail/Buttons/a_Log in'))

'Click on Register New User\n'
WebUI.click(findTestObject('Retail/Buttons/a_Register as a new user'))

String emailPrefix = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('Retail/Text Fields/input_Email_Email'), emailPrefix + '@email.com')

WebUI.setText(findTestObject('Retail/Text Fields/input_Full name_FullName'), 'Tester McTest')

WebUI.setEncryptedText(findTestObject('Retail/Text Fields/input_Password_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Retail/Text Fields/input_Confirm password_ConfirmPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Retail/Buttons/button_Register'))

WebUI.click(findTestObject('Retail/Text Fields/a_Hello Tester McTest'))

WebUI.verifyElementPresent(findTestObject('Retail/Objects/a_Shoes'), 2)

WebUI.click(findTestObject('Retail/Objects/a_Shoes'))

WebUI.click(findTestObject('Retail/Objects/h5_Converse All Star Hi Plimsolls'))

WebUI.click(findTestObject('Retail/Buttons/button_'))

WebUI.click(findTestObject('Retail/Buttons/button_Add to cart'))

WebUI.click(findTestObject('Retail/Buttons/a_View cart'))

WebUI.click(findTestObject('Retail/Buttons/a_Process to Checkout'))

WebUI.setText(findTestObject('Retail/Objects/input_Contact name_NewAddressFormContactName'), 'Tester McTest')

WebUI.selectOptionByValue(findTestObject('Retail/Objects/select_Choose one Un_2b0e4d'), 'US', true)

WebUI.selectOptionByValue(findTestObject('Retail/Objects/select_Choose oneWashington'), '2', true)

WebUI.setText(findTestObject('Retail/Text Fields/input_City_NewAddressFormCity'), 'Washington')

WebUI.setText(findTestObject('Retail/Text Fields/input_Postal Code_NewAddressFormZipCode'), 'W11US')

WebUI.setText(findTestObject('Retail/Text Fields/input_Address_NewAddressFormAddressLine1'), '21 Tester\'s Street')

WebUI.setText(findTestObject('Retail/Text Fields/input_Phone_NewAddressFormPhone'), '013335532')

'Note number again (2)'
WebUI.click(findTestObject('Retail/Objects/td_2'))

WebUI.click(findTestObject('Retail/Buttons/button_Payment'))

'Verify if Cash on delivery. option exists'
WebUI.verifyElementPresent(findTestObject('Retail/Objects/label_Cash on Delivery'), 0)

WebUI.click(findTestObject('Retail/Buttons/button_Cash on Delivery'))

'Verify if the page says \'Contratulation!\''
WebUI.click(findTestObject('Retail/Objects/h2_Congratulation'))

WebUI.callTestCase(findTestCase('SuportiveActions/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

