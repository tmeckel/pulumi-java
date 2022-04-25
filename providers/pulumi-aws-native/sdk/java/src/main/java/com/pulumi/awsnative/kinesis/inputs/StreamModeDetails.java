// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesis.inputs;

import com.pulumi.awsnative.kinesis.enums.StreamModeDetailsStreamMode;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * When specified, enables or updates the mode of stream. Default is PROVISIONED.
 * 
 */
public final class StreamModeDetails extends com.pulumi.resources.InvokeArgs {

    public static final StreamModeDetails Empty = new StreamModeDetails();

    /**
     * The mode of the stream
     * 
     */
    @Import(name="streamMode", required=true)
    private StreamModeDetailsStreamMode streamMode;

    /**
     * @return The mode of the stream
     * 
     */
    public StreamModeDetailsStreamMode streamMode() {
        return this.streamMode;
    }

    private StreamModeDetails() {}

    private StreamModeDetails(StreamModeDetails $) {
        this.streamMode = $.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamModeDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamModeDetails $;

        public Builder() {
            $ = new StreamModeDetails();
        }

        public Builder(StreamModeDetails defaults) {
            $ = new StreamModeDetails(Objects.requireNonNull(defaults));
        }

        /**
         * @param streamMode The mode of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamMode(StreamModeDetailsStreamMode streamMode) {
            $.streamMode = streamMode;
            return this;
        }

        public StreamModeDetails build() {
            $.streamMode = Objects.requireNonNull($.streamMode, "expected parameter 'streamMode' to be non-null");
            return $;
        }
    }

}
