package com.example.testfragment.fragments

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.GameAdapter
import com.example.testfragment.data.dao.GameDataSource
import com.example.testfragment.model.Game


class GamesFragment : Fragment() {

    private lateinit var  recyclerGames: RecyclerView
    private var  gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        recyclerGames = view.findViewById(R.id.recycle_view_games)

        // FORMA QUE A LISTA SERA EXIBIDA, SEM FALAR SE É HORIZONTAL OU VERTICAL O PADRAO JÁ É VERTIFCAL
        recyclerGames.layoutManager = LinearLayoutManager(view.context)

        recyclerGames.adapter = gameAdapter

        gameList = GameDataSource.getGame(view.context)

        gameAdapter.updateGmeList(gameList)

        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_game, menu)
    }



}