package cn.loveyx815.shop.dao;

import cn.loveyx815.shop.commons.GoodsParam;
import cn.loveyx815.shop.dao.entity.GoodsEntity;

import java.util.List;

public interface GoodsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsEntity record);

    int insertSelective(GoodsEntity record);

    GoodsEntity selectByPrimaryKey(Integer id);

    List<GoodsEntity> listByParam(GoodsParam param);

    int updateByPrimaryKeySelective(GoodsEntity record);

    int updateByPrimaryKey(GoodsEntity record);
}