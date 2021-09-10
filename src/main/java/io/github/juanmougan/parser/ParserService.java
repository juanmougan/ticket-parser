package io.github.juanmougan.parser;

import javax.enterprise.context.ApplicationScoped;
import java.nio.charset.StandardCharsets;

@ApplicationScoped
public class ParserService {
    public ParserResponse parseImage(ParserRequest request) {
        return ParserResponse.builder()
                .content("This is the parsed text")
                .hash("This is the hash".getBytes(StandardCharsets.UTF_8))
                .build();
    }
}
