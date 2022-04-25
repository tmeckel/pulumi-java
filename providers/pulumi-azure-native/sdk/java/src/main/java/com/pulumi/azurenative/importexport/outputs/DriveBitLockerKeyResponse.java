// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DriveBitLockerKeyResponse {
    /**
     * @return BitLocker recovery key or password
     * 
     */
    private final @Nullable String bitLockerKey;
    /**
     * @return Drive ID
     * 
     */
    private final @Nullable String driveId;

    @CustomType.Constructor
    private DriveBitLockerKeyResponse(
        @CustomType.Parameter("bitLockerKey") @Nullable String bitLockerKey,
        @CustomType.Parameter("driveId") @Nullable String driveId) {
        this.bitLockerKey = bitLockerKey;
        this.driveId = driveId;
    }

    /**
     * @return BitLocker recovery key or password
     * 
     */
    public Optional<String> bitLockerKey() {
        return Optional.ofNullable(this.bitLockerKey);
    }
    /**
     * @return Drive ID
     * 
     */
    public Optional<String> driveId() {
        return Optional.ofNullable(this.driveId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriveBitLockerKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitLockerKey;
        private @Nullable String driveId;

        public Builder() {
    	      // Empty
        }

        public Builder(DriveBitLockerKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.driveId = defaults.driveId;
        }

        public Builder bitLockerKey(@Nullable String bitLockerKey) {
            this.bitLockerKey = bitLockerKey;
            return this;
        }
        public Builder driveId(@Nullable String driveId) {
            this.driveId = driveId;
            return this;
        }        public DriveBitLockerKeyResponse build() {
            return new DriveBitLockerKeyResponse(bitLockerKey, driveId);
        }
    }
}
