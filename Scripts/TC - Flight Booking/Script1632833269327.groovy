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

WebUI.openBrowser('https://phptravels.net/en/usd/flights/aey/alg/oneway/economy/01-10-2021/1/0/0')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Flights - PHPTRAVEL/button_USD 1068        Book Now'))

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR                        MISS                        MRS'), 
    'MRS', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), 'jefrison')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), 'banni')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7_1'), 
    'ID', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04'), 
    '04', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04_1'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), '3')

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_wallet balance_payment_gateway'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

WebUI.closeBrowser()

