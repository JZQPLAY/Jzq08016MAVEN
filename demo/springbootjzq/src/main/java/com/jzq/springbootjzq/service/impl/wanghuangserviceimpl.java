package com.jzq.springbootjzq.service.impl;

import com.jzq.springbootjzq.dao.wanghuangdao;
import com.jzq.springbootjzq.domain.wanghuang;
import com.jzq.springbootjzq.service.wanghuangservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 11:03
 * @description
 */
@Service
public class wanghuangserviceimpl implements wanghuangservice
{
	@Autowired(required = false)
	private wanghuangdao wanghuangdao;
	
	@Override
	public boolean insert(wanghuang wanghuang)
	{
		return wanghuangdao.insert(wanghuang)>0;
		
	}
	
	@Override
	public boolean delete(int id)
	{
		return wanghuangdao.delete(id)>0;
	}
	
	@Override
	public boolean update(wanghuang wanghuang)
	{
		return wanghuangdao.update(wanghuang)>0;
	}
	
	@Override
	public List<wanghuang> selectAll()
	{
		return wanghuangdao.selectAll();
	}
	
	@Override
	public wanghuang selectbyid(int id)
	{
		return wanghuangdao.selectbyid(id);
	}
}
