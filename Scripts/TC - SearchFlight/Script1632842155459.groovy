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

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - PHPTRAVEL/a_flights'))

if (TripType == 'one-way') {
    WebUI.click(findTestObject('Page_Search Flight- PHPTRAVEL/input_one-way_trip'))
}

if (TripType == 'round-trip') {
    WebUI.click(findTestObject('Page_Search Flight- PHPTRAVEL/input_round_trip'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Return Date_returning'), ReturnDate)

    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/form_One Way                                                                                                                         Round Trip'))
}

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Flying From_from'), FlyingFrom)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/div_BSK Biskra'))

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Departure Date_depart'), DepartureDate)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/form_One Way                                                                                                                         Round Trip'))

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_To Destination_to'), ToDestination)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/div_JOG Adi Sutjipto'))

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/a_1'))

WebUI.clearText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Adults_adults'))

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Adults_adults'), Adults)

WebUI.clearText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Childs_childs'))

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Childs_childs'), Childs)

WebUI.clearText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Infants_childs'))

WebUI.setText(findTestObject('Object Repository/Page_Search Flight- PHPTRAVEL/input_Infants_childs'), Infants)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/select_Economy                Business     _dbb6ab'))

WebUI.selectOptionByValue(findTestObject('Page_Search Hotels - PHPTRAVEL/select_Economy                Business     _dbb6ab'), 
    ClassType, true)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Search Flight- PHPTRAVEL/button_USD 252        Book Now'))

