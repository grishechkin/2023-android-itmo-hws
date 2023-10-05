package itmo.hw2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.IllegalArgumentException

class NavigationFragment : Fragment(R.layout.navigation_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val firstContentFragment = ContentFragment()
        val secondContentFragment = ContentFragment()
        val thirdContentFragment = ContentFragment()

        parentFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragment_content_container, firstContentFragment)
            .commit()

        val bottomNavigationMenu = view.findViewById<BottomNavigationView>(R.id.bottom_nav_menu)
        bottomNavigationMenu.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.A -> setContentFragment(firstContentFragment, "A")
                R.id.B -> setContentFragment(secondContentFragment, "B")
                R.id.C -> setContentFragment(thirdContentFragment, "C")
                else -> throw IllegalArgumentException()
            }
        }
    }

    private fun setContentFragment(contentFragment: ContentFragment, backStateName: String) : Boolean {
        val fragmentPopped = parentFragmentManager.popBackStackImmediate(backStateName, 0)
        Log.d("KOK", fragmentPopped.toString())
        if (!fragmentPopped) {
            Log.d("KOK", parentFragmentManager.findFragmentByTag(backStateName).toString())
            parentFragmentManager.beginTransaction().apply {
                setReorderingAllowed(true)
                replace(R.id.fragment_content_container, contentFragment)
                addToBackStack(backStateName)
                commit()
            }
        }
        return true
    }
}