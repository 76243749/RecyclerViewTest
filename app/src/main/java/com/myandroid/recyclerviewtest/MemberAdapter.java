package com.myandroid.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2018/10/26.
 */

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.ViewHolder> {
    private List<Member> smemberList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View memberView;
        ImageView memberImage;
        TextView memberName;
        public ViewHolder(View view){
            super(view);
            memberView = view;
            memberImage = (ImageView) view.findViewById(R.id.member_image);
            memberName = (TextView) view.findViewById(R.id.member_name);
        }
    }

    public MemberAdapter(List<Member> memberList){
        smemberList = memberList;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.memberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
                Member member = smemberList.get(postion);
                Toast.makeText(v.getContext(),"点击的是："+member.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.memberImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
                Member member = smemberList.get(postion);
                Toast.makeText(v.getContext(),"点击的是："+member.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        //ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Member member = smemberList.get(position);
        holder.memberImage.setImageResource(member.getImageId());
        holder.memberName.setText(member.getName());
    }

    @Override
    public int getItemCount(){
        return smemberList.size();

    }
}
