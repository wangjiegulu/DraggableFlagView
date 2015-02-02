DraggableFlagView
=================

可拖拽的红点，（仿新版QQ，tab下面拖拽标记为已读的效果），拖拽一定的距离可以消失回调。

<img src='https://raw.githubusercontent.com/wangjiegulu/DraggableFlagView/master/screenshot/draggableflagview.gif' height='500px'/>
<img src='https://raw.githubusercontent.com/wangjiegulu/DraggableFlagView/master/screenshot/draggableflagview_b.png' height='500px'/>
<img src='https://raw.githubusercontent.com/wangjiegulu/DraggableFlagView/master/screenshot/draggableflagview_c.png' height='500px'/>
<img src='https://raw.githubusercontent.com/wangjiegulu/DraggableFlagView/master/screenshot/draggableflagview_d.png' height='500px'/>

### main.xml
        <com.wangjie.draggableflagview.DraggableFlagView
                    xmlns:dfv="http://schemas.android.com/apk/res/com.wangjie.draggableflagview"
                    android:id="@+id/main_dfv"
                    android:layout_width="20dp"
                    android:layout_height="20dp"
                    android:layout_alignParentBottom="true"
                    android:layout_margin="15dp"
                    dfv:color="#FF3B30"
                    />

### MainActivity:
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

License
=======

    Copyright 2015 Wang Jie

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
