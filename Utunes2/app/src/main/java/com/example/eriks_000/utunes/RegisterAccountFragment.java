package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class RegisterAccountFragment extends Fragment {

    public RegisterAccountFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View registerView = inflater.inflate(R.layout.fragment_admin, container, false);

        return registerView;
    }
}
