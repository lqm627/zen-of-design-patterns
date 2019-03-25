package com.lqm.pattern.extra.servant.example;

public class Client {
    public static void main(String[] args) {
        //厨师清洁厨房
        Cleaner cookie = new Cleaner();
        cookie.clean(new Kitchen());
        //园丁清洁花园
        Cleaner gardener = new Cleaner();
        gardener.clean(new Garden());
        //裁缝清洁衣服
        Cleaner tailer = new Cleaner();
        tailer.clean(new Cloth());
    }
}
