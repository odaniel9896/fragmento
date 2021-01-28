package com.example.testfragment.holder



import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Game
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.holder_game_recycler_view.view.*

class GameViewHolder(itemView : View): RecyclerView.ViewHolder(itemView ) {
     var textGamename = itemView.findViewById<TextView>(R.id.title_game);
    var textGmeDescription = itemView.findViewById<TextView>(R.id.text_view_description);
    var ratingBarGame = itemView.findViewById<RatingBar>(R.id.rating_bar_game);
    var imageGame = itemView.findViewById<ImageView>(R.id.image_game)
    var chipGroupConsole = itemView.findViewById<ChipGroup>(R.id.chip_group_console)


    fun bind(game: Game) {
        textGamename.text = game.gameName
        textGmeDescription.text = game.gameDescription
        ratingBarGame.rating = game.gameRating
        imageGame.setImageDrawable(game.gameImage)

        for (console in game.consoles) {

            val chip = Chip(ContextThemeWrapper(itemView.context, R.style.ChipTextAparrence), null, 0)
            chip.text = console.consoleName
            chipGroupConsole.addView(chip)
        }

    }

}