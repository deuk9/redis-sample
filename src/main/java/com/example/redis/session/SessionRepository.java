package com.example.redis.session;

import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session, String> {
}
