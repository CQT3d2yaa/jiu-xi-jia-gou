package com.atguigu.ssyx.product.mapper;

import com.atguigu.ssyx.model.product.SkuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * sku信息 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-06-28
 */
public interface SkuInfoMapper extends BaseMapper<SkuInfo> {

    //解锁库存
    void unlockStock(Long skuId, Integer skuNum);

    //验证库存
    SkuInfo checkStock(Long skuId, Integer skuNum);

    //锁定库存:update
    Integer lockStock(Long skuId, Integer skuNum);
}
