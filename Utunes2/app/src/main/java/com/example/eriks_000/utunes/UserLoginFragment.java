package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.eriks_000.utunes.R;

/**
 * Created by Victor on 2016-05-26.
 */
public class UserLoginFragment extends Fragment implements OnClickListener{

    Button buttonLogin;
    Button buttonRegister;
    Button buttonForgotten;

    int fragmentId;

    public UserLoginFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View loginView = inflater.inflate(R.layout.fragment_user_login, container, false);

        buttonLogin = (Button)loginView.findViewById(R.id.button_UserLogin);
        buttonRegister = (Button)loginView.findViewById(R.id.button_RegisterAccount);
        buttonForgotten = (Button)loginView.findViewById(R.id.button_ForgottenPassword);

        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);
        buttonForgotten.setOnClickListener(this);

        return loginView;
    }

    @Override
    public void onClick(View v){

    }

    public int getFragmentId(){
        return this.fragmentId;
    }
}