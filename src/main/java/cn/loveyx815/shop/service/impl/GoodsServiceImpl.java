package cn.loveyx815.shop.service.impl;

import cn.loveyx815.shop.commons.GoodsParam;
import cn.loveyx815.shop.dao.GoodsDao;
import cn.loveyx815.shop.dao.entity.GoodsEntity;
import cn.loveyx815.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Description GoodsServiceImpl
 * @Author shiyonggang
 * @Date 2021/12/17 下午9:05
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao dao;

    @Override
    public List<GoodsEntity> list(GoodsParam param) {
        return dao.listByParam(param);
    }

    @Override
    public GoodsEntity goodsInfo(Integer id) {
        return dao.selectByPrimaryKey(id);
    }
}
