package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @SerializedName("success")
    private boolean success;

    public List<Feed> getFeed() {
        return feeds;
    }

    public void setFeed(List<Feed> feed) {
        this.feeds = feed;
    }

    @SerializedName("feeds")
    private List<Feed> feeds;

}
