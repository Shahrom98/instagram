package com.example.instagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
LinearLayoutManager linearLayoutManager;
InstagramAdapter adapter;

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recycle);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        List<instagram> list = List.of(
         new instagram("bmw_fun", "bmw", "Elegant powerful proportions. The all-new Bmw 4 Series Gran Coupe.", "#THE4 #BMW #BMWREPOST #BMWMOTORSPORT #BMWDIVERSITY #BMWM", R.drawable.bmw),
         new instagram("ilmhona", "ilmhona", "Cфера It стремительно развивается, появляются нрвые профессии", "#IT_гап #HUMOLAB #ALIFACADEMY #AMERICAN_SPACES_DUSHANBE", R.drawable.ilm),
         new instagram("ilmhona", "ilmhona", "ФФФФФФФФФФФФФФФФФФФФФФФФФФФФФФ", "#ILMHONA #ANDROID ", R.drawable.unnamed),
         new instagram("chempionsleague", "chempionsleague", "it's #UCLFINAL week  who are you supporting on Sututday", "#UCL #CHELSEA #MANCHESTERCITY #UCLFINAL", R.drawable.f),
         new instagram("ilmhona", "ilmhona", "EIDMUBARAK", "#EIDMUBARAK #EIDQURBAN #MUBARAK", R.drawable.id)
        );
        adapter = new InstagramAdapter(list);
        recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(adapter);
    recyclerView.setHasFixedSize(true);
    }
}