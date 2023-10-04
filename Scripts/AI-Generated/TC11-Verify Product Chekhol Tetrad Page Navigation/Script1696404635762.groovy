import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page product chekhol-tetrad'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/chekhol-tetrad')

'step 2: Add visual checkpoint at Page product chekhol-tetrad'

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Product Chekhol Tetrad Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
