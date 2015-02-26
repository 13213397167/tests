package net.yasite.yuan.api;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

import net.yasite.api.BaseAPI;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.yuan.entity.GoodsList;

public class MyApi extends BaseAPI {

	 public MyApi(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/goodController/getGoodList");
	}

	@Override
	public GoodsList handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		
		return new Gson().fromJson(json.toString(), GoodsList.class);
	}

}
