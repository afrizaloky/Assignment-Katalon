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


String [] s_Title = Title.split("-")
String [] s_FirstName = book_FirstName.split("-")
String [] s_LastName = book_LastName.split("-")
String [] s_Nationality = book_Nationality.split("-")
String [] s_Passport = book_Passport.split("-")
String [] s_DoBMonth = book_DoBMonth.split("-")
String [] s_DoBDay = book_DoBDay.split("-")
String [] s_DoBYear = book_DoBYear.split("-")
String [] s_ExpMonth = book_ExpMonth.split("-")
String [] s_ExpYear = book_ExpYear.split("-")
String [] s_ExpDay = book_ExpDay.split("-")

numPassenger= s_FirstName.length

WebUI.openBrowser("https://phptravels.net/en/usd/flights/aey/alg/oneway/economy/01-10-2021/${numPassenger}/0/0")

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Flights - PHPTRAVEL/button_USD 1068        Book Now'))


for (int counter = 0; counter < s_FirstName.length; counter++) {
    i = (counter + 1)
    println(i+s_Title[counter]+s_FirstName[counter]+s_LastName[counter]+s_Nationality[counter]+s_DoBYear[counter]+s_DoBMonth[counter]+s_ExpDay[counter]+s_Passport[counter]+s_ExpYear[counter]+s_ExpMonth[counter]+s_ExpDay[counter]+"\n")
	
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='title_${i}']"),s_Title[counter])
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='nationality_${i}']"),s_Nationality[counter])
	WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='firstname_${i}']"),s_FirstName[counter])
	WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='lastname_${i}']"),s_LastName[counter])
	
    WebUI.selectOptionByValue(TestObjectHelper.getTestObjectWithXpath("//select[@name='dob_month_${i}']"),s_DoBMonth[counter])
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='dob_day_${i}']"),s_DoBDay[counter])
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='dob_year_${i}']"),s_DoBYear[counter])

	WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='passport_${i}']"),s_Passport[counter])
    WebUI.selectOptionByValue(TestObjectHelper.getTestObjectWithXpath("//select[@name='passport_month_${i}']"),s_ExpMonth[counter])
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='passport_day_${i}']"),s_ExpDay[counter])
    WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='passport_year_${i}']"),s_DoBYear[counter])

    
}


WebUI.click(findTestObject("Page_Flight Booking - PHPTRAVEL/input_wallet balance_payment_gateway"))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

WebUI.closeBrowser()

