package edu.upc.dsa.ejemplominimo2;

import edu.upc.dsa.ejemplominimo2.Models.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{

    private List<User> UserList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt;
        public View layout;
        public ImageView image;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txt = (TextView) v.findViewById(R.id.recyclertext);
            image=(ImageView) v.findViewById(R.id.recyclerimage);
        }
    }

    public RecyclerAdapter(List<User> myDataset)
    {
        UserList = myDataset;
        LayoutInflater inflater;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View v = inflater.inflate(R.layout.recycler_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.txt.setText(UserList.get(position).getLogin());
        Context context = holder.image.getContext();
        Picasso.with(context).load(UserList.get(position).getAvatar_url()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return UserList.size();
    }
}
