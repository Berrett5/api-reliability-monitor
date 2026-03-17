/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor;

import com.apimonitor.scheduler.MonitorScheduler;

/**
 *
 * @author bradi
 */

/*
 * Main entry point of the application.
 * Starts the monitoring scheduler.
 */
public class ApiReliabilityMonitor {
    
    public static void main(String[] args){
        
        // Startup message
        System.out.println("Starting API Reliability Monitor...");

        // Create scheduler
        MonitorScheduler scheduler = new MonitorScheduler();

        // Start automatic monitoring
        scheduler.startScheduler();
    }
}
