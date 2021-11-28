package ep.vaja3

import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ep.vaja3.databinding.ActivityMainBinding

/***
 * TODO: Ohranite stanje števca medtem ko v aplikaciji zarotirate zaslon
 */
class MainActivity : AppCompatActivity() {
    private var counter = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun increment(view: View?) {
        counter++
        binding.textView.text = counter.toString()
    }

    /**
     * TODO: Shranite števec v bundle
     *
     * @param outState
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    /**
     * TODO: Nastavite stanje števca na vrednost, ki jo preberete iz bundla
     *
     * @param savedInstanceState
     */
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}