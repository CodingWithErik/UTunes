package com.example.eriks_000.utunes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class CartFragment extends Fragment {

    public CartFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View checkOutView = inflater.inflate(R.layout.fragment_checkout, container, false);

        return checkOutView;
    }


}