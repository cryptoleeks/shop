package cn.loveyx815.shop.service;

import cn.loveyx815.shop.commons.GoodsParam;
import cn.loveyx815.shop.dao.entity.GoodsEntity;

import java.util.List;

/**
 * @ClassName GoodsService
 * @Description GoodsService
 * @Author shiyonggang
 * @Date 2021/12/17 下午9:04
 * @Version 1.0
 */
public interface GoodsService {
    List<GoodsEntity> list (GoodsParam param);

    GoodsEntity goodsInfo(Integer id);
}
