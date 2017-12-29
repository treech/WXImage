package com.rcs.imageeditlibrary.editimage.fragment;


import android.support.v4.app.Fragment;

import com.rcs.imageeditlibrary.editimage.EditImageActivity;
import com.rcs.imageeditlibrary.editimage.contorl.SaveMode;

public abstract class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    protected EditImageActivity activity;

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        switch (SaveMode.getInstant().getMode()) {
            case PAINT:

        }
        if (hidden) {

        }
    }
}
