import chrome.ExecuteScriptDetails
import chrome.tabs.ExecuteScriptDetails
import chrome.tabs.Tab

fun main() {
    chrome.browserAction.onClicked.addListener {
        val script = """ window.print(); """
        console.log("Turning tab red")

        chrome.tabs.executeScript(details = ExecuteScriptDetails {
            code = script
        })
    }

    chrome.runtime.onInstalled.addListener {
        console.log("Installed yeah!!")
        val tab = Tab {
            url = "https://google.com"
        }
        chrome.tabs.create(tab) {
            println("Tab created ${it.url}")
        }
    }
}
