package com.fyamei.app.tlibrary;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class T {

    public static void show(Context context,String string){
        Student student = new Student(string,3);
        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(student)+" 版本2.0.0";

        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
