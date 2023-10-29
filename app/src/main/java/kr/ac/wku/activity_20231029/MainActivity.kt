package kr.ac.wku.activity_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSecond.setOnClickListener{

            val myIntent = Intent(this, SecondActivity::class.java)

            startActivity(myIntent)
        }

        binding.btnMoveToThird.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java)
//            화면 이동하기 전에, 데이터를 myIntent에 첨부

//            edtMessage에 적힌 값을 변수에 저장 => 이 변수를 첨부

            val inputMessage = binding.edtMessage.text.toString()

            myIntent.putExtra("message", inputMessage)

//            edtNumber에 적힌 값도 Int로 변환해서 첨부
            val inputNumber = binding.edtNumber.text.toString().toInt()

//            하나의 Intent에, 여러개의 변수 첨부 가능 (이름표만 잘 구별하자)
            myIntent.putExtra("number", inputNumber)

            startActivity(myIntent)
        }
    }
}