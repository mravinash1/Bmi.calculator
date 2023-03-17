package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.bmicalculator.databinding.ActivityMainBinding

class web_view : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val pro=findViewById<View>(R.id.progress_bar)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val webview=findViewById<View>(R.id.web_viewid)

        val webViewClient=Mywebviewclient()
        yeh company me ker dunnga ok
                ok

    }
    inner class Mywebviewclient: WebViewClient(){
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
             pro.visibility=View.GONE
        }
    }
}