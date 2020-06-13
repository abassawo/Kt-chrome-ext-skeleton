package chrome

import chrome.tabs.ExecuteScriptDetails
import chrome.tabs.QueryInfo

@Suppress("UNCHECKED_CAST_TO_NATIVE_INTERFACE")
inline fun QueryInfo(block: QueryInfo.() -> Unit) =
        (js("{}") as QueryInfo).apply(block)

@Suppress("UNCHECKED_CAST_TO_NATIVE_INTERFACE")
inline fun ExecuteScriptDetails(block: ExecuteScriptDetails.() -> Unit) =
        (js("{}") as ExecuteScriptDetails).apply(block)