package com.example.focus.e_democracy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private RecyclerView recyclerView;
    private ProjectAdapter adapter;
    private ArrayList<Project> projectArrayList;
    public CharSequence text = "Proposal submitted!";
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        projectArrayList = new ArrayList<>();
        projectArrayList.add(new Project(R.string.title_1, "Making manholes level with the road surface", "Anyone using the roads in Tartu will have noticed and felt the strong jolts when driving across manhole covers. In some places the covers have sunk significantly. Driving across them damages cars and bikes and is not pleasant for those inside them or on them either. Making the manholes level with the road would benefit drivers, cyclists and people living next to the roads.", R.drawable.road));
        projectArrayList.add(new Project(R.string.title_2, "Tracks would run along the river bank starting from...", "Tracks would run along the river bank starting from Tähtvere Sports Park and including the Jänese hiking area and dendropark. The swampy river banks mean that a range of actions would need to be undertaken in order to construct such tracks.", R.drawable.tracks));
        projectArrayList.add(new Project(R.string.title_3, "There is a beach area on the left bank of the river...", "There is a beach area on the left bank of the river, situated further away from the official beach, which is in pretty bad shape – there is no convenient access to the water and only part of it is covered with sand. The beach area should be spruced up to ensure access to the water and full sand cover.", R.drawable.beach));
        projectArrayList.add(new Project(R.string.title_4, "A modern ice resurfacer would ensure the preservation of...", "A modern ice resurfacer would ensure the preservation of one of the healthiest, most romantic and most fun forms of entertainment going – ice-skating. This modern multifunctional machine can coat the ice on ice rinks as well as freeze, build, smooth and maintain it. Unreliable winters and sports-loving citizens of Tartu will keep the machine in business.", R.drawable.icemashine));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_home_Id);

        adapter = new ProjectAdapter(projectArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        //--toaster start

        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(getActivity().getApplicationContext(), text, duration);
        toast.show();
        //-- toaster end

        return view;

    }

}
