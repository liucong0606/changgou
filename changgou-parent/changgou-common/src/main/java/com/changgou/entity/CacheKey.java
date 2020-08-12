package com.changgou.entity;

/****
 * @Author:www.itheima.com
 * @Description:
 *****/
public enum  CacheKey {

    /**
     * 商品分类
     */
    CATEGORY("CATEGORY"),

    /**
     * 品牌缓存
     */
    BRAND("BRAND"),

    /**
     * 规格
     */
    SPEC("SPEC");

    private CacheKey(String text) {
        this.text = text;
    }

    private String text;
}
