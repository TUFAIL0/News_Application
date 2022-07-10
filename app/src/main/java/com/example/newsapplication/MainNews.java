package com.example.newsapplication;

import java.util.ArrayList;

public class MainNews {

    private String status;
    private String totalResult;
    private ArrayList<ModelClass> articles;

    public MainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResult = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<ModelClass> getArticle() {
        return articles;
    }

    public void setArticle(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
