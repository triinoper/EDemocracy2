package com.example.focus.e_democracy;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Search extends Fragment {

    private RecyclerView recyclerView;
    private ProjectAdapterSearch adapter;
    private ArrayList<Project> projectArrayList;

    public Search() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        projectArrayList = new ArrayList<>();
        projectArrayList.add(new Project(R.string.title_1, "Making manholes level with the road surface", "Anyone using the roads in Tartu will have noticed and felt strong jolts when...", R.drawable.road));
        projectArrayList.add(new Project(R.string.title_2, "Tracks would run along the river bank starting from...", "987654321", R.drawable.tracks));
        projectArrayList.add(new Project(R.string.title_3, "There is a beach area on the left bank of the river...", "789456123", R.drawable.beach));
        projectArrayList.add(new Project(R.string.title_4, "A modern ice resurfacer would ensure the preservation of...", "321654987", R.drawable.icemashine));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_search_Id);

        adapter = new ProjectAdapterSearch(projectArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }

}
