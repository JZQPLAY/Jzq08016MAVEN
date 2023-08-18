package springMVC.ssm.service;

import domain.wanghuang;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 11:03
 * @description
 */
@Transactional
public interface wanghuangservice
{
	/**
	 * 添加
	 *
	 * @param wanghuang
	 * @return
	 */
	boolean insert(wanghuang wanghuang);
	
	/**
	 * 删除
	 *
	 * @param id
	 * @return
	 */
	boolean delete(int id);
	
	/**
	 * 修改
	 *
	 * @param wanghuang
	 * @return
	 */
	boolean update(wanghuang wanghuang);
	
	/**
	 * 查询所有
	 *
	 * @return
	 */
	List<wanghuang> selectAll();
	
	/**
	 * 查询单个
	 *
	 * @param id
	 * @return
	 */
	wanghuang selectbyid(int id);
}
