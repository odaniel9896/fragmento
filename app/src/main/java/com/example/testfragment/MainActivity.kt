package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.testfragment.fragments.BlankFragment
import com.example.testfragment.fragments.ConsoleFragment
import com.example.testfragment.fragments.GamesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener{

    private lateinit var buttonHome : Button
    private lateinit var buttonConsole : Button
    private lateinit var buttonGames : Button
    private lateinit var  toolbar: Toolbar

    private lateinit var homeFragment : BlankFragment
    private lateinit var gamesFragment : GamesFragment
    private lateinit var consoleFragment : ConsoleFragment

    private lateinit var drawer : DrawerLayout

    private lateinit var bottomNavigation : BottomNavigationView
    private lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation)


        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("Home")

        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer)

        var toggle = ActionBarDrawerToggle(this, drawer,
            toolbar,
            R.string.open_drawer,
            R.string.open_drawer)

        drawer.addDrawerListener(toggle)

        //guarda o estado atual do drawble
        toggle.syncState()

        homeFragment = BlankFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsoleFragment()

        setFragment(homeFragment)
    }

  override fun onClick(v: View) {

   }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_home -> {
                toolbar.title = "Home"
                setFragment(homeFragment)
            }

            R.id.menu_console -> {
                toolbar.title = "Console"
                setFragment(consoleFragment)
            }
            R.id.menu_games -> {
                toolbar.title = "Games"
                setFragment(gamesFragment)

            }
        }
            //MUDA A COR DO BOTTOM NAVIGATION
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }
    fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment).commit()
    }
}