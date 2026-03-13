/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apimonitor.models;

/**
 *
 * @author bradi
 */

/*
 * CheckResult Model
 * -----------------
 * Represents one row from the check_results table.
 * Each object stores the outcome of one API check.
 */
public class CheckResult {
    
    // Unique ID of the check result
    private int resultId;

    // ID of the monitor that performed the check
    private int monitorId;

    // Timestamp when the check was performed
    private String checkedAt;

    // HTTP status code returned by the API
    private int statusCode;

    // Time it took for the API to respond (milliseconds)
    private int responseTimeMs;

    // Whether the check succeeded or failed
    private boolean isSuccess;

    // Error message if the request failed
    private String errorMessage;


    /*
     * Default constructor
     * Used when creating an empty object
     */
    public CheckResult() {
    }


    /*
     * Full constructor
     * Creates a fully populated check result
     */
    public CheckResult(int resultId, int monitorId, String checkedAt,
                       int statusCode, int responseTimeMs,
                       boolean isSuccess, String errorMessage) {

        this.resultId = resultId;
        this.monitorId = monitorId;
        this.checkedAt = checkedAt;
        this.statusCode = statusCode;
        this.responseTimeMs = responseTimeMs;
        this.isSuccess = isSuccess;
        this.errorMessage = errorMessage;
    }


    // Getters and Setters


    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public String getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getResponseTimeMs() {
        return responseTimeMs;
    }

    public void setResponseTimeMs(int responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
