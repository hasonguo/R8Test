package com.zhihu.module2;


import com.zhihu.module1.Module1;

/**
 * @author : guohaisheng
 * @description :
 * @since :  2022/10/11 16:28
 */
public class Module2 {
    public void method() {
        Module1 module1 = new Module1();
        String field1 = module1.field1;
        System.out.println(field1);
    }
}