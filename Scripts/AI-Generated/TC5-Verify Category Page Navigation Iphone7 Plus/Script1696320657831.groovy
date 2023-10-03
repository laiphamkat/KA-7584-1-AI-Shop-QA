import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category iphone-7-plus'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/iphone-7-plus')

'step 2: Add visual checkpoint at Page category iphone-7-plus'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Category Page Navigation Iphone7 Plus_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}