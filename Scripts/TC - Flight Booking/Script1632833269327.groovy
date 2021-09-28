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

WebUI.openBrowser('https://www.phptravels.net/flights/booking')

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR                        MISS                        MRS'), 
    'MRS', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), 'jefrison')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), 'banni')

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_SelectAfghanistanAland IslandsAlbani_5b78e7'), 
    'Indonesia', false)

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_DOB JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    'october', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), '9')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), '2000')

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_ED JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    'desember', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), '12132445', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), '9')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), '2021')

if (Paymant == 'Bank Transfer') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_bank transfer_payment_gateway'))
} else if (Paymant == 'Pay Later') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment Method_payment_gateway'))
} else if (Paymant == 'Wallet Balance') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_wallet balance_payment_gateway'))
} else if (Paymant == 'Paypal') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_paypal_payment_gateway'))
} else if (Paymant == 'Stripe') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_stripe_payment_gateway'))
} else if (Paymant == 'Paddle') {
    WebUI.click(findTestObject(null))
}

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

