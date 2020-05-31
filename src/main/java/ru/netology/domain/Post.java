package ru.netology.domain;

import java.util.Date;

public class Post {

    private int id;
    private String postTag;
    private String postSubject;
    private long countLike;
    private long countRepost;
    private Date postDate;
    private boolean canComment;
    private PostBody postBody;
    private Author postAauthor;
    private CommentsInfo commentsInfo;

    // Added by VK's review
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private Likes likes;
    private Repost reposts;
    private Views views;
    // vk's post_type -> postTag
    private PostSource postSource;
    private Geo geo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String postTag) {
        this.postTag = postTag;
    }

    public String getPostSubject() {
        return postSubject;
    }

    public void setPostSubject(String postSubject) {
        this.postSubject = postSubject;
    }

    public long getCountLike() {
        return countLike;
    }

    public void setCountLike(long countLike) {
        this.countLike = countLike;
    }

    public long getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(long countRepost) {
        this.countRepost = countRepost;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public PostBody getPostBody() {
        return postBody;
    }

    public void setPostBody(PostBody postBody) {
        this.postBody = postBody;
    }

    public Author getPostAauthor() {
        return postAauthor;
    }

    public void setPostAauthor(Author postAauthor) {
        this.postAauthor = postAauthor;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
