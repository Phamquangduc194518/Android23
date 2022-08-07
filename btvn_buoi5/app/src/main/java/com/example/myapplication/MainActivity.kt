package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import java.util.*

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {

    private var personName: EditText? = null
    private var dateTime: EditText? = null
    private var sdt: EditText? = null
    private var gmail: EditText? = null
    private var cmt: EditText? = null
    private var v: TextView? = null
    private var personname: String = ""
    private var date: String = ""
    private var sdtt: String = ""
    private var email: String = ""
    private var cmtt: String = ""
    var day = 0
    var month = 0
    var year = 0
    var saveday = 0
    var savemoth = 0
    var saveyear = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personName = findViewById(R.id.personName)
        dateTime = findViewById(R.id.dateTime)
        sdt = findViewById(R.id.sdt)
        gmail = findViewById(R.id.gmail)
        cmt = findViewById(R.id.cmt)
        v = findViewById(R.id.v)

        v?.isEnabled = false
        personName?.addTextChangedListener {
            personname = it.toString().trim()
            v?.isEnabled = personname.isNotEmpty() && date.isNotEmpty() && sdtt.isNotEmpty() && email.isNotEmpty() && cmtt.isNotEmpty()
        }

        dateTime?.addTextChangedListener {
            date = it.toString().trim()
            v?.isEnabled = personname.isNotEmpty() && date.isNotEmpty() && sdtt.isNotEmpty() && email.isNotEmpty() && cmtt.isNotEmpty()
        }
        sdt?.addTextChangedListener {
            sdtt = it.toString().trim()
            if (it?.length!! > 10) {
                sdt?.error = "Số điện thoại không hợp lệ"
            }
            v?.isEnabled = personname.isNotEmpty() && date.isNotEmpty() && sdtt.isNotEmpty() && email.isNotEmpty() && cmtt.isNotEmpty()
        }
        gmail?.addTextChangedListener {
            email = it.toString().trim()
            if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            } else {
                gmail?.error = "Email không hợp lệ"
            }
            v?.isEnabled = personname.isNotEmpty() && date.isNotEmpty() && sdtt.isNotEmpty() && email.isNotEmpty() && cmtt.isNotEmpty()
        }
        cmt?.addTextChangedListener {
            cmtt = it.toString().trim()
            if (it?.length != 12) {
                cmt?.error = "Chứng minh thư không hợp lệ"
            }
            v?.isEnabled = personname.isNotEmpty() && date.isNotEmpty() && sdtt.isNotEmpty() && email.isNotEmpty() && cmtt.isNotEmpty()
        }

        pickDate()
    }

    private fun getDateCalender() {
        val c = Calendar.getInstance()
        year = c.get(Calendar.YEAR)
        month = c.get(Calendar.MONTH)
        day = c.get(Calendar.DAY_OF_MONTH)
    }

    private fun pickDate() {
        dateTime?.setOnClickListener {
            getDateCalender()
            val dpd= DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view, myear, mmonth, mday ->
                dateTime?.setText("$mday/${mmonth +1}/$myear")
            },year, month, day)
            dpd.show()
        }
    }
//    private fun pick() {
//        dateTime?.setOnClickListener {
//            getDateCalender()
//            val dpd= DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view, myear, mmonth, mday ->
//                dateTime?.setText(""+ mday +"/"+ mmonth +"/" +myear)
//            },year, month, day)
//            dpd.show()
//        }
//    }
    override fun onDateSet(view: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        saveday = dayOfMonth
        savemoth = monthOfYear
        saveyear = year
        getDateCalender()
    }
}









