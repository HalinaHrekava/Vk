package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int date;
    private int likesCount;
    private int viewsCount;
    private String imageUrl;
    private String postLogoURL;
    private String profileName;
    private String repostsButton;
    private String commentButton;
    private String commentsInfo;
    private String text;
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPostLogoURL() {
        return postLogoURL;
    }

    public void setPostLogoURL(String postLogoURL) {
        this.postLogoURL = postLogoURL;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getRepostsButton() {
        return repostsButton;
    }

    public void setRepostsButton(String repostsButton) {
        this.repostsButton = repostsButton;
    }

    public String getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(String commentButton) {
        this.commentButton = commentButton;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
