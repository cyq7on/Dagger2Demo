package com.cyq7on.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.cyq7on.dagger2demo.component.DaggerSecondComponent;
import com.cyq7on.dagger2demo.component.SecondComponent;
import com.cyq7on.dagger2demo.model.Cloth;
import com.cyq7on.dagger2demo.model.ClothHandler;
import com.cyq7on.dagger2demo.module.SecondModule;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Inject
    Cloth blueCloth;

    @Inject
    ClothHandler clothHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        SecondComponent component = DaggerSecondComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .secondModule(new SecondModule())
                .build();
        component.inject(this);
        textView.setText("蓝布料加工后变成了" + clothHandler.handle(blueCloth) + "\nclothHandler地址:" + clothHandler);
    }
}
