package com.codility;

import io.reactivex.*;

import java.util.Arrays;
import java.util.List;

public class PostsInteractor {
    private final PostsRepository postsRepository;
    private final UserRepository userRepository;

    PostsInteractor(
            PostsRepository postsRepository,
            UserRepository userRepository
    ) {
        this.postsRepository = postsRepository;
        this.userRepository = userRepository;
    }

    Single<List<PostEntity>> getAllPosts() {
        return postsRepository.getAll()
                .flatMap(posts -> {
                    List<Single<PostEntity>> singles = Flowable.fromIterable(posts)
                            .map(postDto -> {
                                Single<UserDto> userSingle = userRepository.getById(postDto.getAuthorId())
                                        .onErrorReturnItem(new UserDto(null, null));
                                return userSingle.map(userDto -> new PostEntity(userDto.getName(), postDto.getContent()));
                            })
                            .toList();

                    return Single.zip(singles, objects -> {
                        PostEntity[] postEntities = new PostEntity[objects.length];
                        for (int i = 0; i < objects.length; i++) {
                            postEntities[i] = (PostEntity) objects[i];
                        }
                        return List.of(postEntities);
                    });
                });
    }
}
