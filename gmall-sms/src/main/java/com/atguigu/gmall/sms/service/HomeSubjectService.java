package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author xzw1116
 * @email 33312386@qq.com
 * @date 2020-06-17 09:10:16
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

