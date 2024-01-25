import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page home, click on hyperlink object > navigate to Page category/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

'Step 3: Add visual checkpoint at Page_category/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Order Placement and Thank You Page_visual_checkpoint')

'Step 4: At Page category/*, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_object'))

'Step 5: At Page category/*, click on hyperlink object > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/hyperlink_object'))

'Step 6: At Page cart, click on button object > navigate to Page checkout/info'

WebUI.enhancedClick(findTestObject('Page_cart/button_object'))

'Step 7: At Page checkout/info, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

'Step 8: At Page checkout/info, click on input email'

WebUI.enhancedClick(findTestObject('Page_checkout_info/input_r0'))

'Step 9: At Page checkout/info, input on input email'

WebUI.setText(findTestObject('Page_checkout_info/input_r0'), input_email)

'Step 10: At Page checkout/info, click on button object > navigate to Page checkout/shipping-address'

WebUI.enhancedClick(findTestObject('Page_checkout_info/button_object'))

'Step 11: At Page checkout/shipping-address, click on input delivery id'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_delivery_id'))

'Step 12: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object'))

'Step 13: At Page checkout/shipping-address, click on input shipping address first name'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r2'))

'Step 14: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_1'))

'Step 15: At Page checkout/shipping-address, input on input shipping address first name'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r2'), input_shipping_address_first_name)

'Step 16: At Page checkout/shipping-address, click on input shipping address last name'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r3'))

'Step 17: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_2'))

'Step 18: At Page checkout/shipping-address, input on input shipping address last name'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r3'), input_shipping_address_last_name)

'Step 19: At Page checkout/shipping-address, click on input shipping address address line 1'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r4'))

'Step 20: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_3'))

'Step 21: At Page checkout/shipping-address, input on input shipping address address line 1'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r4'), input_shipping_address_address_line_1)

'Step 22: At Page checkout/shipping-address, click on input shipping address zip'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r5'))

'Step 23: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_4'))

'Step 24: At Page checkout/shipping-address, input on input shipping address zip'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r5'), input_shipping_address_zip)

'Step 25: At Page checkout/shipping-address, click on input shipping address city'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r6'))

'Step 26: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_5'))

'Step 27: At Page checkout/shipping-address, input on input shipping address city'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r6'), input_shipping_address_city)

'Step 28: At Page checkout/shipping-address, click on select shipping address country id'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/select_r8'))

'Step 29: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_6'))

'Step 30: At Page checkout/shipping-address, click on input shipping address state'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r7'))

'Step 31: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_7'))

'Step 32: At Page checkout/shipping-address, input on input shipping address state'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r7'), input_shipping_address_state)

'Step 33: At Page checkout/shipping-address, click on input shipping address phone'

WebUI.enhancedClick(findTestObject('Page_checkout_shipping-address/input_r9'))

'Step 34: At Page checkout/shipping-address, input on input shipping address phone'

WebUI.setText(findTestObject('Page_checkout_shipping-address/input_r9'), input_shipping_address_phone)

'Step 35: At Page checkout/shipping-address, click on button object > navigate to Page checkout/payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/button_object'))

'Step 36: At Page checkout/payment, click on input payment method id'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/input_payment_method_id'))

'Step 37: At Page checkout/payment, click on button object > navigate to Page thank-you/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_object'))

'Step 38: Add visual checkpoint at Page_thank-you/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Order Placement and Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
