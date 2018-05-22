# Android Eros plugin Simple

** Android 插件Simple **

* 插件 简单封装了一个 Module   helloplugin  一个简单的弹出Tost操作。

* 使用

    ```
	var helloplugin = weex.requireModule('helloplugin')
	```

    ```js
	helloplugin.hello()

    ```

* 插件的封装方法

* 1、直接在项目中new 一个Moudle  如图：
图1![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_1.jpg)

图2![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_2.jpg)

图3![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_3.jpg)

图4![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_4.jpg)


* 2、将新创建的 Moudle 依赖进项目 如图。
图5![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_5.jpg)

* 3、修改 Moudle 的 build.gradle 文件。

一定要依赖：
    ```java
        compile 'com.github.bmfe.eros-android-worker:eros-framework:eros_v0.0.1'
    ```
  图6![](https://raw.githubusercontent.com/myliuyx/source/master/plugin_new_6.png)  
  
> 具体可参考如图6， 也可以下载此simple 查看，完事儿以后点击右上角 sync now 等待完成即可.
> compile 'com.github.bmfe.eros-android-worker:eros-framework:eros_v0.0.1', 库
  依赖请参考最新版本 自行修改。
  
  * 4、后面您可以随意写您的插件逻辑了， 集体 的注册可以参考 `simple` 中的 ErosPluginSimple.


