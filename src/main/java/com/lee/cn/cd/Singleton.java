package com.lee.cn.cd;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-2-25
 * Time: 下午1:16
 * 单例
 */
public class Singleton {
    private String attribute;

    //私有化
    private  Singleton(){}

    /*********************************/
    /************方法1****************/
    /*********************************/
    public static Singleton getInstall_1(){
        //利用了Classloader的特性，解决多线程问题。实现了延迟加载
        return SingletonHolder.SINGLETON;
    }
    private static class SingletonHolder{
        private static Singleton SINGLETON = new Singleton();
    }

    /*********************************/
    /************方法1****************/
    /*********************************/
    private static Singleton instance2= new Singleton();
    public static Singleton getInstall_2(){
        return instance2;
    }

    /*********************************/
    /************方法3****************/
    /*********************************/
    private static Singleton instance3;
    public static Singleton getInstall_3(){
        if(instance3 == null){
            return instance3 = new Singleton();
        }else{
            return instance3;
        }
    }
    /*********************************/
    /************方法4****************/
    /*********************************/
    private static Singleton instance4;
    public static synchronized Singleton getInstall_4(){
        if(instance4 == null){
            return instance4 = new Singleton();
        }else{
            return instance4;
        }
    }

    /*********************************/
    /************方法5****************/
    /*********************************/
    private static Singleton instance5;
    public static Singleton getInstall_5(){
        if(instance5 == null){
            synchronized (Singleton.class){
                if(instance5 == null){
                    return instance5 = new Singleton();
                }
            }
        }
        return instance5;
    }

    /*********************************/
    /************方法6****************/
    /*********************************/
    private static ThreadLocal<Singleton> instance6;
    public static Singleton getInstall_6(){
        Singleton instance = instance6.get();
        if(instance == null){
            instance = new Singleton();
            instance6.set(instance);
        }
        return instance;
    }





    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
