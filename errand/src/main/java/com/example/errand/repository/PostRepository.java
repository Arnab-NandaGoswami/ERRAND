package com.example.errand.repository;
import com.example.errand.model.Post;
import com.example.errand.model.Suberrand;
import com.example.errand.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Suberrand suberrand);

    List<Post> findByUser(User user);
}
