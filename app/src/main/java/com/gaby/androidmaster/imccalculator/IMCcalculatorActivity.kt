package com.gaby.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.gaby.androidmaster.R
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class IMCcalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false

    private lateinit var tvHeigt: TextView
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var rsHeight : RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator)
        initComponents()
        initListeners()
        initUI()


    }

    private fun initUI() {

    }

    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeigt = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
    }

    private fun initListeners(){
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor(isMaleSelected) }

        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor(isFemaleSelected) }

        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            tvHeigt.text = value.toString()
            val result = df.format(value)
            tvHeigt.text = "$result cms"
        }
    }



    private fun changeGender(){

        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected

    }

    private fun setGenderColor(isViewSelected:Boolean){

        viewMale.setCardBackgroundColor(setBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(setBackgroundColor(isFemaleSelected))
    }

    private fun setBackgroundColor(isSelectedComponent:Boolean):Int{

        val colorReference = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_aplication
        }
        return ContextCompat.getColor(this,colorReference)
    }

}