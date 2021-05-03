package ru.netology.manager;

import ru.netology.domain.Post;

public class MainPageManager {
    private PostManager postManager;

    public String generate(){
        Post[] posts = postManager.generateBlock();
        for (Post post : posts) {
            int block = post.getId();
        }
        return null;
    }

}
