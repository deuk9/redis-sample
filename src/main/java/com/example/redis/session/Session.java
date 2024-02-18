package com.example.redis.session;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("user")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Session {

    @Id
    private String id;
    private String name;
    private String ip;
}
