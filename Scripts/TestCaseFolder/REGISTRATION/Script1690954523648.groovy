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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://example.testproject.io/web/')

WebUI.setText(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/input_Full Name_name'), 'Dinesh')

WebUI.setEncryptedText(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/input_Password_password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/select_AfghanistanAlbaniaAlgeriaAmerican Sa_e5890c'), 
    'IN', true)

WebUI.setText(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/input_Address_address'), 'Pune,India')

WebUI.setText(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/input_Email_email'), 'Dinesh@gmail.com')

WebUI.setText(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/input_Phone_phone'), '9876543212')

WebUI.click(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/button_Save'))

WebUI.click(findTestObject('Object Repository/LOGIN/REGISTRATION/Page_TestProject Demo/button_Logout'))

