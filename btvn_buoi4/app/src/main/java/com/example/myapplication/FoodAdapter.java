package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List<Food> menuFood;

    public FoodAdapter(List<Food> creMenuFood) {
        this.menuFood = creMenuFood;
    }

    public List<Food> getMenuFood() {
        return menuFood;
    }

    public void setMenuFood(List<Food> menuFood) {
        this.menuFood = menuFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.setData(menuFood.get(position));
    }

    @Override
    public int getItemCount() {
        return menuFood != null? menuFood.size():0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        private ImageView avatar;
        private TextView v1, v2, v3, v4;
        private View v;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar=itemView.findViewById(R.id.avatar);
            v=itemView.findViewById(R.id.v);
            v1=itemView.findViewById(R.id.v1);
            v2=itemView.findViewById(R.id.v2);
            v3=itemView.findViewById(R.id.v3);
            v4=itemView.findViewById(R.id.v4);

        }

        public void setData(Food food) {
            avatar.setImageResource(food.getImage());
            v1.setText(food.getTitle());
            v2.setText(food.getFanSize());
            v3.setText(food.getUpdate());
            v4.setText(food.getStatus());
        }

    }
}
