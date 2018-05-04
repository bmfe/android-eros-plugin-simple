package com.benmu.pluginsimple;

import android.widget.Toast;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

/**
 * Created by liuyuanxiao on 2018/5/4.
 */
@WeexModule(name = "helloplugin", lazyLoad = true)
public class ErosPluginSimple extends WXModule {

    @JSMethod(uiThread = true)
    public void hello() {
        Toast.makeText(mWXSDKInstance.getContext(), "Hello Eros test Plugin", Toast.LENGTH_LONG).show();
    }

}
