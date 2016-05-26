package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.eriks_000.utunes.R;

/**
 * Created by Victor on 2016-05-26.
 */
public class UserLoginFragment extends Fragment {

    Button button;

    public UserLoginFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View loginView = inflater.inflate(R.layout.fragment_user_login, container, false);

        button = (Button)loginView.findViewById(R.id.button_UserLogin);
        //button.setOnClickListener(this);

        return loginView;
    }


}