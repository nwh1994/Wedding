package com.qfedu.wedding.demo.util;

import com.qfedu.wedding.demo.vo.R;

public class RUtil {

    public static R setOK(String msg){
        return new R(1000,msg,null);
    }

    public static R setERROR(String msg){
        return new R(2000,msg,null);
    }

}
