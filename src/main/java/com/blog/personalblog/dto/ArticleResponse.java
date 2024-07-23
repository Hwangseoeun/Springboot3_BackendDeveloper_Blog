package com.blog.personalblog.dto;

import com.blog.personalblog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
