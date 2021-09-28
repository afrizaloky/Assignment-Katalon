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

WebUI.openBrowser('https://phptravels.net/en/usd/hotel/singapore/rendezvous-hotels/40/01-10-2021/02-10-2021/1/2/0/1/IN/IN/0')

WebUI.maximizeWindow()

WebUI.submit(findTestObject('Object Repository/Page_rendezvous-hotels - PHPTRAVELS/button_Book Now_1'))

//Passengers = TestObjectHelper.getTestObjectWithXpath('/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]')
//
//println(Passengers.length)

//WebUI.openBrowser('https://phptravels.net/en/usd/hotel/singapore/rendezvous-hotels/40/01-10-2021/02-10-2021/1/2/0/1/IN/IN/0')

//WebUI.maximizeWindow()

//WebUI.submit(findTestObject('Object Repository/Page_rendezvous-hotels - PHPTRAVELS/button_Book Now_1'))

//Passengers = TestObjectHelper.getTestObjectWithXpath('\\div[@class=\'card mb-3\']')

String[] s_FirstName = ['am', 'ali']

for (int counter = 0; counter < s_FirstName.length; counter++) {
    i = (counter + 1)
	WebUI.setText(TestObjectHelper.getTestObjectWithXpath("//input[@name='firstname_${i}']"),s_FirstName[counter])
//	WebUI.setText(findTestObject('Object Repository/Page_Hotel Booking - PHPTRAVELS/input_First Name_firstname_1'), 'a')
}

//
//
//WebUI.setText(findTestObject('Object Repository/Page_Hotel Booking - PHPTRAVELS/input_Last Name_lastname_1'), 'a')
//
//WebUI.setText(findTestObject('Object Repository/Page_Hotel Booking - PHPTRAVELS/input_First Name_firstname_2'), 'aa')

