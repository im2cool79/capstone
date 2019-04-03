package com.papajohns.alexa;
import org.json.*;
import java.text.*;
import java.util.*;

public class papaJohnsAlexa {
	//based on https://labs.gearmunk.com/alexa/flash_brief.json example - idk if it works
	public org.json.JSONArray randomReturn() {
		org.json.JSONObject obj = new org.json.JSONObject();
		// throw a get in here to get the data and build the following
		obj.put("uid", "82e47d7b-9ec6-4c6d-a9c8-4c00482fcde6TheStoke1-29-19");
		obj.put("updateDate", "2019-01-29T21:00:46.0Z");
		obj.put("titleText", "The Stoke 1-29-19");
		obj.put("mainText", "The Stoke 1-29-19");
		obj.put("streamUrl", "https:\\/\\/s3.amazonaws.com\\/gearmunk-alexa\\/news\\/Dawn+Patrol-2.m4a");
		obj.put("redirectionUrl", "https:\\/\\/www.gearmunk.com");
		org.json.JSONArray objs = new org.json.JSONArray();
		objs.put(obj);
		return objs;
	}
	
	public org.json.JSONArray getYesterday() {
		org.json.JSONObject obj = new org.json.JSONObject();
		// throw a get in here to get the data and build the following
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm.ss");
		String yesterday = dateFormat.format(calendar.getTime());
		UUID uid = UUID.randomUUID();
		obj.put("uid", uid.toString());
		obj.put("updateDate", yesterday);
		obj.put("titleText", "The Papa");
		obj.put("mainText", "The Papa");
		obj.put("streamUrl", "https:\\/\\/www.papajohns.com\\/alexa-yesterday");
		obj.put("redirectionUrl", "https:\\/\\/www.papajohns.com");
		org.json.JSONArray objs = new org.json.JSONArray();
		objs.put(obj);
		return objs;
	}
	
	public org.json.JSONArray getToday() {
		org.json.JSONObject obj = new org.json.JSONObject();
		// throw a get in here to get the data and build the following
		Calendar calendar = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm.ss");
		String today = dateFormat.format(calendar.getTime());
		UUID uid = UUID.randomUUID();
		obj.put("uid", uid.toString());
		obj.put("updateDate", today);
		obj.put("titleText", "The Papa");
		obj.put("mainText", "The Papa");
		obj.put("streamUrl", "https:\\/\\/www.papajohns.com\\/alexa-today");
		obj.put("redirectionUrl", "https:\\/\\/www.papajohns.com");
		org.json.JSONArray objs = new org.json.JSONArray();
		objs.put(obj);
		return objs;
	}
}
