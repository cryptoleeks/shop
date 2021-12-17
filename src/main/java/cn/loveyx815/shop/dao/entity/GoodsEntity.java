package cn.loveyx815.shop.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * goods
 * @author 
 */
@Data
public class GoodsEntity implements Serializable {
    private Integer id;

    /**
     * 图片地址
     */
    private String img_url;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 详情内容
     */
    private String content;

    /**
     * 商品批号
     */
    private String goods_no;

    /**
     * 数量
     */
    private Integer stock_quantity;

    /**
     * 市价
     */
    private BigDecimal market_price;

    /**
     * 售价
     */
    private BigDecimal sell_price;

    /**
     * 是否有效 1是0否
     */
    private Boolean status;

    private Date add_time;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}