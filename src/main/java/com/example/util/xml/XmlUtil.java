package com.example.util.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * xml util
 * use dom4j.jar
 *
 * @author James-CSH
 * @since 17-4-5 下午9:26
 */
public class XmlUtil {

    /**
     * object transfarm to xml
     *
     * @param object
     * @param <T>
     * @return
     */
    public static <T> String object2xml(T object) {
        if (null == object) {
            return "";
        }

        Document document = DocumentHelper.createDocument();
        //get the object simple name
        String objectName = object.getClass().getSimpleName();
        //get all fields of the object
        Field[] objectProperties = object.getClass().getDeclaredFields();
        // set the root element
        Element root = document.addElement(objectName);
        try {
            String methodStr = "";
            for (Field property : objectProperties) {
                methodStr = "get" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1);
                Method method = object.getClass().getMethod(methodStr);
                // add the element
                Object obj = method.invoke(object);
                if (null != obj) {
                    root.addElement(property.getName()).setText(obj.toString());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return document.asXML();
    }

    public static String array2xml() {
        return null;
    }

    public static String list2xml() {
        return null;
    }

    public static String map2xml() {
        return null;
    }

    public static <T> T xml2object(String xml, Class<T> clazz) {
        return null;
    }

    public static <T> T[] xml2array(String xml, Class<T> clazz) {
        return null;
    }

    public static <T> List<T> xml2list(String xml, Class<T> clazz) {
        return null;
    }

    public static Map xml2map(String xml) {
        return null;
    }

}
