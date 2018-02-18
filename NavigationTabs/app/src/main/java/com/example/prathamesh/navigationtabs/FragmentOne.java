package com.example.prathamesh.navigationtabs;

/**
 * Created by PRATHAMESH on 17-02-2018.
 */

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by PRATHAMESH on 11-02-2018.
 */

public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one,container,false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn = (Button) getActivity().findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowAlertDialog();

            }
        });




    }

    private void ShowAlertDialog(){

        AlertDialog.Builder myBuilder = new AlertDialog.Builder(getContext());
        myBuilder.setTitle("My Dialog Box")
                .setPositiveButton("Positive", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Positive", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Negative", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Negative", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alert = myBuilder.create();
        alert.show();
    }
}

