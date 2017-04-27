package com.example.siam.chitchatstable20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentThree extends Fragment {

    View v3;
    Button buy, sell;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v3 = inflater.inflate(R.layout.fragment_three_layout , container, false);

        buy = (Button) v3.findViewById(R.id.btnBuy);
        sell = (Button) v3.findViewById(R.id.btnSale);

        buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                //Toast.makeText(getActivity(),"Task in Progress", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getActivity(), ImageListActivity.class);
                startActivity(i);
            }
        });

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                //Toast.makeText(getActivity(),"Task in Progress", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);

            }
        });



        return v3;
    }
}