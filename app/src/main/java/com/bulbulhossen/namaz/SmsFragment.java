package com.bulbulhossen.namaz;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class SmsFragment extends Fragment {

    private MediaPlayer mp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sms_fragment, container, false);

        ImageView aud = (ImageView) rootView.findViewById(R.id.audio);
        ImageView sto = (ImageView) rootView.findViewById(R.id.stop);


        aud.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getContext(), R.raw.sound);
                mp.start();
            }

        });

        sto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getContext(), R.raw.dd);
                mp.start();
            }
        });


        return rootView;
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    }




