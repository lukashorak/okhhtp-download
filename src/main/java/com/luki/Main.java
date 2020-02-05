package com.luki;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main");

        ClientWrapper clientWrapper = new ClientWrapper();
        String url = "https://www.idx.co.id/umbraco/Surface/StockData/GetSecuritiesStock?board=PENGEMBANGAN&draw=3&start=0&length=2";

        clientWrapper.get(url);
        //clientWrapper.getWithProxy(url,"localhost",8888);
    }


}
