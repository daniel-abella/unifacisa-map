package br.cesed.si.map.spring.exemplo1.sample2;

/*
 * Implementa��o da Interface
 */
public class TwitterService implements MessageService {
 
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
    }
 
}