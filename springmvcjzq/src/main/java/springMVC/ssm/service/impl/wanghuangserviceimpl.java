package springMVC.ssm.service.impl;

import domain.wanghuang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springMVC.ssm.dao.wanghuangdao;
import springMVC.ssm.service.wanghuangservice;
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
		wanghuangdao.insert(wanghuang);
		return true;
	}
	
	@Override
	public boolean delete(int id)
	{
		wanghuangdao.delete(id);
		return true;
	}
	
	@Override
	public boolean update(wanghuang wanghuang)
	{
		wanghuangdao.update(wanghuang);
		return true;
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
