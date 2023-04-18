package com.example.tpanexo1menuconlogin.ui.musica;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.app.Service;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

public class MiMusicaViewModel extends AndroidViewModel {

    private Context context;
    public MiMusicaViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }
    // TODO: Implement the ViewModel

    public void play(View view){
        Intent intent = new Intent(context,ServicioMusica.class);
        context.startService(intent);
    }

    public void stop(View view){
        Intent intent = new Intent(context,ServicioMusica.class);
        context.stopService(intent);
    }

}