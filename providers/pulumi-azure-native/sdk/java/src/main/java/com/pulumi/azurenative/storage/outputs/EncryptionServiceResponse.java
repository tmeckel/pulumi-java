// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionServiceResponse {
    /**
     * @return A boolean indicating whether or not the service encrypts the data as it is stored.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Encryption key type to be used for the encryption service. &#39;Account&#39; key type implies that an account-scoped encryption key will be used. &#39;Service&#39; key type implies that a default service key is used.
     * 
     */
    private final @Nullable String keyType;
    /**
     * @return Gets a rough estimate of the date/time when the encryption was last enabled by the user. Only returned when encryption is enabled. There might be some unencrypted blobs which were written after this time, as it is just a rough estimate.
     * 
     */
    private final String lastEnabledTime;

    @CustomType.Constructor
    private EncryptionServiceResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("keyType") @Nullable String keyType,
        @CustomType.Parameter("lastEnabledTime") String lastEnabledTime) {
        this.enabled = enabled;
        this.keyType = keyType;
        this.lastEnabledTime = lastEnabledTime;
    }

    /**
     * @return A boolean indicating whether or not the service encrypts the data as it is stored.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Encryption key type to be used for the encryption service. &#39;Account&#39; key type implies that an account-scoped encryption key will be used. &#39;Service&#39; key type implies that a default service key is used.
     * 
     */
    public Optional<String> keyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * @return Gets a rough estimate of the date/time when the encryption was last enabled by the user. Only returned when encryption is enabled. There might be some unencrypted blobs which were written after this time, as it is just a rough estimate.
     * 
     */
    public String lastEnabledTime() {
        return this.lastEnabledTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String keyType;
        private String lastEnabledTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyType = defaults.keyType;
    	      this.lastEnabledTime = defaults.lastEnabledTime;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder keyType(@Nullable String keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder lastEnabledTime(String lastEnabledTime) {
            this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime);
            return this;
        }        public EncryptionServiceResponse build() {
            return new EncryptionServiceResponse(enabled, keyType, lastEnabledTime);
        }
    }
}
