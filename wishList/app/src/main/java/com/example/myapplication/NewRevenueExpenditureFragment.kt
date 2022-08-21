package com.example.myapplication

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import java.util.*


class New_Revenue_Expenditure_Fragment : Fragment(),DatePickerDialog.OnDateSetListener {

    var day = 0
    var month = 0
    var year = 0
    var saveday = 0
    var savemoth = 0
    var saveyear = 0
    private var calendar1 : TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.new_revenue_expenditure, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calendar1= view.findViewById(R.id.calendar1)
        pickDate()
    }

    private fun getDateCalender() {
        val c = Calendar.getInstance()
        year = c.get(Calendar.YEAR)
        month = c.get(Calendar.MONTH)
        day = c.get(Calendar.DAY_OF_MONTH)
    }

    private fun pickDate() {
        calendar1?.setOnClickListener {
            getDateCalender()
            val dpd= DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{ view, myear, mmonth, mday ->
                    calendar1?.setText("$mday/${mmonth +1}/$myear")
            },year, month, day)
            dpd.show()
        }
    }

    private fun DatePickerDialog(
        newRevenueExpenditureFragment: New_Revenue_Expenditure_Fragment,
        onDateSetListener: DatePickerDialog.OnDateSetListener,
        year: Int,
        month: Int,
        day: Int,
    ): DatePickerDialog {

    }


    override fun onDateSet(view: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        saveday = dayOfMonth
        savemoth = monthOfYear
        saveyear = year
        getDateCalender()
    }

}