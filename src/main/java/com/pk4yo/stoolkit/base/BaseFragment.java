package com.pk4yo.stoolkit.base;


import android.app.Fragment;


/**
 * Created by txl on 2017/5/7.
 */


public class BaseFragment extends Fragment{




    public void InitUI() {

    }

    public void InitData() {

    }


    /**
     * TRIM_MEMORY_UI_HIDDEN：你的应用程序的所有UI界面被隐藏了，
     * 即用户点击了Home键或者Back键退出应用，导致应用的UI界面完全不可见。
     * 这个时候应该释放一些不可见的时候非必须的资源
     */

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }


    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        System.gc();
    }


}
