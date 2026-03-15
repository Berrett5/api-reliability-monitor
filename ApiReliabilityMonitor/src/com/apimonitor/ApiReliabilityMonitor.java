/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor;

import com.apimonitor.database.MonitorRepository;
import com.apimonitor.models.Monitor;
import java.util.List;

/**
 *
 * @author bradi
 */

public class ApiReliabilityMonitor {
    
    public static void main(String[] args){
        
        System.out.println("Starting API Reliability Monitor...");

        MonitorRepository repository = new MonitorRepository();
        List<Monitor> monitors = repository.getAllMonitors();

        for (Monitor monitor : monitors) {
            System.out.println("Monitor ID: " + monitor.getMonitorId());
            System.out.println("Name: " + monitor.getName());
            System.out.println("URL: " + monitor.getUrl());
            System.out.println("HTTP Method: " + monitor.getHttpMethod());
            System.out.println("----------------------------");
        }
        
    }
}
