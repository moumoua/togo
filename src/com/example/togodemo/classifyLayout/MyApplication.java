package com.example.togodemo.classifyLayout;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

public class MyApplication extends Application  {

	public List<image_right1> list_imager1=new ArrayList<image_right1>();

	public List<image_right1> getList_imager1() {
		return list_imager1;
	}

	public void setList_imager1(List<image_right1> result) {
		this.list_imager1 = result;
	}
}
