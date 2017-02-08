// Generated code from Butter Knife. Do not modify!
package com.baseapp.comm;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.base.app.R;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebViewFragment_ViewBinding implements Unbinder {
  private WebViewFragment target;

  @UiThread
  public WebViewFragment_ViewBinding(WebViewFragment target, View source) {
    this.target = target;

    target.mPtrFrame = Utils.findRequiredViewAsType(source, R.id.rotate_header_web_view_frame, "field 'mPtrFrame'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WebViewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPtrFrame = null;
  }
}
