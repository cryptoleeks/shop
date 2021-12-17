package cn.loveyx815.shop.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Resutl
 * @Description Resutl
 * @Author shiyonggang
 * @Date 2021/12/17 下午9:08
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public  class Result<T> {
    private Integer status;

    private Object message;

    public static <T>Result  success(T data){
        return Result.builder().status(0).message(data).build();
    }
}
