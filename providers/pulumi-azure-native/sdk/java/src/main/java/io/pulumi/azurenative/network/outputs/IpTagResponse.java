// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IpTagResponse {
    /**
     * The IP tag type. Example: FirstPartyUsage.
     * 
     */
    private final @Nullable String ipTagType;
    /**
     * The value of the IP tag associated with the public IP. Example: SQL.
     * 
     */
    private final @Nullable String tag;

    @OutputCustomType.Constructor
    private IpTagResponse(
        @OutputCustomType.Parameter("ipTagType") @Nullable String ipTagType,
        @OutputCustomType.Parameter("tag") @Nullable String tag) {
        this.ipTagType = ipTagType;
        this.tag = tag;
    }

    /**
     * The IP tag type. Example: FirstPartyUsage.
     * 
    */
    public Optional<String> getIpTagType() {
        return Optional.ofNullable(this.ipTagType);
    }
    /**
     * The value of the IP tag associated with the public IP. Example: SQL.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipTagType;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IpTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipTagType = defaults.ipTagType;
    	      this.tag = defaults.tag;
        }

        public Builder ipTagType(@Nullable String ipTagType) {
            this.ipTagType = ipTagType;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public IpTagResponse build() {
            return new IpTagResponse(ipTagType, tag);
        }
    }
}
