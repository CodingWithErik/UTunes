package com.example.eriks_000.utunes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eriks_000 on 2016-05-26.
 */
public class AlbumAdapter extends BaseAdapter {

    private ArrayList<AlbumItem> albumItems;
    private LayoutInflater layoutInflater;

    public AlbumAdapter(Context context, ArrayList<AlbumItem> albumItems)
    {
        this.albumItems = albumItems;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount(){
        return albumItems.size();
    }
    @Override
    public Object getItem(int position)
    {
        return albumItems.get(position);
    }
    @Override
    public long getItemId(int position)
    {
        return  position;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        if(convertView == null)
        {
            convertView =layoutInflater.inflate(R.layout.fragment_albumlist, parent, false);
            holder = new ViewHolder();
            holder.albumTextView = (TextView)convertView.findViewById(R.id.album);
            holder.artistTextView = (TextView)convertView.findViewById(R.id.artist);
            convertView.setTag(holder);


        }
        else
        {
            holder = (ViewHolder) convertView.getTag();

        }
        holder.albumTextView.setText(albumItems.get(position).getAlbumName());
        holder.artistTextView.setText(albumItems.get(position).getArtistName());


        return convertView;
    }

    static class ViewHolder
    {
        TextView albumTextView;
        TextView artistTextView;
        TextView priceTextView;
    }

}
