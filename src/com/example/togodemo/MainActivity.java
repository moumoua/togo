package com.example.togodemo;

import java.util.ArrayList;

import net.tsz.afinal.annotation.view.ViewInject;

import com.example.togodemo.R;
import com.example.togodemo.ui.abstOnTouchListener;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 项目的主Activity，所有的Fragment都嵌入在这里。<br>
 * 要想能够管理fragment那么就要继承FragmentActivity
 * 
 * @author guolin
 */
public class MainActivity extends abstOnTouchListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		 //自定义标题栏
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
		
		//自定义的标题栏xml布局
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.layout_title);
		// 初始化布局元素
		initViews();
		//获得fragment管理器
		fragmentManager = getSupportFragmentManager();
		// 第一次启动时选中第0个tab
		setTabSelection(0);
		
		  initValues();  //初始化 关键属性
	      
		  content.setOnTouchListener(this);//创建content的事件监听  
	      //imageButton1.setOnTouchListener(this);
	      myLinearLayout=(LinearLayout)this.findViewById(R.id.menu);
	       right=(TextView) findViewById(R.id.tv_title);
//	      ImageView bt=(ImageView) findViewById(R.id.right);
//	      bt.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				right.setText("afafa");
//			}
//		});
	       
	            
	}
	
	public void click_daifuk(View v){
		Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();	
	}
	public void click(View v){
		if(flag==0){
			scrollToMenu();
			}
			else{
				scrollToContent();
			}
	}


	/**
	 * 在这里获取到每个需要用到的控件的实例，并给它们设置好必要的点击事件。
	 */
	private void initViews() {
		homeLayout = findViewById(R.id.message_layout);
		classifyLayout = findViewById(R.id.contacts_layout);
		businessLayout = findViewById(R.id.news_layout);
		shopcarLayout = findViewById(R.id.setting_layout);
		messageImage = (ImageView) findViewById(R.id.message_image);
		contactsImage = (ImageView) findViewById(R.id.contacts_image);
		newsImage = (ImageView) findViewById(R.id.news_image);
		settingImage = (ImageView) findViewById(R.id.setting_image);
		messageText = (TextView) findViewById(R.id.message_text);
		contactsText = (TextView) findViewById(R.id.contacts_text);
		newsText = (TextView) findViewById(R.id.news_text);
		settingText = (TextView) findViewById(R.id.setting_text);
		homeLayout.setOnClickListener(this);
		classifyLayout.setOnClickListener(this);
		businessLayout.setOnClickListener(this);
		shopcarLayout.setOnClickListener(this);
	}

}
