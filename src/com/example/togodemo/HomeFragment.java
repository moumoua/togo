package com.example.togodemo;

import java.util.ArrayList;

import com.example.togodemo.R;
import com.example.togodemo.R.layout;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

		    @Override
		    public void onCreate(Bundle savedInstanceState) {
		    	// TODO Auto-generated method stub
		    	super.onCreate(savedInstanceState);
		    }
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View messageLayout = inflater.inflate(R.layout.message_layout,
				container, false);
		return messageLayout;
	}
}
