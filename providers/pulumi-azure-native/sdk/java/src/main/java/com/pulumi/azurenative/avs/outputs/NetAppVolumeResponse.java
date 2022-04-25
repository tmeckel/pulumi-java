// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetAppVolumeResponse {
    /**
     * @return File path through which the NFS volume is exposed by the provider
     * 
     */
    private final @Nullable String nfsFilePath;
    /**
     * @return IP address of the NFS provider
     * 
     */
    private final @Nullable String nfsProviderIp;

    @CustomType.Constructor
    private NetAppVolumeResponse(
        @CustomType.Parameter("nfsFilePath") @Nullable String nfsFilePath,
        @CustomType.Parameter("nfsProviderIp") @Nullable String nfsProviderIp) {
        this.nfsFilePath = nfsFilePath;
        this.nfsProviderIp = nfsProviderIp;
    }

    /**
     * @return File path through which the NFS volume is exposed by the provider
     * 
     */
    public Optional<String> nfsFilePath() {
        return Optional.ofNullable(this.nfsFilePath);
    }
    /**
     * @return IP address of the NFS provider
     * 
     */
    public Optional<String> nfsProviderIp() {
        return Optional.ofNullable(this.nfsProviderIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetAppVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nfsFilePath;
        private @Nullable String nfsProviderIp;

        public Builder() {
    	      // Empty
        }

        public Builder(NetAppVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nfsFilePath = defaults.nfsFilePath;
    	      this.nfsProviderIp = defaults.nfsProviderIp;
        }

        public Builder nfsFilePath(@Nullable String nfsFilePath) {
            this.nfsFilePath = nfsFilePath;
            return this;
        }
        public Builder nfsProviderIp(@Nullable String nfsProviderIp) {
            this.nfsProviderIp = nfsProviderIp;
            return this;
        }        public NetAppVolumeResponse build() {
            return new NetAppVolumeResponse(nfsFilePath, nfsProviderIp);
        }
    }
}
