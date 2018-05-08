package com.example.focus.e_democracy;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.EmployeeViewHolder> {

    private ArrayList<Project> dataList;

    public ProjectAdapter(ArrayList<Project> dataList) {
        this.dataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_project, parent, false);// was home_project
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.txtProjectTitle.setText(dataList.get(position).getEmployeeName());
        holder.txtProjectShortDescription.setText(dataList.get(position).getEmployeeEmail());
        holder.txtProjectLongDescription.setText(dataList.get(position).getEmployeePhone());
        holder.imgProject.setImageResource(dataList.get(position).getProjectImage());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtProjectTitle, txtProjectShortDescription, txtProjectLongDescription;
        ImageView imgProject;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            txtProjectTitle = (TextView) itemView.findViewById(R.id.txt_project_title);
            txtProjectShortDescription = (TextView) itemView.findViewById(R.id.txt_project_short_description);
            txtProjectLongDescription = (TextView) itemView.findViewById(R.id.txt_project_long_description);
            imgProject = (ImageView) itemView.findViewById(R.id.take_photo_id);
            //---lets try click on project
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(v.getContext(), ProjectDetailsActivity.class));
                }
            });
            //---lets try click on project end
        }
    }
}