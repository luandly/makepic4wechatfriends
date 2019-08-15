package com.example.expandtextview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expandtextview.R;
import com.example.expandtextview.view.ExpandTextView;

import java.util.List;

/**
 * @作者: njb
 * @时间: 2019/7/25 10:47
 * @描述:
 */
public class CircleAdapter extends RecyclerView.Adapter<CircleAdapter.CircleViewHolder>{
    private Context context;

    private List<String> list;
    private LayoutInflater layoutInflater;
    private MyClickListener myClickListener;

    public CircleAdapter(Context context, List<String> list,MyClickListener myClickListener) {
        this.context = context;
        this.list = list;
        this.layoutInflater = LayoutInflater.from(context);
        this.myClickListener = myClickListener;
    }

    @NonNull
    @Override
    public CircleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_circle,
                parent, false);
        CircleViewHolder circleViewHolder = new CircleViewHolder(view);
        return circleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CircleViewHolder holder, final int position) {
        holder.expandTextView.setText(list.get(position));
        holder.ivComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myClickListener != null){
                    myClickListener.onClick(position,view);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class CircleViewHolder extends RecyclerView.ViewHolder {
        ExpandTextView expandTextView;
        ImageView ivComment;
        public CircleViewHolder(@NonNull View itemView) {
            super(itemView);
            expandTextView = itemView.findViewById(R.id.expand_textView);
            ivComment = itemView.findViewById(R.id.iv_edit);
        }
    }

    public interface MyClickListener{
        void onClick(int position,View v);
    }


}
