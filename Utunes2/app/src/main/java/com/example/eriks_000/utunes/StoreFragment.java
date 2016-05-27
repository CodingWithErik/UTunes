package com.example.eriks_000.utunes;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * Created by eriks_000 on 2016-05-25.
 */
public class StoreFragment extends Fragment implements OnClickListener {


    Button b_Pop, b_Rock, b_Jazz, b_Reggae, b_Metal;
    passingInterface dataPasser;

    public StoreFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View storeView = inflater.inflate(R.layout.fragment_store, container, false);

        b_Pop = (Button)storeView.findViewById(R.id.nav_Pop);
        b_Rock = (Button)storeView.findViewById(R.id.nav_Rock);
        b_Jazz = (Button)storeView.findViewById(R.id.nav_Jazz);
        b_Metal = (Button)storeView.findViewById(R.id.nav_Metal);
        b_Reggae = (Button)storeView.findViewById(R.id.nav_Reggae);

        b_Pop.setOnClickListener(this);
        b_Rock.setOnClickListener(this);
        b_Jazz.setOnClickListener(this);
        b_Metal.setOnClickListener(this);
        b_Reggae.setOnClickListener(this);

        return storeView;
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.nav_Pop){
            dataPasser.genre(1);
        }
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



    public interface passingInterface{
        public void genre(int data);
    }

}