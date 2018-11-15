package edu.bjtu.example.sportsdashboard;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Gravity;
import android.widget.Toast;
import android.view.WindowManager;
import android.view.MotionEvent;
import android.os.Build;
//import android.method;
//import android.resource;

import static android.support.v4.view.GravityCompat.*;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
//    private View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        //获取顶层视图
//        decorView = getWindow().getDecorView();

    }

    public void DengLu(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);

    }

    public void ZhuCe(View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

//    @Override
//    protected void onStart() {
//        //调用配置
//        init();
//        super.onStart();
//    }
//
//    private void init(){
//        int flag = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide
//                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
//                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
//        //判断当前版本在4.0以上并且存在虚拟按键，否则不做操作
//        if (Build.VERSION.SDK_INT < 19 || !checkDeviceHasNavigationBar()) {
//            //一定要判断是否存在按键，否则在没有按键的手机调用会影响别的功能。如之前没有考虑到，导致图传全屏变成小屏显示。
//            return;
//        } else {
//            // 获取属性
//            decorView.setSystemUiVisibility(flag);
//        }
//    }
//
//    /**
//     * 判断是否存在虚拟按键
//     * @return
//     */
//    public boolean checkDeviceHasNavigationBar() {
//        boolean hasNavigationBar = false;
//        Resources rs = getResources();
//        int id = rs.getIdentifier("config_showNavigationBar", "bool", "android");
//        if (id > 0) {
//            hasNavigationBar = rs.getBoolean(id);
//        }
//        try {
//            Class<?> systemPropertiesClass = Class.forName("android.os.SystemProperties");
//            Method m = systemPropertiesClass.getMethod("get", String.class);
//            String navBarOverride = (String) m.invoke(systemPropertiesClass, "qemu.hw.mainkeys");
//            if ("1".equals(navBarOverride)) {
//                hasNavigationBar = false;
//            } else if ("0".equals(navBarOverride)) {
//                hasNavigationBar = true;
//            }
//        } catch (Exception e) {
//
//        }
//        return hasNavigationBar;
//    }
//
//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        return false;
//    }
}
