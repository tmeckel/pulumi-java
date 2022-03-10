// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A content string and a MIME type that describes the content string's format.
 * 
 */
public final class DocumentationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationArgs Empty = new DocumentationArgs();

    /**
     * The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The format of the content field. Presently, only the value "text/markdown" is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
     * 
     */
    @InputImport(name="mimeType")
      private final @Nullable Input<String> mimeType;

    public Input<String> getMimeType() {
        return this.mimeType == null ? Input.empty() : this.mimeType;
    }

    public DocumentationArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> mimeType) {
        this.content = content;
        this.mimeType = mimeType;
    }

    private DocumentationArgs() {
        this.content = Input.empty();
        this.mimeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder content(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder mimeType(@Nullable Input<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Input.ofNullable(mimeType);
            return this;
        }
        public DocumentationArgs build() {
            return new DocumentationArgs(content, mimeType);
        }
    }
}
