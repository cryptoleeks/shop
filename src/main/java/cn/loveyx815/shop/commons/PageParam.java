package cn.loveyx815.shop.commons;

import lombok.Data;

/**
 * @ClassName PageParam
 * @Description PageParam
 * @Author shiyonggang
 * @Date 2021/12/17 下午8:42
 * @Version 1.0
 */
@Data
public class PageParam {
    private Integer pageNo;
    private Integer pageIndex;

    public Integer getPageIndex() {
        return pageIndex == null ? 1 : pageIndex;
    }

    public Integer getPageSize() {
        return pageSize == null ? 10 : pageSize;
    }

    private Integer pageSize;

    public Integer getOffset(){
        return (this.getPageIndex() - 1) * this.getPageSize();
    }
}
