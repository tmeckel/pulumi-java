// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesis.inputs;

import com.pulumi.awsnative.kinesis.enums.StreamModeDetailsStreamMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * When specified, enables or updates the mode of stream. Default is PROVISIONED.
 * 
 */
public final class StreamModeDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamModeDetailsArgs Empty = new StreamModeDetailsArgs();

    /**
     * The mode of the stream
     * 
     */
    @Import(name="streamMode", required=true)
    private Output<StreamModeDetailsStreamMode> streamMode;

    /**
     * @return The mode of the stream
     * 
     */
    public Output<StreamModeDetailsStreamMode> streamMode() {
        return this.streamMode;
    }

    private StreamModeDetailsArgs() {}

    private StreamModeDetailsArgs(StreamModeDetailsArgs $) {
        this.streamMode = $.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamModeDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamModeDetailsArgs $;

        public Builder() {
            $ = new StreamModeDetailsArgs();
        }

        public Builder(StreamModeDetailsArgs defaults) {
            $ = new StreamModeDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param streamMode The mode of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamMode(Output<StreamModeDetailsStreamMode> streamMode) {
            $.streamMode = streamMode;
            return this;
        }

        /**
         * @param streamMode The mode of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamMode(StreamModeDetailsStreamMode streamMode) {
            return streamMode(Output.of(streamMode));
        }

        public StreamModeDetailsArgs build() {
            $.streamMode = Objects.requireNonNull($.streamMode, "expected parameter 'streamMode' to be non-null");
            return $;
        }
    }

}
