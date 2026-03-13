/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor;

import com.apimonitor.database.DatabaseConnection;

/**
 *
 * @author bradi
 */
public class ApiReliabilityMonitor {
    
    public static void main(String[] args){
        
        System.out.println("Starting API Reliability Monitor...");
        DatabaseConnection.getConnection();
        
    }
}
