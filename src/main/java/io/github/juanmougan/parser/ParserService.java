package io.github.juanmougan.parser;

import javax.enterprise.context.ApplicationScoped;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ApplicationScoped
public class ParserService {
    private static byte[] calculateHash(byte[] content) {
        try {
            var digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(content);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ParserResponse parseImage(ParserRequest request) {
        final var hardcoded = "This is the parsed text";
        return ParserResponse.builder()
                .content(hardcoded)
                .hash(calculateHash(hardcoded.getBytes(StandardCharsets.UTF_8)))
                .build();
    }
}
