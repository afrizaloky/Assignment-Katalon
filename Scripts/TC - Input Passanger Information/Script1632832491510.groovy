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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7'), 
    'ID', true)

WebUI.switchToWindowTitle('')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_MR                        MISS      _9bc2be'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), 'first name')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), 'last name')

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_MR                        MISS      _9bc2be_1'), 
    'Mrs', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_2'), 'First Name')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_2'), 'Last Name')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7_1_2'), 
    'ID', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04_1_2'), 
    '11', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_2'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_2'), '2000')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_2'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04_1_2_3'), 
    '09', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_2'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_2'), '1999')

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/div_Pay With  bank transfer'))

WebUI.check(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Ter_355a10'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

