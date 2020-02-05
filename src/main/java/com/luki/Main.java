package com.luki;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main");

        Main m = new Main();
        m.start();

        GetExample g = new GetExample();
        String url = "https://www.idx.co.id/umbraco/Surface/StockData/GetSecuritiesStock?board=PENGEMBANGAN&draw=3&start=0&length=100";
        try {
            g.run(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        String url = "https://www.idx.co.id/umbraco/Surface/StockData/GetSecuritiesStock?board=PENGEMBANGAN&draw=3&start=0&length=100";
        try {
            this.get(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String url) {
        String result = "";
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
