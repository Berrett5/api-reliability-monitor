/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor;

import com.apimonitor.database.CheckResultRepository;
import com.apimonitor.models.CheckResult;

/**
 *
 * @author bradi
 */

public class ApiReliabilityMonitor {
    
    public static void main(String[] args){
        
        System.out.println("Starting API Reliability Monitor...");

        CheckResult testResult = new CheckResult(
                0,
                1,
                null,
                200,
                150,
                true,
                null
        );

        CheckResultRepository repository = new CheckResultRepository();
        repository.saveCheckResult(testResult);
        
    }
}
