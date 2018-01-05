package com.cyq7on.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cyq7on.dagger2demo.model.Cloth;
import com.cyq7on.dagger2demo.model.ClothHandler;
import com.cyq7on.dagger2demo.model.Clothes;
import com.cyq7on.dagger2demo.model.Shoe;
import com.cyq7on.dagger2demo.module.MainModule;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    @Inject
    @Named("red")
    Cloth redCloth;

    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Inject
    Shoe shoe;

    @Inject
    Clothes clothes;

    @Inject
    ClothHandler clothHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SecondActivity.class));
            }
        });
        /*MainComponent component = DaggerMainComponent.builder()
                .mainModule(new MainModule()).build();
        component.inject(this);
        textView.setText(redCloth + "and" + "and" + blueCloth + "and" +
                        shoe + "and" + clothes + "\n" +
                "cloth是否为同一个对象" + (blueCloth == clothes.getCloth()));*/

        // page2
        /*MainComponent build = DaggerMainComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .mainModule(new MainModule())
                .build();
        build.inject(this);
        textView.setText("红布料加工后变成了" + clothHandler.handle(redCloth) + "\nclothHandler地址:" + clothHandler);*/

        //page3
        MyApplication application = (MyApplication) getApplication();
        application.getBaseComponent().getSubMainComponent(new MainModule()).inject(this);
        textView.setText("红布料加工后变成了" +
                clothHandler.handle(redCloth) + "\nclothHandler地址:" + clothHandler);
    }
}
