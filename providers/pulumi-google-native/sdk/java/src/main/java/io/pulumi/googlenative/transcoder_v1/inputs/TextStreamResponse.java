// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.TextMappingResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Encoding of a text stream. For example, closed captions or subtitles.
 * 
 */
public final class TextStreamResponse extends io.pulumi.resources.InvokeArgs {

    public static final TextStreamResponse Empty = new TextStreamResponse();

    /**
     * The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt`
     * 
     */
    @InputImport(name="codec", required=true)
    private final String codec;

    public String getCodec() {
        return this.codec;
    }

    /**
     * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
     * 
     */
    @InputImport(name="mapping", required=true)
    private final List<TextMappingResponse> mapping;

    public List<TextMappingResponse> getMapping() {
        return this.mapping;
    }

    public TextStreamResponse(
        String codec,
        List<TextMappingResponse> mapping) {
        this.codec = Objects.requireNonNull(codec, "expected parameter 'codec' to be non-null");
        this.mapping = Objects.requireNonNull(mapping, "expected parameter 'mapping' to be non-null");
    }

    private TextStreamResponse() {
        this.codec = null;
        this.mapping = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String codec;
        private List<TextMappingResponse> mapping;

        public Builder() {
    	      // Empty
        }

        public Builder(TextStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codec = defaults.codec;
    	      this.mapping = defaults.mapping;
        }

        public Builder setCodec(String codec) {
            this.codec = Objects.requireNonNull(codec);
            return this;
        }

        public Builder setMapping(List<TextMappingResponse> mapping) {
            this.mapping = Objects.requireNonNull(mapping);
            return this;
        }

        public TextStreamResponse build() {
            return new TextStreamResponse(codec, mapping);
        }
    }
}
