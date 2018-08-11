package com.example.kirill.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

import java.util.List;

//import androidx.recyclerview.widget.RecyclerView;


public class ActorRecyclerAdapter extends RecyclerView.Adapter<ActorRecyclerAdapter.ViewHolder> {

    private final List<Actor> actors;
    private final Context context;
    private final LayoutInflater inflater;

    public ActorRecyclerAdapter(Context context, List<Actor> actors) {
        this.actors = actors;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return actors.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_item_actor,
                parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // get our custom object from our dataset at this position
        Actor actor = actors.get(position);

        Glide.with(context).load("http://goo.gl/gEgYUd").into(holder.avatar);
        // Fill views with our data
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView avatar;

        public ViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}