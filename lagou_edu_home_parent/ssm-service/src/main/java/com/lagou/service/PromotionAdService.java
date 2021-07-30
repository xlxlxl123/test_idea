package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;

import java.util.List;

public interface PromotionAdService {

    /*
    分页获取所有的广告列表
    */
    public PageInfo<PromotionAd> findAllAdByPage(PromotionAdVo promotionAdVo);

    /*
    新建广告
 */
    public void savePromotionAd(PromotionAd promotionAd);

    /*
        修改广告
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /*
        回显广告信息
    */
    public PromotionAd findPromotionAdById(int id);

    /*
        广告动态上下线
     */
    public void updatePromotionAdStatus(int id, int status);
}
