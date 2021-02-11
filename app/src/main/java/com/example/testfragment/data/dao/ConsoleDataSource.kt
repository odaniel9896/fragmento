package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object {
        fun getConsole(context: Context) : ArrayList<Console> {
            var consoles =  ArrayList<Console>()

            consoles.add(Console(1, "Nintendo Switch", "Nintendo", "03/07/2017", context.getDrawable(R.drawable.nintendo)!!))

            consoles.add(Console(2, "Playstation 4", "Sony", "15/11/2013", context.getDrawable(R.drawable.ps4360)!!))

            consoles.add(Console(3, "Xbox 360", "Microsoft", "22/11/2017", context.getDrawable(R.drawable.xbox)!!))

            return consoles
        }
    }
}