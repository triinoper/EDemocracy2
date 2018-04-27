package com.example.focus.e_democracy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter{
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent,false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Data.title.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mTitleText;
        private TextView mShortText;
        private TextView mFullText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView){

            super(itemView);
            mItemImage = (ImageView) itemView.findViewById(R.id.itemImage);
            mTitleText = (TextView) itemView.findViewById(R.id.titleID);
            mShortText = (TextView) itemView.findViewById(R.id.shortDescriptionID);
            mFullText = (TextView) itemView.findViewById(R.id.fullDescriptionID);
            itemView.setOnClickListener(this);
        }
        public void bindView(int position) {
            mTitleText.setText(Data.title[position]);
            mShortText.setText(Data.shortDesc[position]);
            mFullText.setText(Data.fullDesc[position]);
            mItemImage.setImageResource(Data.picturePath[position]);
        }
        public void onClick(View view){

        }

    }
}
