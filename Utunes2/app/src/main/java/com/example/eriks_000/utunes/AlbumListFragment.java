package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class AlbumListFragment extends Fragment {

    private int albumCount;
    private int genre;

    ArrayList<AlbumItem> albumItems = new ArrayList<AlbumItem>();

    public AlbumListFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View albumListView = inflater.inflate(R.layout.fragment_albumlist, container, false);

        getAlbums(30, 1);

        ArrayAdapter<AlbumItem> albumAdapter = new ArrayAdapter<AlbumItem>(
                getActivity(),
                R.layout.item_album,
                R.id.list_item_album_textview,
                albumItems );

        ListView listView = (ListView) albumListView.findViewById(
                R.id.album_listView);

        listView.setAdapter(albumAdapter);

        return albumListView;
    }

    public void getAlbums(int albumCount, int genre)
    {

        for(int i = 0; i < albumCount; i++)
        {
            AlbumItem albumItem = new AlbumItem(i, genre, "Album"+1);
            albumItems.add(i, albumItem);
        }

    }

    //TODO: dynamicly generate a list of songs based on chosen genre
}