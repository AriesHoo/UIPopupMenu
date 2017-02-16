package com.aries.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.aries.ui.widget.menu.MenuItemEntity;
import com.aries.ui.widget.menu.UIPopupMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UIPopupMenu uiPopupMenu;
    private ImageView ivMenu;
    private Button btnMenu;
    List<MenuItemEntity> listMenus = new ArrayList<>();
    CheckBox checkBoxAnimation;
    CheckBox checkClickDismissible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMenu = (ImageView) findViewById(R.id.more);
        btnMenu = (Button) findViewById(R.id.btn_menu);
        checkBoxAnimation = (CheckBox) findViewById(R.id.checkB_animation);
        checkClickDismissible = (CheckBox) findViewById(R.id.checkB_clickDismissible);
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
                        .setClickDismissible(checkClickDismissible.isChecked())
                        .setAnimationEnable(checkBoxAnimation.isChecked())
                        .showAsDropDown(ivMenu, -200, 0);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
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
                        .setPadding(0, 0, 0, 20)
                        .setBackgroundColor(Color.YELLOW)
                        .setMenuItems(listMenus)
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_facet2face, "面对面快传", Color.BLUE))
                        .setMenuItem(new MenuItemEntity(R.mipmap.ic_pay, "付款", Color.RED))
                        .setOnMenuItemClickListener(new UIPopupMenu.OnMenuItemClickListener() {
                            @Override
                            public void onMenuItemClick(int position) {
                                Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setClickDismissible(checkClickDismissible.isChecked())
                        .setAnimationEnable(checkBoxAnimation.isChecked())
                        .showAsDropDown(btnMenu, 20, 0);
            }
        });

        checkBoxAnimation.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }
}
