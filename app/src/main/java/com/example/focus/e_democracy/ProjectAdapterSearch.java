package com.example.focus.e_democracy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjectAdapterSearch extends RecyclerView.Adapter<ProjectAdapterSearch.EmployeeViewHolder> {

    private ArrayList<Project> dataList;

    public ProjectAdapterSearch(ArrayList<Project> dataList) {
        this.dataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.small_project, parent, false);// was home_project
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.txtProjectTitle.setText(dataList.get(position).getEmployeeName());
        holder.txtProjectShortDescription.setText(dataList.get(position).getEmployeeEmail());
        holder.imgProject.setImageResource(dataList.get(position).getProjectImage());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtProjectTitle, txtProjectShortDescription;
        ImageView imgProject;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            imgProject = (ImageView) itemView.findViewById(R.id.imageView);
            txtProjectTitle = (TextView) itemView.findViewById(R.id.txt_project_title);
            txtProjectShortDescription = (TextView) itemView.findViewById(R.id.txt_project_short_description);

        }
    }
}