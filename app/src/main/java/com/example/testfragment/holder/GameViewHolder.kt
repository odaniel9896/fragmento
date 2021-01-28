package com.example.testfragment.holder



import android.view.View
import android.widget.RatingBar
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Game
import kotlinx.android.synthetic.main.holder_game_recycler_view.view.*

class GameViewHolder(itemView : View): RecyclerView.ViewHolder(itemView ) {
     var textGamename = itemView.findViewById<TextView>(R.id.title_game);
    var textGmeDescription = itemView.findViewById<TextView>(R.id.text_view_description);
    var ratingBarGame = itemView.findViewById<RatingBar>(R.id.rating_bar_game);

    fun bind(game: Game) {
        textGamename.text = game.gameName
        textGmeDescription.text = game.gameDescription
        ratingBarGame.rating = game.gameRating
    }

}