package cn.loveyx815.shop.controller;

import cn.loveyx815.shop.commons.GoodsParam;
import cn.loveyx815.shop.dao.entity.GoodsEntity;
import cn.loveyx815.shop.service.GoodsService;
import cn.loveyx815.shop.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName GoodsController
 * @Description GoodsController
 * @Author shiyonggang
 * @Date 2021/12/17 下午9:08
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public Result getList(GoodsParam param){
        List<GoodsEntity> list = goodsService.list(param);
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result search(GoodsParam param){
        List<GoodsEntity> list = goodsService.list(param);
        return Result.success(list);
    }

    @GetMapping("/info")
    public Result getInfo(Integer id){
        GoodsEntity goodsEntity = goodsService.goodsInfo(id);
        return Result.success(goodsEntity);
    }
}
