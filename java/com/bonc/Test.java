package com.bonc;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述    :
 * Author :Qing_X
 * Date   :2019-04-20 11:21
 */
public class Test extends ClassLoader{
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    @Override
    protected Class <?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
