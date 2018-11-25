package com.heuman.eureka.server.common.utils;

import java.io.IOException;
import java.net.Socket;

/**
 * @author heuman
 * @date 2018/11/25 12:48
 */
public class NetworkUtil {

    /**
     * 检测主机端口号是否被占用
     *
     * @param hostname
     * @param port
     * @return
     */
    public static boolean isUsed(String hostname, int port) {
        try {
            Socket socket = new Socket(hostname, port);
            try {
                socket.close();
            } catch (IOException e) {
                // ignore
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
