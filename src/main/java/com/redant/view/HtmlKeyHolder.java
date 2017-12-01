package com.redant.view;

/**
 * @author gris.wang
 * @since 2017/12/1
 **/
public class HtmlKeyHolder {

    private HtmlKeyHolder(){

    }

    /**
     * 未转义
     */
    public static String START_NO_ESCAPE = "#[";

    /**
     * 对[转义
     */
    public static String START_ESCAPE = "#\\[";

    public static String END = "]";

}
