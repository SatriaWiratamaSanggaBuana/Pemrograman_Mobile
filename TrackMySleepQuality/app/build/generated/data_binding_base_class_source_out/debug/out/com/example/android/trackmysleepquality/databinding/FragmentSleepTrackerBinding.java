// Generated by data binding compiler. Do not edit!
package com.example.android.trackmysleepquality.databinding;

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
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSleepTrackerBinding extends ViewDataBinding {
  @NonNull
  public final Button clearButton;

  @NonNull
  public final Button startButton;

  @NonNull
  public final Button stopButton;

  @NonNull
  public final TextView textview;

  @Bindable
  protected SleepTrackerViewModel mSleepTrackerViewModel;

  protected FragmentSleepTrackerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button clearButton, Button startButton, Button stopButton, TextView textview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clearButton = clearButton;
    this.startButton = startButton;
    this.stopButton = stopButton;
    this.textview = textview;
  }

  public abstract void setSleepTrackerViewModel(
      @Nullable SleepTrackerViewModel sleepTrackerViewModel);

  @Nullable
  public SleepTrackerViewModel getSleepTrackerViewModel() {
    return mSleepTrackerViewModel;
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_tracker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepTrackerBinding>inflateInternal(inflater, R.layout.fragment_sleep_tracker, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_tracker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepTrackerBinding>inflateInternal(inflater, R.layout.fragment_sleep_tracker, null, false, component);
  }

  public static FragmentSleepTrackerBinding bind(@NonNull View view) {
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
  public static FragmentSleepTrackerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSleepTrackerBinding)bind(component, view, R.layout.fragment_sleep_tracker);
  }
}
