package com.example.eriks_000.utunes;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

import java.util.Random;


/**
 * Created by eriks_000 on 2016-05-25.
 */
public class RegisterAccountFragment extends Fragment implements OnClickListener {

    EditText registerUsername;
    EditText registerPassword;
    EditText registerEmail;

    DummyUser tempUser;

    Button registerButton;

    passingInterface dataPasser;

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
        if(!registerUsername.getText().toString().equals("") && !registerPassword.getText().toString().equals("") && !registerEmail.getText().toString().equals("")){
            tempUser = newUser(registerUsername.getText().toString(), registerPassword.getText().toString(), registerEmail.getText().toString());
            passUser(tempUser);
        }
    }

    public DummyUser newUser(String username, String password, String email){
        Random randomNumber = new Random();
        int userID = randomNumber.nextInt(9000)+1000;
        DummyUser dummyUser = new DummyUser(username, password, email, userID);

        return dummyUser;
    }

    public void passUser(DummyUser dummyUser){
        dataPasser.userTransfer(dummyUser);
    }

    public interface passingInterface{
        void userTransfer(DummyUser dummyUser);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        try {
            dataPasser = (passingInterface) context;
        } catch(ClassCastException e){
            throw new ClassCastException(context.toString()+" must implement mydataBack");
        }
    }

    @Override
    public void onResume(){
        super.onResume();

        try {
            dataPasser = (passingInterface) getContext();
        } catch(ClassCastException e){
            throw new ClassCastException(getContext().toString()+" must implement mydataBack");
        }
    }
}
