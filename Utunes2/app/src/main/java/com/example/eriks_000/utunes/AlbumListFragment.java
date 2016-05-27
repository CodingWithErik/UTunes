package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class AlbumListFragment extends Fragment {

    private int albumCount;
    private int genre;

    public AlbumListFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View albumListView = inflater.inflate(R.layout.fragment_albumlist, container, false);

        ArrayList<AlbumItem> album_details = getListData();
        final ListView listView = (ListView) albumListView.findViewById(R.id.album_listView);
        AlbumAdapter adapter = new AlbumAdapter(this.getActivity(), album_details);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                AlbumItem albumItem = (AlbumItem) o;
                Toast.makeText(getActivity(), "Selected :" + "" + albumItem, Toast.LENGTH_LONG).show();
            }
        });


        return albumListView;
    }
    private ArrayList<AlbumItem> getListData()
    {
        ArrayList<AlbumItem> results = new ArrayList<AlbumItem>();
        AlbumItem albumItem = new AlbumItem();
        albumItem.setAlbumName("Smurfhits");
        albumItem.setArtistName("Smurfarna");
        results.add(albumItem);
        albumItem = new AlbumItem();
        albumItem.setAlbumName("Smurfhits1");
        albumItem.setArtistName("Smurfarna");
        results.add(albumItem);

        return results;
    }



    //TODO: dynamicly generate a list of songs based on chosen genre
}