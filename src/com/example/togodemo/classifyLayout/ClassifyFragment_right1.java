package com.example.togodemo.classifyLayout;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.tsz.afinal.FinalBitmap;

import com.example.togodemo.MyAdapter;
import com.example.togodemo.R;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
//OnCreateContextMenuListener接口是用来处理上下文菜单显示事件的监听接口
//implements android.widget.AdapterView.OnItemClickListener
public class ClassifyFragment_right1 extends Fragment {
/*	
	private NewAdapter newAdapter;
	private FinalBitmap bm;
	private LayoutInflater in;
	*/
	private GridView gridView;
	private int[] image = {
	    R.drawable.cimageview11,
	    R.drawable.cimageview12,
	    R.drawable.cimageview13,
	    R.drawable.cimageview14,
	    R.drawable.cimageview15,
	    R.drawable.cimageview16,
	    R.drawable.cimageview17,
	    R.drawable.cimageview18,
	    R.drawable.cimageview19
	};
	private String[] imgText = {
	    "卫衣", "连衣裙", "短靴", "针织衫", "毛呢外套", "羽绒服", "高帮鞋", "单鞋","毛衣"
	};

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	View view=inflater.inflate(R.layout.frg_classify_right1, container, false);
	/*	LinearLayout convertView = (LinearLayout) inflater.inflate(  
                R.layout.frg_classify_right1, container, false);  
		in=getActivity().getLayoutInflater();
		bm=FinalBitmap.create(getActivity());
		GridView gv1=(GridView)convertView.findViewById(R.id.gridViewRight1);
	
       
      
		//((ViewGroup) view.getParent()).removeView(view);  
	
		newAdapter=new NewAdapter();
		Netfright1.getDataFromServer(ClassifyFragment_right1.this,gv1,newAdapter);
		gv1.setOnItemClickListener(this);
		return convertView;

		
	}
	
	
		public class NewAdapter extends BaseAdapter{

			private List<image_right1> data;
			
			public List<image_right1> getData() {
				return data;
			}

			public void setData(List<image_right1> result) {
				this.data = result;
			}

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return data.size();
			}

			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return data.get(position);
			}

			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {


				image_right1 img=data.get(position);
				if(convertView==null){
//					LayoutInflater inflater=LayoutInflater.from(getActivity().getApplicationContext());
//					convertView=inflater.inflate(R.layout.gridview_item, null);
					convertView=in.inflate(R.layout.gridview_item, null);
					
					ImageView iv=(ImageView)convertView.findViewById(R.id.gridmageViewitem);
					TextView tv=(TextView)convertView.findViewById(R.id.gridtextviewitem);
					
					
					bm.display(iv,img.getPid());
					tv.setText(img.getName());
					}
					return convertView;
			
			}
		}
	*/
		  List<Map<String, Object>> items = new ArrayList<Map<String,Object>>();
		    for (int i = 0; i < image.length; i++) {
		        Map<String, Object> item = new HashMap<String, Object>();
		        item.put("image", image[i]);
		        item.put("text", imgText[i]);
		        items.add(item);
		    }
		    SimpleAdapter adapter = new SimpleAdapter(getActivity(), 
		        items, R.layout.gridview_item, new String[]{"image", "text"},
		        new int[]{R.id.gridmageViewitem, R.id.gridtextviewitem});
		  
		    gridView = (GridView)view.findViewById(R.id.gridViewRight1);
		    //取消默认的背景色
		    gridView.setSelector(new ColorDrawable(Color.TRANSPARENT)); 
		    gridView.setNumColumns(3);
		    gridView.setAdapter(adapter);
		    gridView.setOnItemClickListener(new OnItemClickListener(){
		        @Override
		        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		            Toast.makeText(getActivity(), "你按下 "+imgText[position],    
		                Toast.LENGTH_SHORT).show();   
		        }
		        
		    });
			return view;
		  }
};

	
	/*	
	
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	image_right1 ir1=new image_right1();
	MyApplication M=(MyApplication) this.getActivity().getApplication();
	List<image_right1> list=M.getList_imager1();
	ir1=list.get(position);
	String a=ir1.getPid();
	String b=ir1.getName();
	Toast.makeText(this.getActivity().getApplicationContext(), "a="+a+"b="+b, Toast.LENGTH_SHORT).show();
	
}


*/



