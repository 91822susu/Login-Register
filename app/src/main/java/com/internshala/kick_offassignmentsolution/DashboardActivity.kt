package com.internshala.kick_offassignmentsolution

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    /*Declaring the textview used for displaying the data*/
    lateinit var txtData: TextView

    /*Life-cycle method*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        
    }
}
