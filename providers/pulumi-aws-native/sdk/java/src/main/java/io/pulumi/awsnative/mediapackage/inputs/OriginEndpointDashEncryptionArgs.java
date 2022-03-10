// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class OriginEndpointDashEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointDashEncryptionArgs Empty = new OriginEndpointDashEncryptionArgs();

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    @InputImport(name="keyRotationIntervalSeconds")
      private final @Nullable Input<Integer> keyRotationIntervalSeconds;

    public Input<Integer> getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds == null ? Input.empty() : this.keyRotationIntervalSeconds;
    }

    @InputImport(name="spekeKeyProvider", required=true)
      private final Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Input<OriginEndpointSpekeKeyProviderArgs> getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointDashEncryptionArgs(
        @Nullable Input<Integer> keyRotationIntervalSeconds,
        Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointDashEncryptionArgs() {
        this.keyRotationIntervalSeconds = Input.empty();
        this.spekeKeyProvider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointDashEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> keyRotationIntervalSeconds;
        private Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointDashEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Input<Integer> keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = Input.ofNullable(keyRotationIntervalSeconds);
            return this;
        }

        public Builder spekeKeyProvider(Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProviderArgs spekeKeyProvider) {
            this.spekeKeyProvider = Input.of(Objects.requireNonNull(spekeKeyProvider));
            return this;
        }
        public OriginEndpointDashEncryptionArgs build() {
            return new OriginEndpointDashEncryptionArgs(keyRotationIntervalSeconds, spekeKeyProvider);
        }
    }
}
