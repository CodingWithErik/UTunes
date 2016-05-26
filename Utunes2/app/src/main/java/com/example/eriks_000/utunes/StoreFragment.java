package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class StoreFragment extends Fragment implements OnClickListener {


    Button button;
    public StoreFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View storeView = inflater.inflate(R.layout.fragment_store, container, false);

        button = (Button)storeView.findViewById(R.id.nav_Disco);
        button.setOnClickListener(this);



        return storeView;
    }


    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        Class fragmentClass;
        switch (v.getId()) {
            case R.id.nav_Disco:
                fragmentClass = SongListFragment.class;
                break;
        }
    }

}