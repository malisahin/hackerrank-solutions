Combine data from two data sources into one stream using RxJava2

Overview

You are implementing an `interactor` for a micro-blogging application. For each post, your task is to fetch the blog post from one repository and its author name from the other repository.

Prerequisities:

- External data sources are defined as `PostRepository` and `UserRepository`
- Both `PostRepository.getAll()` and `UserRepository.getById(String id)` may emit errors.


```Java
import io.reactivex.Single;

interface  PostRepository{
    Single<List<PostDto>> getAll();
}

import io.reactivex.Single

interface PostsRepository {
    Single<List<PostDto>> getAll();
}

public final class PostDto{
    private final String id;
    private final String authorId;
    private final String content;

    public PostDto(String id, String authorId, String content){
        this.id=id;
        this.authorId=authorId;
        this.content=content;
    }

    public String getId(){
        return id;
    }

    public String getAuthorId{
        return authorId;
    }

    public String getContent(){
        return content;
    }
}

import io.reactivex.Single

interface UserRepository {
    Single<UserDto> getById(String userId);
}

public final class UserDto{
    private final String id;
    private final String name;

    public UserDto(String id, String name){
        this.id=id;
        this.name=name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

```

Implement function `Single<List<PostEntity>> getAllPosts()`, where `PostEntity` is defined as;

```java
public final class PostEntity{
    private final String authorName;
    private final String content;

    public PostEntity(String authorName, String content){
        this.authorName=authorName;
        this.content=content;
    }

    public String getAuthorName(){
        return authorName;
    }

    public String getContent(){
        return content;
    }
}

```

If for some reason `userRepository.getById(String id)` fails, assign `null` to `PostEntity.authorName`.

If for some reason `postsRepository.getAll()` fails, propagate the error downstream.

There is `io.reactive.rxjava2:rxjava:2.1.19` available on the classpath. If you need to use any classes from `io.reactivex`, just insert the proper imports.

