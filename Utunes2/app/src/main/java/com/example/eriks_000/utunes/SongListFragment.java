package com.example.eriks_000.utunes;

        import android.support.v4.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class SongListFragment extends Fragment {

    public SongListFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View songListView = inflater.inflate(R.layout.fragment_songlist, container, false);

        return songListView;
    }

    //TODO: dynamicly generate a list of songs based on chosen genre
}