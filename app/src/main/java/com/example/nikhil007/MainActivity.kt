package com.example.nikhil007
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var btnSave1: Button?=null
    var btnOpen1: Button?=null
    var btnImage11: ImageButton?=null
    var chk1: CheckBox?=null
    var star1:CheckBox?=null
    var txtshw: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSave1=findViewById(R.id.btnSave)
        btnSave1?.setOnClickListener({
            txtshw=findViewById(R.id.txtshow)

            txtshw?.setText("save button")
            Toast.makeText(this,"button save clicke",Toast.LENGTH_SHORT).show()
        })
        btnOpen1=findViewById(R.id.btnOpen)
        btnOpen1?.setOnClickListener({
            txtshw=findViewById(R.id.txtshow)
            txtshw?.setText("open button")
            Toast.makeText(this,"button open clicked",Toast.LENGTH_SHORT).show()
        })
       btnImage11=findViewById(R.id.btnImage1)
        btnImage11?.setOnClickListener({
            txtshw=findViewById(R.id.txtshow)
            txtshw?.setText("image buttton clicked")
            Toast.makeText(this,"button image clicked" ,Toast.LENGTH_SHORT).show()
        })
        chk1=findViewById(R.id.chkAutosave)
       chk1?.setOnCheckedChangeListener { buttonView, isChecked ->
            val msg="you have" +(if (isChecked) "Checked" else "unchecked") +"this check it checkbox."

            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()
        }
        star1=findViewById(R.id.star)
        star1?.setOnCheckedChangeListener { buttonView, isChecked ->
            val msg="you have" +(if (isChecked) "Checked star" else "unchecked star") +"this check it checkbox."

            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()

        }
val radioGroup=findViewById<RadioGroup>(R.id.rdbgp1)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->
            var text="you selected: "
            text += if (R.id.rdb1 == checkedId) "optional selected" else "option2 selected"
            Toast.makeText(this@MainActivity ,text,Toast.LENGTH_SHORT).show()
        }
        var toggleButton=findViewById<ToggleButton>(R.id.toogle1)
        toggleButton?.setOnCheckedChangeListener { buttonView, isChecked ->
            val msg="Toggle Button is " + if(isChecked) "ON" else "OFF"
            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()
        }
    }
}
