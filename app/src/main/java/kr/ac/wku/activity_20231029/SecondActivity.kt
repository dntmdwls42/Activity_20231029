package kr.ac.wku.activity_20231029

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_20231029.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.btnReturn.setOnClickListener {

            finish()
        }
    }
}