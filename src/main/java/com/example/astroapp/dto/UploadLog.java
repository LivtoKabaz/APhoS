package com.example.astroapp.dto;

import org.springframework.data.util.Pair;

import java.sql.Timestamp;
import java.util.List;

public class UploadLog {

    private long id;
    private Timestamp uploadTime;
    private int numOfFiles;
    private int numOfErrors;
    private int numOfSuccessful;
    private List<Pair<String, String>> fileErrorMessagePairsList;

    public UploadLog() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getNumOfFiles() {
        return numOfFiles;
    }

    public void setNumOfFiles(int numOfFiles) {
        this.numOfFiles = numOfFiles;
    }

    public int getNumOfErrors() {
        return numOfErrors;
    }

    public void setNumOfErrors(int numOfErrors) {
        this.numOfErrors = numOfErrors;
    }

    public int getNumOfSuccessful() {
        return numOfSuccessful;
    }

    public void setNumOfSuccessful(int numOfSuccessful) {
        this.numOfSuccessful = numOfSuccessful;
    }

    public List<Pair<String, String>> getFileErrorMessagePairsList() {
        return fileErrorMessagePairsList;
    }

    public void setFileErrorMessagePairsList(List<Pair<String, String>> fileErrorMessagePairsList) {
        this.fileErrorMessagePairsList = fileErrorMessagePairsList;
    }
}
