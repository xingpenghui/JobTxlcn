package com.feri.job.common.vo;

import lombok.Data;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-10 11:03
 */
@Data
public class R {
    private int code;//结果码
    private String msg;//字符串
    private Object data;//携带数据

    public static R setResult(boolean issucc,String data){
        if(issucc){
            return R.ok(data);
        }else {
            return R.fail(data);
        }
    }
    public static R setR(int code,String msg,Object data){
        R r=new R();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static R ok(Object data){
        return setR(0,"OK",data);
    }
    public static R ok(){
        return setR(0,"OK",null);
    }
    public static R ok(String msg){
        return setR(0,msg,null);
    }
    public static R fail(){
        return setR(1,"Error",null);
    }
    public static R fail(String msg){
        return setR(1,msg,null);
    }

}
