// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.ivs.enums.ChannelLatencyMode;
import com.pulumi.awsnative.ivs.enums.ChannelType;
import com.pulumi.awsnative.ivs.inputs.ChannelTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    /**
     * Whether the channel is authorized.
     * 
     */
    @Import(name="authorized")
    private @Nullable Output<Boolean> authorized;

    /**
     * @return Whether the channel is authorized.
     * 
     */
    public Optional<Output<Boolean>> authorized() {
        return Optional.ofNullable(this.authorized);
    }

    /**
     * Channel latency mode.
     * 
     */
    @Import(name="latencyMode")
    private @Nullable Output<ChannelLatencyMode> latencyMode;

    /**
     * @return Channel latency mode.
     * 
     */
    public Optional<Output<ChannelLatencyMode>> latencyMode() {
        return Optional.ofNullable(this.latencyMode);
    }

    /**
     * Channel
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Channel
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    @Import(name="recordingConfigurationArn")
    private @Nullable Output<String> recordingConfigurationArn;

    /**
     * @return Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    public Optional<Output<String>> recordingConfigurationArn() {
        return Optional.ofNullable(this.recordingConfigurationArn);
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ChannelTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Optional<Output<List<ChannelTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ChannelType> type;

    /**
     * @return Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    public Optional<Output<ChannelType>> type() {
        return Optional.ofNullable(this.type);
    }

    private ChannelArgs() {}

    private ChannelArgs(ChannelArgs $) {
        this.authorized = $.authorized;
        this.latencyMode = $.latencyMode;
        this.name = $.name;
        this.recordingConfigurationArn = $.recordingConfigurationArn;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelArgs $;

        public Builder() {
            $ = new ChannelArgs();
        }

        public Builder(ChannelArgs defaults) {
            $ = new ChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorized Whether the channel is authorized.
         * 
         * @return builder
         * 
         */
        public Builder authorized(@Nullable Output<Boolean> authorized) {
            $.authorized = authorized;
            return this;
        }

        /**
         * @param authorized Whether the channel is authorized.
         * 
         * @return builder
         * 
         */
        public Builder authorized(Boolean authorized) {
            return authorized(Output.of(authorized));
        }

        /**
         * @param latencyMode Channel latency mode.
         * 
         * @return builder
         * 
         */
        public Builder latencyMode(@Nullable Output<ChannelLatencyMode> latencyMode) {
            $.latencyMode = latencyMode;
            return this;
        }

        /**
         * @param latencyMode Channel latency mode.
         * 
         * @return builder
         * 
         */
        public Builder latencyMode(ChannelLatencyMode latencyMode) {
            return latencyMode(Output.of(latencyMode));
        }

        /**
         * @param name Channel
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Channel
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recordingConfigurationArn Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
         * 
         * @return builder
         * 
         */
        public Builder recordingConfigurationArn(@Nullable Output<String> recordingConfigurationArn) {
            $.recordingConfigurationArn = recordingConfigurationArn;
            return this;
        }

        /**
         * @param recordingConfigurationArn Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
         * 
         * @return builder
         * 
         */
        public Builder recordingConfigurationArn(String recordingConfigurationArn) {
            return recordingConfigurationArn(Output.of(recordingConfigurationArn));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ChannelTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ChannelTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(ChannelTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<ChannelType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
         * 
         * @return builder
         * 
         */
        public Builder type(ChannelType type) {
            return type(Output.of(type));
        }

        public ChannelArgs build() {
            return $;
        }
    }

}
