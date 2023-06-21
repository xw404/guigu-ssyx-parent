package com.atguigu.ssyx.home.service;

import java.util.Map;

public interface ItemService {

    //详情（要得到优惠券信息和用户信息）
    Map<String, Object> item(Long id, Long userId);
}
