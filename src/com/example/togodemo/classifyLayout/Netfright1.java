/*
  package com.example.togodemo.classifyLayout;
 

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.example.togodemo.classifyLayout.ClassifyFragment_right1.NewAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.AsyncTask;
import android.widget.GridView;


public class Netfright1 {
	public static final String Path="http://10.30.6.91:8080/togoProjectDemo/servlet/gv_right1";
	public static void getDataFromServer(final ClassifyFragment_right1 Fragment_right1, final GridView gridView,final NewAdapter newAdapter) {
		
		AsyncTask<Void, Void, List<image_right1>> at=new AsyncTask<Void, Void, List<image_right1>>(){

			@Override
			protected List<image_right1> doInBackground(Void... params) {

				try {
					HttpClient client=new DefaultHttpClient();
					HttpGet get=new HttpGet(Path);
					HttpResponse response= client.execute(get);
					if(response.getStatusLine().getStatusCode()==200){
						InputStream in=response.getEntity().getContent();
						byte[] data=convertInputStreamByteArray(in);
						String json=new String(data);//转成json字符串
						Gson g=new Gson();
						List<image_right1> list_json=g.fromJson(json, new TypeToken<List<image_right1>>(){}.getType());
						return list_json;
					}
					
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
			@Override
			protected void onPostExecute(List<image_right1> result) {
				if(result !=null){
					newAdapter.setData(result);
					MyApplication M=(MyApplication) Fragment_right1.getActivity().getApplication();
					System.out.println(result.toString());
					M.setList_imager1(result);
					gridView.setAdapter(newAdapter);
				}
			}
			};
			
			at.execute();	
	}
	public static byte[] convertInputStreamByteArray(InputStream is){
		   byte[] buffer=new byte[1024];
		   int len;
		   ByteArrayOutputStream bos=new ByteArrayOutputStream();
		   try {
			while((len=is.read(buffer))>0){
				 bos.write(buffer, 0, len);  
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		   return bos.toByteArray();
		
	}	
}
*/