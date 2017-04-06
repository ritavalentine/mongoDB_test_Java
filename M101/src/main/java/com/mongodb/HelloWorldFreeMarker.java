package com.mongodb;


import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class HelloWorldFreeMarker {
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(
                HelloWorldFreeMarker.class,"/");
        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name","Rita");
            helloTemplate.process(helloMap, writer);
            System.out.println(writer);
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
