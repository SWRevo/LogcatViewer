// Generated by view binder compiler. Do not edit!
package com.swrevo.logcatviewer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.swrevo.logcatviewer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLogcatBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView content;

  @NonNull
  public final TextView tag;

  @NonNull
  public final TextView time;

  private ItemLogcatBinding(@NonNull RelativeLayout rootView, @NonNull TextView content,
      @NonNull TextView tag, @NonNull TextView time) {
    this.rootView = rootView;
    this.content = content;
    this.tag = tag;
    this.time = time;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLogcatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLogcatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_logcat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLogcatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content;
      TextView content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }

      id = R.id.tag;
      TextView tag = rootView.findViewById(id);
      if (tag == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = rootView.findViewById(id);
      if (time == null) {
        break missingId;
      }

      return new ItemLogcatBinding((RelativeLayout) rootView, content, tag, time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
