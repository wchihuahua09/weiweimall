package com.weiwei.weiweimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 17:49:20
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
