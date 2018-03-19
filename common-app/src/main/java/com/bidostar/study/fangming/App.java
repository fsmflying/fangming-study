package com.bidostar.study.fangming;

import java.util.Map;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("====environments===========================================================");
        Map<String,String> envs = System.getenv();
        for(String key:envs.keySet()){
            System.out.println(key+"="+ envs.get(key));
        }
        System.out.println("====properties=============================================================");
        Properties properties = System.getProperties();
        for(Map.Entry<Object,Object> entry:properties.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
