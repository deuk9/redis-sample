package com.example.redis.session.controller;

import com.example.redis.session.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @PostMapping("/session")
    public void addSession(@RequestBody SessionBody body) {
        sessionService.addSession(body);
    }

    @GetMapping("/session/{id}")
    public ResponseEntity<?> getSession(@PathVariable String id) {

        return ResponseEntity.ok(sessionService.getSession(id));
    }

}
