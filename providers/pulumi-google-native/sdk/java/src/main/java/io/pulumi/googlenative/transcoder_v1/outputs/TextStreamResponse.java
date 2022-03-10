// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.TextMappingResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TextStreamResponse {
    /**
     * The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt`
     * 
     */
    private final String codec;
    /**
     * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
     * 
     */
    private final List<TextMappingResponse> mapping;

    @OutputCustomType.Constructor
    private TextStreamResponse(
        @OutputCustomType.Parameter("codec") String codec,
        @OutputCustomType.Parameter("mapping") List<TextMappingResponse> mapping) {
        this.codec = codec;
        this.mapping = mapping;
    }

    /**
     * The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt`
     * 
    */
    public String getCodec() {
        return this.codec;
    }
    /**
     * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
     * 
    */
    public List<TextMappingResponse> getMapping() {
        return this.mapping;
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

        public Builder codec(String codec) {
            this.codec = Objects.requireNonNull(codec);
            return this;
        }

        public Builder mapping(List<TextMappingResponse> mapping) {
            this.mapping = Objects.requireNonNull(mapping);
            return this;
        }
        public TextStreamResponse build() {
            return new TextStreamResponse(codec, mapping);
        }
    }
}
