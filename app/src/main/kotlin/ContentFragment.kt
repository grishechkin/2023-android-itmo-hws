package itmo.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class ContentFragment : Fragment(R.layout.content_fragment) {
    companion object {
        private const val MAX_NUM = 100
        private const val MIN_NUM = 1
        private const val NUM_KEY = "num"
    }

    private val num = Random.nextInt(MIN_NUM, MAX_NUM)

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(NUM_KEY, num)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView = view.findViewById<TextView>(R.id.content_text)
        if (savedInstanceState == null) {
            textView.text = num.toString()
        } else {
            textView.text = savedInstanceState.getInt(NUM_KEY).toString()
        }
    }
}