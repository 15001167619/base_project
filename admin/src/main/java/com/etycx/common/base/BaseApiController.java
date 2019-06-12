package com.etycx.common.base;

/**
 * @author 武海升
 * @description 基础controller
 * @date 2019/5/14 18:45
 */

public class BaseApiController {

    public BaseVo isNullData(){
        BaseVo baseVo = new BaseVo();
        return baseVo.isNullError();
    }

    public BaseVo isErrorSignData(){
        BaseVo baseVo = new BaseVo();
        return baseVo.isErrorSignData();
    }

}
