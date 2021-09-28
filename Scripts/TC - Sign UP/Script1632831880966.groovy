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

WebUI.openBrowser('https://phptravels.net/signup')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input_First Name_first_name'), firstName)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input_Last Name_last_name'), lastName)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input_Phone_phone'), phone)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input_Email_email'), email)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input_Password_password'), password)

WebUI.click(findTestObject('Page_Signup - PHPTRAVEL/span_Customer'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVEL/input__select2-search__field'), accountType)

WebUI.sendKeys(findTestObject('Page_Signup - PHPTRAVEL/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Signup - PHPTRAVEL/button_Signup'), Keys.chord(Keys.ENTER))

WebUI.callTestCase(findTestCase('TC - Login'), [('email') : email, ('password') : password], FailureHandling.STOP_ON_FAILURE)

