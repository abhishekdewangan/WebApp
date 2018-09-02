package com.web.openurl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import com.web.openurl.R.id.webview




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupWebView()
        webview.loadUrl("https://secure.canopy.cloud")
    }

    private fun setupWebView() {
        webview.settings.javaScriptEnabled = true
        webview.setWebViewClient(WebViewClient())
        webview.settings.allowContentAccess = true
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webview.settings.builtInZoomControls = false
        webview.settings.setSupportZoom(false)
        webview.settings.javaScriptCanOpenWindowsAutomatically = true
        webview.settings.allowFileAccess = true
        webview.settings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        } else {
            finish()
        }
    }
}
