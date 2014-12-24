package com.wangjie.draggableflagview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements DraggableFlagView.OnDraggableFlagViewListener, View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.main_btn).setOnClickListener(this);

        DraggableFlagView draggableFlagView = (DraggableFlagView) findViewById(R.id.main_dfv);
        draggableFlagView.setOnDraggableFlagViewListener(this);
        draggableFlagView.setText("7");


    }


    @Override
    public void onFlagDismiss(DraggableFlagView view) {
        Toast.makeText(this, "onFlagDismiss", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn:
                Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
