package com.example.testfragment.data.dao

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game
import java.util.*

class GameDataSource{

    companion object {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun getGame (context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()



            games.add(Game(1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01"),
                    Console(2, "SNES", "Nintendo", "1996-12-01")
                )
                ))
            games.add(Game(2,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01"),
                    Console(2, "SNES", "Nintendo", "1996-12-01")
                )
            ))
            games.add(Game(3,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01"),
                    Console(2, "SNES", "Nintendo", "1996-12-01")
                )
            ))
            return games
        }

    }
}
