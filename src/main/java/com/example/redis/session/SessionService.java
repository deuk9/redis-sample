package com.example.redis.session;


import com.example.redis.session.controller.SessionBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;

    public void addSession(SessionBody sessionBody) {
        Session save = sessionRepository.save(Session.builder()
                .id(sessionBody.id())
                .ip(sessionBody.ip())
                .name(sessionBody.name())
                .build());
    }

    public Session getSession(String id) {
        return sessionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("aa"));
    }
}
