import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUiBuiltInKeywords.setText(findTestObject('Open messsage/Page_Gmail/input_identifier'), 'adresant.test@gmail.com')

WebUiBuiltInKeywords.click(findTestObject('Open messsage/Page_Gmail/span_'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('Respond to email/Password/input_password'), 3)

WebUiBuiltInKeywords.mouseOver(findTestObject('Open messsage/Password/input_password'))

WebUiBuiltInKeywords.setText(findTestObject('Open messsage/Password/input_password'), 'adresant2018')

WebUI.sendKeys(findTestObject('Open messsage/Password/input_password'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

WebUiBuiltInKeywords.click(findTestObject('Open messsage/Page_messages/open message'))

WebUiBuiltInKeywords.waitForPageLoad(5)

