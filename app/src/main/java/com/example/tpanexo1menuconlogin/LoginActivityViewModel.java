package com.example.tpanexo1menuconlogin;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpanexo1menuconlogin.models.Usuario;

public class LoginActivityViewModel extends AndroidViewModel {

    private Context context;

    private Usuario usuario= new Usuario("usuario@gmail.com","pass");;

    public LoginActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }


    public boolean verificarLogin(String email, String password){
        if(email.equals("") || password.equals("")){
            Toast.makeText(context,"debe ingresar un email y contrasenia!",Toast.LENGTH_LONG).show();
            return false;
        }
        else {
        Log.d("usuario que viene", email);
        Log.d("pass que viene", password);
        Log.d("usuario",usuario.getEmail());
        return (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) ;
        }
    }

    public void login(String mail, String pass){
        if(verificarLogin(mail,pass)){
            Toast.makeText(context,"usuario correcto!",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(context, NavigationActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }else {Toast.makeText(context,"Usuario y/o password incorrectos!",Toast.LENGTH_LONG).show();
             }
    }

}
