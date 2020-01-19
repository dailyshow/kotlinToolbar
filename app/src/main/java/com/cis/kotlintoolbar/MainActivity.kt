package com.cis.kotlintoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

// toolbar는 모양은 똑같지만 actionbar 보다 더 다양한 기능들을 사용할 수 있다.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // actionbar 대신 toolbar를 사용하도록 설정한다.
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item1 -> {
                tv.text = "메뉴1 을 눌렀습니다."
            }
            R.id.item2 -> {
                tv.text = "메뉴2 을 눌렀습니다."
            }
            R.id.item3 -> {
                tv.text = "메뉴3 을 눌렀습니다."
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
