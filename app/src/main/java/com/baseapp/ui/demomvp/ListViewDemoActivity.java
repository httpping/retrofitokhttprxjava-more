package  com.baseapp.ui.demomvp;

import android.os.Bundle;

import com.mvp.base.BaseBackMvpActivity;

public class ListViewDemoActivity extends BaseBackMvpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setTitle("listdemo");

        addFragment(new ListDemoFragment());


    }


}
