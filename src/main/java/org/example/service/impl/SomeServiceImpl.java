package org.example.service.impl;

import org.example.service.SomeService;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/15 14:42
 **/
public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl(){
        super();
        System.out.println("SomeServiceImpl无参构造函数");
    }

    @Override
    public void doSome() {
        System.out.println("====业务方法doSome()====");
    }
}
