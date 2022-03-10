// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsEncryptionEncryptionMethod;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 */
public final class OriginEndpointHlsEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsEncryptionArgs Empty = new OriginEndpointHlsEncryptionArgs();

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    @InputImport(name="constantInitializationVector")
      private final @Nullable Input<String> constantInitializationVector;

    public Input<String> getConstantInitializationVector() {
        return this.constantInitializationVector == null ? Input.empty() : this.constantInitializationVector;
    }

    /**
     * The encryption method to use.
     * 
     */
    @InputImport(name="encryptionMethod")
      private final @Nullable Input<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod;

    public Input<OriginEndpointHlsEncryptionEncryptionMethod> getEncryptionMethod() {
        return this.encryptionMethod == null ? Input.empty() : this.encryptionMethod;
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    @InputImport(name="keyRotationIntervalSeconds")
      private final @Nullable Input<Integer> keyRotationIntervalSeconds;

    public Input<Integer> getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds == null ? Input.empty() : this.keyRotationIntervalSeconds;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @InputImport(name="repeatExtXKey")
      private final @Nullable Input<Boolean> repeatExtXKey;

    public Input<Boolean> getRepeatExtXKey() {
        return this.repeatExtXKey == null ? Input.empty() : this.repeatExtXKey;
    }

    @InputImport(name="spekeKeyProvider", required=true)
      private final Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Input<OriginEndpointSpekeKeyProviderArgs> getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointHlsEncryptionArgs(
        @Nullable Input<String> constantInitializationVector,
        @Nullable Input<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod,
        @Nullable Input<Integer> keyRotationIntervalSeconds,
        @Nullable Input<Boolean> repeatExtXKey,
        Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.encryptionMethod = encryptionMethod;
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointHlsEncryptionArgs() {
        this.constantInitializationVector = Input.empty();
        this.encryptionMethod = Input.empty();
        this.keyRotationIntervalSeconds = Input.empty();
        this.repeatExtXKey = Input.empty();
        this.spekeKeyProvider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> constantInitializationVector;
        private @Nullable Input<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod;
        private @Nullable Input<Integer> keyRotationIntervalSeconds;
        private @Nullable Input<Boolean> repeatExtXKey;
        private Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.encryptionMethod = defaults.encryptionMethod;
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder constantInitializationVector(@Nullable Input<String> constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = Input.ofNullable(constantInitializationVector);
            return this;
        }

        public Builder encryptionMethod(@Nullable Input<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder encryptionMethod(@Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod) {
            this.encryptionMethod = Input.ofNullable(encryptionMethod);
            return this;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Input<Integer> keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = Input.ofNullable(keyRotationIntervalSeconds);
            return this;
        }

        public Builder repeatExtXKey(@Nullable Input<Boolean> repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder repeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = Input.ofNullable(repeatExtXKey);
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
        public OriginEndpointHlsEncryptionArgs build() {
            return new OriginEndpointHlsEncryptionArgs(constantInitializationVector, encryptionMethod, keyRotationIntervalSeconds, repeatExtXKey, spekeKeyProvider);
        }
    }
}
