package com.example.util.email;

/**
 * @author James-CSH
 * @since 3/15/2017 11:06 PM
 */
public interface EmailConstants {

    /**
     * send result status
     */
    int SUCCESS = 1;
    int FAIL = 2;


    /**
     * send
     */
    int numbers = 20;
    /**
     * SocketTimeout
     */
    int SOCKETTIMEOUT = 30000;
    /**
     * SocketConnectionTimeout
     */
    int SOCKETCONNECTIONTIMEOUT = 30000;
    /**
     * Charset
     */
    String CHARSET = "UTF-8";
    /**
     * the email hostname
     */
    String HOSTNAME = "smtp.163.com";
    /**
     * the smtp port
     */
    int SMTPPORT = 25;
    /**
     * the website host eg: http://www.baidu.com
     */
    String HOSTPATH = "http://localhost";
    /**
     * the website port
     */
    int HOSTPORT = 80;
}
