package org.project.joblisting.repository;

import org.project.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends MongoRepository<Post,String> {
}
