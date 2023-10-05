package itmo.hw2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.main_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val startNavigationButton = view.findViewById<Button>(R.id.start_navigation_button)
        val navigationFragment = NavigationFragment()

        startNavigationButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, navigationFragment)
                .addToBackStack("mainFragment")
                .commit()
        }
    }
}