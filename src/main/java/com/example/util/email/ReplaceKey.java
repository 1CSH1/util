package com.example.util.email;

import java.util.List;

/**
 * when use template to send email maybe need this class
 * if the template has parameters to replace ,this class is useful
 * @author James-CSH
 * @since 3/15/2017 10:53 PM
 */
public class ReplaceKey {

    private static String prefix = "{";
    private static String suffix = "}";

    /**
     * string has some parameters should be replaced by values
     * such as: the string beforeReplace is "it's java {0},{1}", the values are {hello, world},
     * the result of this function is "it's java hello,world"
     * @param beforeReplace     the string before replace
     * @param values            the parameters need to replace as values
     * @return                  the string that the parameters have be replaced
     */
    public static String replace(String beforeReplace, List<String> values){
        if (null == values || values.size() < 1){
            return beforeReplace;
        }

        for (int i=0; i<values.size(); i++){
            beforeReplace = beforeReplace.replace(prefix + i + suffix, values.get(i));
        }

        return beforeReplace;
    }
}
