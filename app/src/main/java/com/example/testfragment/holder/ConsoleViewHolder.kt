package com.example.testfragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleViewHolder(itemView : View): RecyclerView.ViewHolder(itemView ) {
    var consoleNameHolder = itemView.findViewById<TextView>(R.id.console_name)
    var consoleMake = itemView.findViewById<TextView>(R.id.console_maker)
    var consoleDate = itemView.findViewById<TextView>(R.id.console_date)
    var consoleImagem = itemView.findViewById<ImageView>(R.id.console_image)

    fun bind (console : Console) {
        consoleNameHolder.text = console.consoleName
        consoleMake.text = console.consoleMaker
        consoleDate.text = console.consoleReleaseDate
        consoleImagem.setImageDrawable(console.consoleImage)
    }
}