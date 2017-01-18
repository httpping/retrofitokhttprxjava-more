// Generated code from Butter Knife. Do not modify!
package com.example.retrofitokrxtest.ui.demomvp;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.base.app.R;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListDemoFragment_ViewBinding<T extends ListDemoFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ListDemoFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.recycleView = Utils.findRequiredViewAsType(source, R.id.recycle_view, "field 'recycleView'", RecyclerView.class);
    target.ptrFrameLayout = Utils.findRequiredViewAsType(source, R.id.ptr_frame_layout, "field 'ptrFrameLayout'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.recycleView = null;
    target.ptrFrameLayout = null;

    this.target = null;
  }
}