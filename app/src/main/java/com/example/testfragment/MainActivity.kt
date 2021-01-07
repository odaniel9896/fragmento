package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.testfragment.fragments.BlankFragment
import com.example.testfragment.fragments.ConsoleFragment
import com.example.testfragment.fragments.GamesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener{

    private lateinit var buttonHome : Button
    private lateinit var buttonConsole : Button
    private lateinit var buttonGames : Button

    private lateinit var homeFragment : BlankFragment
    private lateinit var gamesFragment : GamesFragment
    private lateinit var consoleFragment : ConsoleFragment

    private lateinit var bottonNavigation : BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonHome = findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)

        buttonConsole = findViewById(R.id.button_consoles)
        buttonConsole.setOnClickListener(this)

        buttonGames = findViewById(R.id.button_games)
        buttonGames.setOnClickListener(this)

        bottonNavigation = findViewById(R.id.bottom_navigation)
        bottonNavigation.setOnNavigationItemSelectedListener(this)

        homeFragment = BlankFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsoleFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, homeFragment).commit()

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, homeFragment).commit()
            }
            R.id.button_consoles -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, consoleFragment).commit()
            }
            R.id.button_games -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, gamesFragment).commit()
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.button_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, homeFragment).commit()
            }
            R.id.button_consoles -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, consoleFragment).commit()
            }
            R.id.button_games -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, gamesFragment).commit()
            }
        }
        return true
    }
}