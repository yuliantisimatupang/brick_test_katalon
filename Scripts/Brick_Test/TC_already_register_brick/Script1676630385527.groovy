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

WebUI.navigateToUrl('https://qademo.onebrick.io/')

WebUI.setText(findTestObject('Brick_Test_Register/input_firstName'), 'yulianti')

WebUI.setText(findTestObject('Brick_Test_Register/input_lastName'), 'simatupang')

WebUI.setText(findTestObject('Brick_Test_Register/input_email'), 'yuliantisimatupang17@gmail.comn')

WebUI.setText(findTestObject('Brick_Test_Register/input_phone'), '82370839308')

WebUI.setText(findTestObject('Brick_Test_Register/input_address'), 'dki jakarta')

WebUI.setText(findTestObject('Brick_Test_Register/input_password'), 'julianty')

WebUI.setText(findTestObject('Brick_Test_Register/input_confirm_password'), 'julianty')

WebUI.click(findTestObject('Brick_Test_Register/btn_register'))

WebUI.verifyElementPresent(findTestObject('Brick_Test_Register/div_popup_registered'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

