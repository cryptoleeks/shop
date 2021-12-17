package cn.loveyx815.shop.commons;

import lombok.Data;

/**
 * @ClassName GoodsParam
 * @Description GoodsParam
 * @Author shiyonggang
 * @Date 2021/12/17 下午8:40
 * @Version 1.0
 */
@Data
public class GoodsParam  extends  PageParam{
    private Integer id;
    private String keyword;
}
