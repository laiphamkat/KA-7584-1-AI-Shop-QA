import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category power-and-cables'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/power-and-cables')

'step 2: At Page category power-and-cables click on button object'

testObj = findTestObject('Object Repository/Page_category_power-and-cables/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/power-and-cables(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page category power-and-cables click on hyperlink cart --> navigate to Page cart'

testObj = findTestObject('Object Repository/Page_category_power-and-cables/hyperlink_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/power-and-cables(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page cart click on button object --> navigate to Page checkout info'

testObj = findTestObject('Object Repository/Page_cart/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page checkout info input on input r0'

testObj = findTestObject('Object Repository/Page_checkout_info/input_r0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_r0)

'step 6: At Page checkout info click on input receive marketing info'

testObj = findTestObject('Object Repository/Page_checkout_info/input_receive_marketing_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page checkout info click on button object --> navigate to Page checkout shipping-address'

testObj = findTestObject('Object Repository/Page_checkout_info/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page checkout shipping-address input on input r2'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_r2)

'step 10: At Page checkout shipping-address input on input r3'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_r3)

'step 11: At Page checkout shipping-address input on input r4'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_r4)

'step 12: At Page checkout shipping-address input on input r5'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_r5)

'step 13: At Page checkout shipping-address input on input r6'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_6_input_r6)

'step 14: At Page checkout shipping-address input on input r7'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r7')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_7_input_r7)

'step 15: At Page checkout shipping-address select on select r8'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_r8')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByIndex(testObj, '202')

'step 16: At Page checkout shipping-address input on input r9'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r9')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_8_input_r9)

'step 17: At Page checkout shipping-address input on input ra'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_ra')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_9_input_ra)

'step 18: At Page checkout shipping-address input on input rb'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_rb')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_10_input_rb)

'step 19: At Page checkout shipping-address input on input rc'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_rc')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_11_input_rc)

'step 20: At Page checkout shipping-address input on input rd'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_rd')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_12_input_rd)

'step 21: At Page checkout shipping-address input on input re'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_re')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_13_input_re)

'step 22: At Page checkout shipping-address input on input rf'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_rf')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_14_input_rf)

'step 23: At Page checkout shipping-address select on select rg'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_rg')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByIndex(testObj, '88')

'step 24: At Page checkout shipping-address click on button object --> navigate to Page checkout payment'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 25: At Page checkout payment click on input payment method id'

testObj = findTestObject('Object Repository/Page_checkout_payment/input_payment_method_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/payment(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 26: At Page checkout payment click on button object --> navigate to Page thank-youa6-49b9-45eb-ba4a-88f0b36c6506'

testObj = findTestObject('Object Repository/Page_checkout_payment/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/payment(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 27: Add visual checkpoint at Page thank-youa6-49b9-45eb-ba4a-88f0b36c6506'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify successful checkout process with valid shipping and payment information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
