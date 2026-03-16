/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor;

import com.apimonitor.services.MonitorCheckService;

/**
 *
 * @author bradi
 */

/*
 * Main application entry point.
 * Starts the API monitoring process.
 */
public class ApiReliabilityMonitor {
    
    public static void main(String[] args){
        
        // Print startup message
        System.out.println("Starting API Reliability Monitor...");

        // Create the monitoring service
        MonitorCheckService service = new MonitorCheckService();

        // Run checks for all monitors in the database
        service.runAllChecks();
    }
}
