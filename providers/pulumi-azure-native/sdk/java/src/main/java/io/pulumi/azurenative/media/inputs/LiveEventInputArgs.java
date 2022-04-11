// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.LiveEventInputProtocol;
import io.pulumi.azurenative.media.inputs.LiveEventEndpointArgs;
import io.pulumi.azurenative.media.inputs.LiveEventInputAccessControlArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The live event input.
 * 
 */
public final class LiveEventInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventInputArgs Empty = new LiveEventInputArgs();

    /**
     * Access control for live event input.
     * 
     */
    @Import(name="accessControl")
      private final @Nullable Output<LiveEventInputAccessControlArgs> accessControl;

    public Output<LiveEventInputAccessControlArgs> getAccessControl() {
        return this.accessControl == null ? Codegen.empty() : this.accessControl;
    }

    /**
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    /**
     * The input endpoints for the live event.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<LiveEventEndpointArgs>> endpoints;

    public Output<List<LiveEventEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    /**
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    @Import(name="keyFrameIntervalDuration")
      private final @Nullable Output<String> keyFrameIntervalDuration;

    public Output<String> getKeyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration == null ? Codegen.empty() : this.keyFrameIntervalDuration;
    }

    /**
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    @Import(name="streamingProtocol", required=true)
      private final Output<Either<String,LiveEventInputProtocol>> streamingProtocol;

    public Output<Either<String,LiveEventInputProtocol>> getStreamingProtocol() {
        return this.streamingProtocol;
    }

    public LiveEventInputArgs(
        @Nullable Output<LiveEventInputAccessControlArgs> accessControl,
        @Nullable Output<String> accessToken,
        @Nullable Output<List<LiveEventEndpointArgs>> endpoints,
        @Nullable Output<String> keyFrameIntervalDuration,
        Output<Either<String,LiveEventInputProtocol>> streamingProtocol) {
        this.accessControl = accessControl;
        this.accessToken = accessToken;
        this.endpoints = endpoints;
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        this.streamingProtocol = Objects.requireNonNull(streamingProtocol, "expected parameter 'streamingProtocol' to be non-null");
    }

    private LiveEventInputArgs() {
        this.accessControl = Codegen.empty();
        this.accessToken = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.keyFrameIntervalDuration = Codegen.empty();
        this.streamingProtocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LiveEventInputAccessControlArgs> accessControl;
        private @Nullable Output<String> accessToken;
        private @Nullable Output<List<LiveEventEndpointArgs>> endpoints;
        private @Nullable Output<String> keyFrameIntervalDuration;
        private Output<Either<String,LiveEventInputProtocol>> streamingProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accessToken = defaults.accessToken;
    	      this.endpoints = defaults.endpoints;
    	      this.keyFrameIntervalDuration = defaults.keyFrameIntervalDuration;
    	      this.streamingProtocol = defaults.streamingProtocol;
        }

        public Builder accessControl(@Nullable Output<LiveEventInputAccessControlArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder accessControl(@Nullable LiveEventInputAccessControlArgs accessControl) {
            this.accessControl = Codegen.ofNullable(accessControl);
            return this;
        }
        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<LiveEventEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<LiveEventEndpointArgs> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(LiveEventEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder keyFrameIntervalDuration(@Nullable Output<String> keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = keyFrameIntervalDuration;
            return this;
        }
        public Builder keyFrameIntervalDuration(@Nullable String keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = Codegen.ofNullable(keyFrameIntervalDuration);
            return this;
        }
        public Builder streamingProtocol(Output<Either<String,LiveEventInputProtocol>> streamingProtocol) {
            this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
            return this;
        }
        public Builder streamingProtocol(Either<String,LiveEventInputProtocol> streamingProtocol) {
            this.streamingProtocol = Output.of(Objects.requireNonNull(streamingProtocol));
            return this;
        }        public LiveEventInputArgs build() {
            return new LiveEventInputArgs(accessControl, accessToken, endpoints, keyFrameIntervalDuration, streamingProtocol);
        }
    }
}
