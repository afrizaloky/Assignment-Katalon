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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://phptravels.net/')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVEL - PHPTRAVEL/a_Signup'))

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/input_First Name_first_name'), 'p')

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/input_Last Name_last_name'), 'p')

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/input_Phone_phone'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/input_Email_email'), 'a@g.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/input_Password_password'), 'lnBUteI2ioQ=')

WebUI.click(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/body_1-234-56789                           _d9076c'))

WebUI.click(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/body_1-234-56789                           _d9076c_1'))

WebUI.click(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/body_1-234-56789                           _d9076c_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Signup - PHPTRAVEL/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVEL/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login - PHPTRAVEL/input_Email_email'), 'a@g.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - PHPTRAVEL/input_Password_password'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVEL/label_Remember Me'))

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVEL/label_Remember Me'))

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVEL/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - PHPTRAVEL/a_flights'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_One Way_trip'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_SEARCH FOR BEST FLIGHTS_trip'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), 'cgk')

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/div_CGK Soekarno Hatta Intl'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/strong_Port Moresby Jacksons Intl'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/div_YEG Edmonton Intl'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), 'c')

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/strong_Mohamed Boudiaf Intl'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'), '01-10-2021')

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), 'YEG - Edmonton Intl - Edmonton')

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), 'CZL - Mohamed Boudiaf Intl - Constantine')

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-plus'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-minus'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-plus'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-minus'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-plus'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-minus'))

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/i_Adults_la la-minus'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/select_Economy                Business     _dbb6ab'), 
    'business', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/select_Economy                Business     _dbb6ab'), 
    'first', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/select_Economy                Business     _dbb6ab'), 
    'economy', true)

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVEL/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Flights - PHPTRAVEL/button_USD 1068        Book Now'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), 'first name')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), 'last name')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7_1'), 
    'ID', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04'), 
    '05', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04'), 
    '02', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), '1999')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), 
    '11111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/select_Month                        January_9d2d04_1'), 
    '10', true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), '2022')

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/img'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Ter_355a10'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Invoice - PHPTRAVEL/select_bank transfer                       _903575'), 
    'bank-transfer', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Invoice - PHPTRAVEL/select_bank transfer                       _903575'), 
    'pay-later', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Invoice - PHPTRAVEL/select_bank transfer                       _903575'), 
    'stripe', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Invoice - PHPTRAVEL/select_bank transfer                       _903575'), 
    'paypal', true)

WebUI.click(findTestObject('Object Repository/Page_Flight Invoice - PHPTRAVEL/input_Pay With_form'))

WebUI.click(findTestObject('Object Repository/Page_Payment with paypal/div_Back to Invoice'))

WebUI.click(findTestObject('Object Repository/Page_Payment with paypal/a_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Hotel Invoice - PHPTRAVEL/a_Back to Home'))

