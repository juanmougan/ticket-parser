package io.github.juanmougan.parser;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ParserResponse {
    private String content;
    private byte[] hash;
}
