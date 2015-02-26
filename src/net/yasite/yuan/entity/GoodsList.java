package net.yasite.yuan.entity;

import java.io.Serializable;
import java.util.List;

import net.yasite.mine.entity.MyGoodsEntity;


public class GoodsList extends Object implements Serializable{
	private List<MyGoodsEntity> data;

	public List<MyGoodsEntity> getData() {
		return data;
	}

	public void setData(List<MyGoodsEntity> data) {
		this.data = data;
	}

	

}
