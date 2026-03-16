/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor.utils;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author bradi
 */

/*
 * HttpCheckUtil
 * -------------
 * Performs HTTP checks against API endpoints.
 * Measures response time and returns the status code.
 */
public class HttpCheckUtil {
    
    /*
     * performCheck
     * ------------
     * Sends an HTTP request to the given URL and measures response time.
     */
    public static int performCheck(String urlString) {

        int statusCode = -1;

        try {

            long startTime = System.currentTimeMillis();

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            statusCode = connection.getResponseCode();

            long endTime = System.currentTimeMillis();

            long responseTime = endTime - startTime;

            System.out.println("Status Code: " + statusCode);
            System.out.println("Response Time: " + responseTime + " ms");

        } catch (Exception e) {

            System.out.println("Error performing HTTP check.");
            e.printStackTrace();

        }

        return statusCode;
    }
    
}
