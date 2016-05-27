package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class ForgottenPasswordFragment extends Fragment {

    public ForgottenPasswordFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View forgottenView = inflater.inflate(R.layout.fragment_forgotten_password, container, false);

        return forgottenView;
    }
}
