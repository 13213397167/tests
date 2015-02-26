package net.yasite.mine.api;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import android.content.Context;

import net.yasite.api.BaseAPI;
import net.yasite.mine.entity.MyGoodlistEntity;

public class MyGoodslistAPI extends BaseAPI {

	 public MyGoodslistAPI(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/goodController/getGoodList");
	}

	@Override
	public MyGoodlistEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		
		return new Gson().fromJson(json.toString(), MyGoodlistEntity.class);
	}

}
