package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.ConsoleAdapter
import com.example.testfragment.data.dao.ConsoleDataSource
import com.example.testfragment.model.Console


class ConsoleFragment : Fragment() {

    private lateinit var recycleConsole: RecyclerView
    private var consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_console, container, false )

        recycleConsole = view.findViewById(R.id.recycle_view_console)

        recycleConsole.layoutManager = LinearLayoutManager(view.context)

        recycleConsole.adapter = consoleAdapter

        consoleList = ConsoleDataSource.getConsole(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        setHasOptionsMenu(true)

        return view


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_home, menu)
    }


}