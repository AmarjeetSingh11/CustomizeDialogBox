package com.example.customizeddailogbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Create a  variable of type dialog

    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mybutton=findViewById<Button>(R.id.btnclick)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dailog)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var buttongood=dialog.findViewById<Button>(R.id.btnGood)
        var buttonfeedback=dialog.findViewById<Button>(R.id.btnFeedback)


        mybutton.setOnClickListener {
            dialog.show()
        }


        //creating variables for customized dialog design


        buttongood.setOnClickListener {
            dialog.dismiss()
        }
        buttonfeedback.setOnClickListener {
            Toast.makeText(this,"Thanks for the FeedBack",Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }

    }
}