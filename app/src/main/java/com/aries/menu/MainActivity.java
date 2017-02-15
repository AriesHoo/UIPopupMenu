package com.aries.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.aries.ui.widget.menu.MenuItemEntity;
import com.aries.ui.widget.menu.UIPopupMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UIPopupMenu uiPopupMenu;
    private ImageView ivMenu;
    private Button btnMemu;
    List<MenuItemEntity> listMenus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMenu = (ImageView) findViewById(R.id.more);
        btnMemu = (Button) findViewById(R.id.btn_menu);
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPopupMenu = new UIPopupMenu(MainActivity.this);
                listMenus.clear();
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                uiPopupMenu
                        .setAlpha(0.5f)
                        .setMargin(0, 0, 0, 0)
                        .setMenuItems(listMenus)
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_facet2face, "面对面快传", Color.BLUE))
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_pay, "付款", Color.RED))
                        .setOnMenuItemClickListener(new UIPopupMenu.OnMenuItemClickListener() {
                            @Override
                            public void onMenuItemClick(int position) {
                                Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .showAsDropDown(ivMenu, -200, 0);
            }
        });
        btnMemu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIPopupMenu uiPopupMenu = new UIPopupMenu(MainActivity.this);
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_multi, "创建群聊"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_add, "加好友/群"));
                listMenus.add(new MenuItemEntity(R.mipmap.ic_qr_scan, "扫一扫"));
                uiPopupMenu
                        .setAlpha(0.5f)
                        .setMargin(0, 0, 0, 0)
                        .setBackgroundColor(Color.WHITE)
                        .setMenuItems(listMenus)
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_facet2face, "面对面快传", Color.BLUE))
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_pay, "付款", Color.RED))
                        .setOnMenuItemClickListener(new UIPopupMenu.OnMenuItemClickListener() {
                            @Override
                            public void onMenuItemClick(int position) {
                                Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .showAsDropDown(btnMemu, 100, 0);
            }
        });
    }
}
