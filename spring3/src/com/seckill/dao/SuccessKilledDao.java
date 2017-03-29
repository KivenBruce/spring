package com.seckill.dao;

import com.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * 插入购买明细,可过滤重复
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return插入的行数
	 */
	int insertSuccessKilled(long seckillId, long userPhone);

	/**
	 * 根据秒杀商品的id查询明细SuccessKilled对象(该对象携带了Seckill秒杀产品对象)
	 * 
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId, long userPhone);
}