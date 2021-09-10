package io.github.juanmougan.parser;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;

@NoArgsConstructor
@Data
public class ParserRequest {
    private Path path;
}
