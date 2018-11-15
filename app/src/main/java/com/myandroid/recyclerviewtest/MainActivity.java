package com.myandroid.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Member> memberList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniMember();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //  水平移动
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //  瀑布流
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        MemberAdapter adapter = new MemberAdapter(memberList);
        recyclerView.setAdapter(adapter);
    }

    private void iniMember(){
        for(int i=0;i<10;i++){
            Member name1 = new Member(getRandomLengthName("小李"),R.drawable.a1);
            memberList.add(name1);
            Member name2 = new Member(getRandomLengthName("李风"),R.drawable.a2);
            memberList.add(name2);

            Member name3 = new Member(getRandomLengthName("王加加"),R.drawable.a3);
            memberList.add(name3);

            Member name4 = new Member(getRandomLengthName("中专业化"),R.drawable.a4);
            memberList.add(name4);

            Member name5 = new Member(getRandomLengthName("了一人"),R.drawable.a5);
            memberList.add(name5);

            Member name6 = new Member(getRandomLengthName("人要国"),R.drawable.a6);
            memberList.add(name6);

            Member name7 = new Member(getRandomLengthName("为不产"),R.drawable.a7);
            memberList.add(name7);

            Member name8 = new Member(getRandomLengthName("我人有的"),R.drawable.a8);
            memberList.add(name8);

            Member name9 = new Member(getRandomLengthName("工要在"),R.drawable.a9);
            memberList.add(name9);

            Member name10 = new Member(getRandomLengthName("在经以"),R.drawable.a10);
            memberList.add(name10);
        }
    }

    public String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
