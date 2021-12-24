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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Logowanie/input_identyfikator_login_id'), 
    GlobalVariable.userLogin)

WebUI.click(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Logowanie/button_dalej'))

WebUI.setEncryptedText(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Logowanie/input_haso_haslo'), 
    GlobalVariable.userEncPassword)

WebUI.click(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Logowanie/button_zaloguj si'))

WebUI.verifyElementText(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Pulpit/a_Jan Demobankowy'), 
    GlobalVariable.userName)

WebUI.selectOptionByValue(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Pulpit/select_wybierz odbiorc przelewu            _bc87f5'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Pulpit/button_wykonaj'))

WebUI.verifyElementText(findTestObject('Object Repository/DEMOBANK/Page_Demobank - Bankowo Internetowa - Pulpit/span_Przelew wykonany Michael Scott - 7500,_3e90c9'), 
    sucessPayment)

WebUI.closeBrowser()

