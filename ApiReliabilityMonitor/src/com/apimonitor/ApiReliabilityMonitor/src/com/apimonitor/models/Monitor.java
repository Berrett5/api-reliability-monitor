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
 * Monitor Model
 * -------------
 * This class represents one record from the "monitors" database table.
 * Each object created from this class holds the configuration for one API monitor.
 */
public class Monitor {
    
// Unique ID of the monitor (matches monitor_id in the database)
    private int monitorId;

    // Friendly name for the API being monitored
    private String name;

    // The API endpoint URL that will be checked
    private String url;

    // HTTP method used when making the request (GET, POST, etc.)
    private String httpMethod;

    // How often the monitor should run (in seconds)
    private int checkIntervalSeconds;

    // Maximum time allowed for the API response (in milliseconds)
    private int timeoutMs;

    // Expected successful HTTP status code (usually 200)
    private int expectedStatusCode;

    // Indicates if the monitor is currently active
    private boolean isActive;


    /*
     * Default Constructor
     * -------------------
     * Creates an empty Monitor object.
     * This is useful when loading data from a database.
     */
    public Monitor() {
    }


    /*
     * Full Constructor
     * ----------------
     * Creates a Monitor object with all fields populated.
     * Useful when creating a new monitor configuration.
     */
    public Monitor(int monitorId, String name, String url, String httpMethod,
                   int checkIntervalSeconds, int timeoutMs,
                   int expectedStatusCode, boolean isActive) {

        this.monitorId = monitorId;
        this.name = name;
        this.url = url;
        this.httpMethod = httpMethod;
        this.checkIntervalSeconds = checkIntervalSeconds;
        this.timeoutMs = timeoutMs;
        this.expectedStatusCode = expectedStatusCode;
        this.isActive = isActive;
    }


    // Getter and Setter Methods
    // -------------------------
    // These allow other parts of the program to safely access and modify
    // the fields of the Monitor object.


    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public int getCheckIntervalSeconds() {
        return checkIntervalSeconds;
    }

    public void setCheckIntervalSeconds(int checkIntervalSeconds) {
        this.checkIntervalSeconds = checkIntervalSeconds;
    }

    public int getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(int timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    public int getExpectedStatusCode() {
        return expectedStatusCode;
    }

    public void setExpectedStatusCode(int expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
