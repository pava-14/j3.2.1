package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {

    private int id;
    private int count;
    private boolean canPost;
    private CommentBody comment;

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

    public CommentBody getComment() {
        return comment;
    }

    public void setComment(CommentBody comment) {
        this.comment = comment;
    }
}
