package com.springboot.mybatis.util;

import java.util.Random;

//随机数工具
public class RandomUtil {
    public  static String getRandomCode(){
        StringBuffer stringBuffer=new StringBuffer();
        Random random=new Random();
        for (int i=0;i<6;i++){

            int num=random.nextInt(10);
            //
            stringBuffer.append(num);
        }
        return stringBuffer.toString();
    }
}
