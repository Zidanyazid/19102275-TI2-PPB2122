package com.zidanyazidhimawan_19102275.practice9.databinding;
import com.zidanyazidhimawan_19102275.practice9.R;
import com.zidanyazidhimawan_19102275.practice9.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.zidanyazidhimawan_19102275.practice9.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView2, 8);
        sViewsWithIds.put(R.id.textView3, 9);
        sViewsWithIds.put(R.id.textView4, 10);
        sViewsWithIds.put(R.id.textView5, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.btnSave.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.tvAge.setTag(null);
        this.tvEmail.setTag(null);
        this.tvName.setTag(null);
        this.tvPhone.setTag(null);
        this.tvTheme.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.zidanyazidhimawan_19102275.practice9.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.act == variableId) {
            setAct((com.zidanyazidhimawan_19102275.practice9.MainActivity) variable);
        }
        else if (BR.settingModel == variableId) {
            setSettingModel((com.zidanyazidhimawan_19102275.practice9.SettingModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAct(@Nullable com.zidanyazidhimawan_19102275.practice9.MainActivity Act) {
        this.mAct = Act;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.act);
        super.requestRebind();
    }
    public void setSettingModel(@Nullable com.zidanyazidhimawan_19102275.practice9.SettingModel SettingModel) {
        this.mSettingModel = SettingModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.settingModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String settingModelPhoneNumber = null;
        java.lang.String textUtilsIsEmptySettingModelNameTextViewAndroidStringDefaultNameSettingModelName = null;
        boolean textUtilsIsEmptySettingModelPhoneNumber = false;
        java.lang.String settingModelAgeInt0JavaLangStringSettingModelAgeTvAgeAndroidStringDefaultAge = null;
        java.lang.String settingModelEmail = null;
        java.lang.String settingModelName = null;
        java.lang.String textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName = null;
        java.lang.String settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme = null;
        boolean settingModelIsDarkTheme = false;
        com.zidanyazidhimawan_19102275.practice9.MainActivity act = mAct;
        java.lang.String javaLangStringSettingModelAge = null;
        boolean settingModelIsDarkThemeBooleanTrue = false;
        java.lang.String textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber = null;
        boolean textUtilsIsEmptySettingModelName = false;
        int settingModelAge = 0;
        com.zidanyazidhimawan_19102275.practice9.SettingModel settingModel = mSettingModel;
        boolean settingModelAgeInt0 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (settingModel != null) {
                    // read settingModel.phoneNumber
                    settingModelPhoneNumber = settingModel.getPhoneNumber();
                    // read settingModel.email
                    settingModelEmail = settingModel.getEmail();
                    // read settingModel.name
                    settingModelName = settingModel.getName();
                    // read settingModel.isDarkTheme
                    settingModelIsDarkTheme = settingModel.isDarkTheme();
                    // read settingModel.age
                    settingModelAge = settingModel.getAge();
                }


                // read TextUtils.isEmpty(settingModel.phoneNumber)
                textUtilsIsEmptySettingModelPhoneNumber = android.text.TextUtils.isEmpty(settingModelPhoneNumber);
                // read TextUtils.isEmpty(settingModel.name)
                textUtilsIsEmptySettingModelName = android.text.TextUtils.isEmpty(settingModelName);
                // read settingModel.isDarkTheme == true
                settingModelIsDarkThemeBooleanTrue = (settingModelIsDarkTheme) == (true);
                // read settingModel.age > 0
                settingModelAgeInt0 = (settingModelAge) > (0);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptySettingModelPhoneNumber) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptySettingModelName) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(settingModelIsDarkThemeBooleanTrue) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(settingModelAgeInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
                settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme = ((settingModelIsDarkThemeBooleanTrue) ? (tvTheme.getResources().getString(R.string.dark_theme)) : (tvTheme.getResources().getString(R.string.light_theme)));
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
                textUtilsIsEmptySettingModelNameTextViewAndroidStringDefaultNameSettingModelName = ((textUtilsIsEmptySettingModelName) ? (textView.getResources().getString(R.string.default_name)) : (settingModelName));
                // read TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
                textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName = ((textUtilsIsEmptySettingModelName) ? (tvName.getResources().getString(R.string.default_name)) : (settingModelName));
                // read TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
                textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber = ((textUtilsIsEmptySettingModelPhoneNumber) ? (tvPhone.getResources().getString(R.string.default_phone)) : (settingModelPhoneNumber));
        }
        if ((dirtyFlags & 0x40L) != 0) {

                // read ("") + (settingModel.age)
                javaLangStringSettingModelAge = ("") + (settingModelAge);
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
                settingModelAgeInt0JavaLangStringSettingModelAgeTvAgeAndroidStringDefaultAge = ((settingModelAgeInt0) ? (javaLangStringSettingModelAge) : (tvAge.getResources().getString(R.string.default_age)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnSave.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, textUtilsIsEmptySettingModelNameTextViewAndroidStringDefaultNameSettingModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAge, settingModelAgeInt0JavaLangStringSettingModelAgeTvAgeAndroidStringDefaultAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, settingModelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTheme, settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // act
        com.zidanyazidhimawan_19102275.practice9.MainActivity act = mAct;
        // act != null
        boolean actJavaLangObjectNull = false;



        actJavaLangObjectNull = (act) != (null);
        if (actJavaLangObjectNull) {


            act.openSetting();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): act
        flag 1 (0x2L): settingModel
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 4 (0x5L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 5 (0x6L): settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
        flag 6 (0x7L): settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
        flag 7 (0x8L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 8 (0x9L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 9 (0xaL): settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
        flag 10 (0xbL): settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
        flag 11 (0xcL): TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
        flag 12 (0xdL): TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
    flag mapping end*/
    //end
}