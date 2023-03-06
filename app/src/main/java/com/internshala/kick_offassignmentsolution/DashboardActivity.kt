package com.internshala.kick_offassignmentsolution

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    /*Declaring the textview used for displaying the data*/
    lateinit var cardView: CardView
    lateinit var cardLogout: CardView
    lateinit var cardReceive: CardView
    lateinit var cardFoodMap: CardView
    lateinit var cardMyPins: CardView
    lateinit var cardHistory: CardView
    lateinit var cardAboutUs: CardView
    lateinit var cardContactUs: CardView

    /*Life-cycle method*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        cardView = findViewById(R.id.cardDonate)
        cardLogout = findViewById(R.id.cardLogout)
        cardReceive = findViewById(R.id.cardReceive)
        cardFoodMap = findViewById(R.id.cardFoodmap)
        cardMyPins = findViewById(R.id.cardMyPin)
        cardHistory = findViewById(R.id.cardHistory)
        cardAboutUs = findViewById(R.id.cardAboutus)
        cardContactUs= findViewById(R.id.cardContact)

        cardView.setOnClickListener {
            startActivity(Intent(this@DashboardActivity,DonationActivity::class.java))
        }

        cardLogout.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"Successfully Logged out From The System!!",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,LoginActivity::class.java))
        }

        cardReceive.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On Receive Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,ReceiveActivity::class.java))
        }

        cardFoodMap.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On Food Map Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,FoodMap::class.java))
        }

        cardMyPins.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On My Pins Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,MyPins::class.java))
        }

        cardHistory.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On History Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,History::class.java))
        }

        cardAboutUs.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On About Us Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,AboutUs::class.java))
        }

        cardContactUs.setOnClickListener {
            Toast.makeText(this@DashboardActivity,"You Clicked On Contact Us Activity",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DashboardActivity,ContactUs::class.java))
        }
        
    }
}
