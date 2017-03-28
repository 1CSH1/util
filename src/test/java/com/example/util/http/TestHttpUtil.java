package com.example.util.http;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author James-CSH
 * @since 2/15/2017 10:57 PM
 */
public class TestHttpUtil {

    private HttpUtil httpUtil = new HttpUtil();
    private String host = "http://localhost/test/";
    private static Map<String, Object> map = new HashMap<String, Object>();
    static {
        map.put("str", "哈哈哈哈");
    }

    @Test
    public void testGet() {
        try {
            System.out.println(httpUtil.get(host + "get", map));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPost() {
        try {
            System.out.println(httpUtil.post(host + "post", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPut() {
        try {
            System.out.println(httpUtil.put(host + "put", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPatch() {
        try {
            System.out.println(httpUtil.patch(host + "patch", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelete() {
        try {
            System.out.println(httpUtil.delete(host + "delete", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTrace() {
        try {
            System.out.println(httpUtil.trace(host + "trace", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testOptions() {
        try {
            System.out.println(httpUtil.options(host + "options", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHead() {
        try {
            System.out.println(httpUtil.head(host + "head", map));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
