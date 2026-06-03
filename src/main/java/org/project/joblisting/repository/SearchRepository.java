package org.project.joblisting.repository;

import org.project.joblisting.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
