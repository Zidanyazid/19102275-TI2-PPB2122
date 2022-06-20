// Generated by data binding compiler. Do not edit!
package com.zidanyazidhimawan_19102275.practice9.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zidanyazidhimawan_19102275.practice9.MainActivity;
import com.zidanyazidhimawan_19102275.practice9.R;
import com.zidanyazidhimawan_19102275.practice9.SettingModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSave;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPhone;

  @NonNull
  public final TextView tvTheme;

  @Bindable
  protected SettingModel mSettingModel;

  @Bindable
  protected MainActivity mAct;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSave, TextView textView, TextView textView2, TextView textView3, TextView textView4,
      TextView textView5, TextView tvAge, TextView tvEmail, TextView tvName, TextView tvPhone,
      TextView tvTheme) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSave = btnSave;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.tvAge = tvAge;
    this.tvEmail = tvEmail;
    this.tvName = tvName;
    this.tvPhone = tvPhone;
    this.tvTheme = tvTheme;
  }

  public abstract void setSettingModel(@Nullable SettingModel settingModel);

  @Nullable
  public SettingModel getSettingModel() {
    return mSettingModel;
  }

  public abstract void setAct(@Nullable MainActivity act);

  @Nullable
  public MainActivity getAct() {
    return mAct;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
