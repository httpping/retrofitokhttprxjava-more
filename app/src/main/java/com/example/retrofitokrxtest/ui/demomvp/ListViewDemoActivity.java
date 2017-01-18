package  com.example.retrofitokrxtest.ui.demomvp;

import android.os.Bundle;

import com.baseapp.comm.XsbRemindDialog;
import com.baseapp.mvp.BaseBackMvpActivity;


public class ListViewDemoActivity extends BaseBackMvpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setTitle("listdemo");

        addFragment(new ListDemoFragment());


        XsbRemindDialog.newInstance("对话框提醒确认",null).show(this);

    }


}
