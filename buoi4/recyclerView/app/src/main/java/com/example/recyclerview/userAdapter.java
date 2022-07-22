package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userViewHolder> {
    private List<User> mListUser;

    public userAdapter(List<User> mListUser) {
        this.mListUser = mListUser;
    }

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new userViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {

        User user= mListUser.get(position);
        if(user==null){
            return;
        }

        holder.avatar.setImageResource(user.getId());
        holder.v1.setText(user.getName());
        holder.v2.setText(user.getAdrress());
    }

    @Override
    public int getItemCount() {
        if(mListUser != null){
            return mListUser.size();
        }
        return 0;
    }

    public class userViewHolder extends RecyclerView.ViewHolder{
         private ImageView avatar;
         private TextView v1,v2;

        public userViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar= itemView.findViewById(R.id.avatar);
            v1= itemView.findViewById(R.id.v1);
            v2= itemView.findViewById(R.id.v2);

        }
    }
}
