package yaroslav.ovdiienko.idivision.itaybrahahelp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()

        setupClickListeners()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar.setNavigationOnClickListener {
            showToast("Sandwich menu selected")
        }
    }

    private fun setupClickListeners() {
        iv_clear_text.setOnClickListener {
            et_clearable_text.setText("")
        }
        iv_build.setOnClickListener {
            showToast("3rd icon")
        }
        iv_location.setOnClickListener {
            showToast("2nd icon")
        }
        iv_check_list.setOnClickListener {
            showToast("1st icon")
        }
        mb_bottom_button.setOnClickListener {
            showToast("Bottom button click")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.clear()
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        showToast("Option menu selected")
        return true
    }
}

fun AppCompatActivity.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}
