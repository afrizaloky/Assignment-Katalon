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

WebUI.callTestCase(findTestCase('TC - Login'), [('email') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC - SearchFlight'), [('TripType') : '', ('ClassType') : '', ('FlyingFrom') : '', ('ToDestination') : ''
        , ('DepartureDate') : '', ('ReturnDate') : '', ('Adults') : '', ('Childs') : '', ('Infants') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC - Flight Booking - Copy'), [('Title') : 'MR', ('Payment') : 'Pay Later', ('book_FirstName') : ''
        , ('book_LastName') : '', ('book_Nationality') : '', ('book_Passport') : '', ('book_DoBMonth') : '', ('book_DoBDay') : ''
        , ('book_DoBYear') : '', ('book_ExpYear') : '', ('book_ExpDay') : '', ('book_ExpMonth') : ''], FailureHandling.STOP_ON_FAILURE)

