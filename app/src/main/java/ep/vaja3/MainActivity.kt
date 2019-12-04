package ep.vaja3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/***
 * TODO: Ohranite stanje števca medtem ko v aplikaciji zarotirate zaslon
 */
class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increment(view: View?) {
        counter++
        textView.text = counter.toString()
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