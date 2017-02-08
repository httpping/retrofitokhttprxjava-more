// Generated code from Butter Knife. Do not modify!
package com.example.retrofitokrxtest.ui.demomvp;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.base.app.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MvpDemoFragment_ViewBinding implements Unbinder {
  private MvpDemoFragment target;

  @UiThread
  public MvpDemoFragment_ViewBinding(MvpDemoFragment target, View source) {
    this.target = target;

    target.button2 = Utils.findRequiredViewAsType(source, R.id.button2, "field 'button2'", Button.class);
    target.RelativeLayout1 = Utils.findRequiredViewAsType(source, R.id.RelativeLayout1, "field 'RelativeLayout1'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MvpDemoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.button2 = null;
    target.RelativeLayout1 = null;
  }
}
