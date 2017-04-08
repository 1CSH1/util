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
import java.util.Set;

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
     *              the object will transform to xml
     * @param <T>
     *              the real object
     * @return
     *              the xml string of object
     */
    public static <T> String object2xml(T object) {
        if (null == object) {
            return "";
        }

        Document document = DocumentHelper.createDocument();
        // get the object simple name
        String objectName = object.getClass().getSimpleName();
        // get all fields of the object
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

    public static <T> String array2xml(T[] objects) {
        if (null == objects || objects.length <= 0) {
            return "";
        }

        T object = objects[0];
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(object.getClass().getSimpleName() + "s");
        try {
            String methodStr = "";
            // traverse the objects
            for (int i=0; i<objects.length; i++) {
                object = objects[i];
                Element objectRoot = root.addElement(object.getClass().getSimpleName());

                // get all fields of the object
                Field[] objectProperties = object.getClass().getDeclaredFields();
                // set the root element
                for (Field property : objectProperties) {
                    methodStr = "get" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1);
                    Method method = object.getClass().getMethod(methodStr);
                    // add the element
                    Object obj = method.invoke(object);
                    if (null != obj) {
                        objectRoot.addElement(property.getName()).setText(obj.toString());
                    }
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

    public static <T> String list2xml(List<T> list) {
        if (null == list || list.isEmpty()) {
            return "";
        }

        T object = list.get(0);
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(object.getClass().getSimpleName() + "s");
        try {
            String methodStr = "";
            // traverse the objects
            for (int i=0; i<list.size(); i++) {
                object = list.get(i);
                Element objectRoot = root.addElement(object.getClass().getSimpleName());

                // get all fields of the object
                Field[] objectProperties = object.getClass().getDeclaredFields();
                // set the root element
                for (Field property : objectProperties) {
                    methodStr = "get" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1);
                    Method method = object.getClass().getMethod(methodStr);
                    // add the element
                    Object obj = method.invoke(object);
                    if (null != obj) {
                        objectRoot.addElement(property.getName()).setText(obj.toString());
                    }
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

    public static String map2xml(Map<String, Object> map) {
        if (null == map || map.isEmpty()) {
            return "";
        }

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("Maps");
        Set<String> keys = map.keySet();
        try {
            String methodStr = "";
            Object object = null;
            // traverse the objects
            for (String key : keys) {
                object = map.get(key);

                Element objectRoot = root.addElement(object.getClass().getSimpleName());

                // get all fields of the object
                Field[] objectProperties = object.getClass().getDeclaredFields();
                // set the root element
                for (Field property : objectProperties) {
                    methodStr = "get" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1);
                    Method method = object.getClass().getMethod(methodStr);
                    // add the element
                    Object obj = method.invoke(object);
                    if (null != obj) {
                        objectRoot.addElement(property.getName()).setText(obj.toString());
                    }
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
