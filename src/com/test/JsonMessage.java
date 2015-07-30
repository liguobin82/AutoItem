package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonMessage {

	/*
	 * @Description:该功能主要是将汉字或特殊字符进行转码，转码为UTF-8。
	 * 
	 */
	
    public String JsonMessageCode(String json){
		
		String jmessage=null;
		 try{
			 jmessage=URLEncoder.encode(json, "UTF-8");
		        }catch(UnsupportedEncodingException e){
		        	e.printStackTrace();
		        }
		  return jmessage;
	   }

	/*
	 * @Description:将UTF-8字符转化为汉字或特殊字符，实际上进行解码
	 */

   public String JsonMessageEnCode(String json){
	
	   String jmessage=null;
	     try{
		     jmessage=URLDecoder.decode(json, "UTF-8");
            }catch(UnsupportedEncodingException e){
        	    e.printStackTrace();
            }
	    return jmessage;
     }


   /*
    * @Description:获取当前时间，以YYYYMMDDHHMISS方式表达，以便给json中的timestamp使用
    */
   public String getTimestamp(){
   	
   	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
   	 return sdf.format(new Date());
   }

   
   
}
