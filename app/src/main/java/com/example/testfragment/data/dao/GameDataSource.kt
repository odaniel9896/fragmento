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
                "Pokemon Sword",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!),
                    Console(2, "SNES", "Nintendo", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!)
                )
                ))
            games.add(Game(2,
                "Pokemon shield",
                context.getDrawable(R.drawable.pokemo)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!),
                    Console(2, "SNES", "Nintendo", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!)
                )
            ))
            games.add(Game(3,
                "Bixo",
                context.getDrawable(R.drawable.shield)!!,
                "Mortal Kombat é um jogo",
                4.5f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!),
                    Console(2, "SNES", "Nintendo", "1996-12-01", context.getDrawable(R.drawable.nintendo)!!)
                )
            ))
            return games
        }

    }
}
