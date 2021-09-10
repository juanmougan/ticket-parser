package io.github.juanmougan.parser;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Builder
@Data
@FieldNameConstants
public class ParserResponse {
    private String content;
    private byte[] hash;
}
