package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Member> members;

    public CustomAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item, viewGroup, false);
        return new CustomViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member member = members.get(position);

        if (holder instanceof CustomViewholder) {
            TextView ism = ((CustomViewholder) holder).ism;
            TextView familiya = ((CustomViewholder) holder).familiya;

            ism.setText(member.getIsm());
            familiya.setText(member.getFamiliya());
        }
    }


}

class CustomViewholder extends RecyclerView.ViewHolder {
    View view;
    TextView ism, familiya;

    CustomViewholder(View v) {
        super(v);
        this.view = v;
        ism = view.findViewById(R.id.ism);
        familiya = view.findViewById(R.id.familiya);
    }
}
