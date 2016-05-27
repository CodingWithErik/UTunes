package com.example.eriks_000.utunes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


/**
 * Created by eriks_000 on 2016-05-25.
 */
public class RegisterAccountFragment extends Fragment implements OnClickListener {

    EditText registerUsername;
    EditText registerPassword;
    EditText registerEmail;

    Button registerButton;


    public RegisterAccountFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View registerView = inflater.inflate(R.layout.fragment_register_account, container, false);

        registerUsername = (EditText) registerView.findViewById(R.id.register_username);
        registerPassword = (EditText) registerView.findViewById(R.id.register_password);
        registerEmail = (EditText) registerView.findViewById(R.id.register_email);

        registerButton = (Button) registerView.findViewById(R.id.register_finish);

        registerButton.setOnClickListener(this);

        return registerView;
    }

    @Override
    public void onClick(View v){

    }

}
