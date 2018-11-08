package com.google.StudentguideforLjubljana.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.StudentguideforLjubljana.Constants
import com.google.StudentguideforLjubljana.R.layout.activity_second
import com.google.StudentguideforLjubljana.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_second)



        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle!!.getString(Constants.USER_MSG_KEY)

            showToast(msg)
            txvUserMessage.text = msg

        }
    }
}