package com.blueconic.browscap;

import com.blueconic.browscap.impl.Rule;

public interface UserAgentParser {

    /**
     * Parses a User-Agent header value into a Capabilities object.
     * @param userAgent The user agent
     * @return The capabilities of the best matching rule
     */
    Capabilities parse(String userAgent);

    /**
     * @return Array of alphabetically sorted Rules
     */
    Rule[] getRules();
}
