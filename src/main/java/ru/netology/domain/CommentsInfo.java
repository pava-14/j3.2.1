package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {

    private int id;
    private int count;
    private CommentBody comment;
    // Added by VK's review
    private boolean canPost;
    private int groupsCanPost;
    private int canClose;
    private int canOpen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public int getCanClose() {
        return canClose;
    }

    public void setCanClose(int canClose) {
        this.canClose = canClose;
    }

    public int getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(int canOpen) {
        this.canOpen = canOpen;
    }

    public CommentBody getComment() {
        return comment;
    }

    public void setComment(CommentBody comment) {
        this.comment = comment;
    }
}
