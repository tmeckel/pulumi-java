// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentMatcherResponse {
    /**
     * String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed.
     * 
     */
    private final String content;
    /**
     * The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
     * 
     */
    private final String matcher;

    @OutputCustomType.Constructor({"content","matcher"})
    private ContentMatcherResponse(
        String content,
        String matcher) {
        this.content = Objects.requireNonNull(content);
        this.matcher = Objects.requireNonNull(matcher);
    }

    /**
     * String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed.
     * 
     */
    public String getContent() {
        return this.content;
    }
    /**
     * The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
     * 
     */
    public String getMatcher() {
        return this.matcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String matcher;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.matcher = defaults.matcher;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setMatcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }

        public ContentMatcherResponse build() {
            return new ContentMatcherResponse(content, matcher);
        }
    }
}
