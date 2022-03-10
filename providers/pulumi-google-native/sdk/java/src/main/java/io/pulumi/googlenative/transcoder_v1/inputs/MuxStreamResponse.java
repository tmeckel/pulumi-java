// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.SegmentSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Multiplexing settings for output stream.
 * 
 */
public final class MuxStreamResponse extends io.pulumi.resources.InvokeArgs {

    public static final MuxStreamResponse Empty = new MuxStreamResponse();

    /**
     * The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
     * 
     */
    @InputImport(name="container", required=true)
      private final String container;

    public String getContainer() {
        return this.container;
    }

    /**
     * List of `ElementaryStream.key`s multiplexed in this stream.
     * 
     */
    @InputImport(name="elementaryStreams", required=true)
      private final List<String> elementaryStreams;

    public List<String> getElementaryStreams() {
        return this.elementaryStreams;
    }

    /**
     * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
     * 
     */
    @InputImport(name="fileName", required=true)
      private final String fileName;

    public String getFileName() {
        return this.fileName;
    }

    /**
     * A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Segment settings for `ts`, `fmp4` and `vtt`.
     * 
     */
    @InputImport(name="segmentSettings", required=true)
      private final SegmentSettingsResponse segmentSettings;

    public SegmentSettingsResponse getSegmentSettings() {
        return this.segmentSettings;
    }

    public MuxStreamResponse(
        String container,
        List<String> elementaryStreams,
        String fileName,
        String key,
        SegmentSettingsResponse segmentSettings) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.elementaryStreams = Objects.requireNonNull(elementaryStreams, "expected parameter 'elementaryStreams' to be non-null");
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.segmentSettings = Objects.requireNonNull(segmentSettings, "expected parameter 'segmentSettings' to be non-null");
    }

    private MuxStreamResponse() {
        this.container = null;
        this.elementaryStreams = List.of();
        this.fileName = null;
        this.key = null;
        this.segmentSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MuxStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private List<String> elementaryStreams;
        private String fileName;
        private String key;
        private SegmentSettingsResponse segmentSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(MuxStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.elementaryStreams = defaults.elementaryStreams;
    	      this.fileName = defaults.fileName;
    	      this.key = defaults.key;
    	      this.segmentSettings = defaults.segmentSettings;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder elementaryStreams(List<String> elementaryStreams) {
            this.elementaryStreams = Objects.requireNonNull(elementaryStreams);
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder segmentSettings(SegmentSettingsResponse segmentSettings) {
            this.segmentSettings = Objects.requireNonNull(segmentSettings);
            return this;
        }
        public MuxStreamResponse build() {
            return new MuxStreamResponse(container, elementaryStreams, fileName, key, segmentSettings);
        }
    }
}
