package com.test;

public class MposPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonMessage json = new JsonMessage();
		String jsonmessage="{\"amount\" : \"000000000100\","
				+ "\"baseStation\" : \"0000262302b9bf02\","
				+ "\"bizCode\" : \"0001\","
				+ "\"cardExpiryDay\" : \"2007\","
				+ "\"cardNo\" : \"6013821900065710886\","
				+ "\"currency\" : \"156\","
				+ "\"deviceSn\" : \"Q0NL01070722\","
				+ "\"elecsignData\" : \"AAA\","
				+ "\"emvTransInfo\" : \"\","
				+ "\"entryMode\" : \"021\","
				+ "\"imei\" : \"865647023588009\","
				+ "\"location\" : \"113.9418|22.54406\","
				+ "\"mrchNo\" : \"848584040110001\","
				+ "\"pinblock\" : \"A43E236497A80948\","
				+ "\"reqVer\" : \"1\","
				+ "\"storeNo\" : \"00000004\","
				+ "\"timestamp\" : "+json.getTimestamp()+","
				+ "\"track2Data\" : \"363031333832313930303036353731303838363D3539304533363144454134303543463130\","
				+ "\"track3Data\" : \"3933303437373634303130313838323031343338363D30393930303030303030373530313038363033303536333639303130303030303230303730313030303030303030303030303030303030303030303030303030414642314543374236393036443935333031\","
				+ "\"transToken\" : \"2015072900000074\","
				+ "\"mac\" : \"5A6964562009D362\"}";
		
		System.out.println("转码前报文串为："+jsonmessage);
		
		System.out.println("转码后报文串为："+json.JsonMessageCode(jsonmessage));
		
	    String enjsonmessage="%7B%22amount%22+%3A+%22000000000100%22%2C%22baseStation%22+%3A+%220000262302b9bf02%22%2C%22bizCode%22+%3A+%220001%22%2C%22cardExpiryDay%22+%3A+%222007%22%2C%22cardNo%22+%3A+%226013821900065710886%22%2C%22currency%22+%3A+%22156%22%2C%22deviceSn%22+%3A+%22Q0NL01070722%22%2C%22elecsignData%22+%3A+%22AAA%22%2C%22emvTransInfo%22+%3A+%22%22%2C%22entryMode%22+%3A+%22021%22%2C%22imei%22+%3A+%22865647023588009%22%2C%22location%22+%3A+%22113.9418%7C22.54406%22%2C%22mrchNo%22+%3A+%22848584040110001%22%2C%22pinblock%22+%3A+%22A43E236497A80948%22%2C%22reqVer%22+%3A+%221%22%2C%22storeNo%22+%3A+%2200000004%22%2C%22timestamp%22+%3A+%2220150729142044%22%2C%22track2Data%22+%3A+%22363031333832313930303036353731303838363D3539304533363144454134303543463130%22%2C%22track3Data%22+%3A+%223933303437373634303130313838323031343338363D30393930303030303030373530313038363033303536333639303130303030303230303730313030303030303030303030303030303030303030303030303030414642314543374236393036443935333031%22%2C%22transToken%22+%3A+%222015072900000074%22%2C%22mac%22+%3A+%225A6964562009D362%22%7D";
	    System.out.println("解码后报文串为："+json.JsonMessageEnCode(enjsonmessage));
	    
	    System.out.println("打印出当前时间戳："+json.getTimestamp());

		
	}

}
