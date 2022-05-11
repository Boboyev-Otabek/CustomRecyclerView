package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.Adapter.CustomAdapter;
import com.example.myapplication.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        List<Member> members = new ArrayList<>();

        members.add(new Member("Otabek","Boboyev"));
        members.add(new Member("Otabek","Boboyev"));
        members.add(new Member("Otabek","Boboyev"));
        members.add(new Member("Otabek","Boboyev"));
        members.add(new Member("Otabek","Boboyev"));


        refreshAdapter(members);
    }

    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adaptyer = new CustomAdapter(context, members);
        recyclerView.setAdapter(adaptyer);
    }


}