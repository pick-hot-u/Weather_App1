package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.view.contains
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {

            var country = ""

            when(countryRadio.checkedRadioButtonId){
                denmarkRadio.id  -> country = ",dk"
                koreaRadio.id    -> country = ",kr"
                else            -> country = "error"

            }

            if(country == "error" || cityText.text.toString() == ""){
                longToast("please choose your CITY and COUNTRY :)")
            }
            else {
                startActivity<MainActivity>(
                    "city" to cityText.text.toString() + country
                )
            }

        }
    }
}
