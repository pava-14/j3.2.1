package ru.netology.domain;

import java.util.Date;

public class CommentBody {

    private int id;
    private String commentText;
    private Date commentDate
    private Author commentAuthor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Author getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(Author commentAuthor) {
        this.commentAuthor = commentAuthor;
    }
}
