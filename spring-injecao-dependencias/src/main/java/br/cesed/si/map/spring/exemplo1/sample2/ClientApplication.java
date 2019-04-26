package br.cesed.si.map.spring.exemplo1.sample2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class ClientApplication {
 
    public static void main(String[] args) {

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
    	
        MyApplication app = context.getBean(MyApplication.class);
         
        app.processMessage("Hi Daniel", "daniel@daniel-abella.com");
         
        //close the context
        context.close();
    }
 
}