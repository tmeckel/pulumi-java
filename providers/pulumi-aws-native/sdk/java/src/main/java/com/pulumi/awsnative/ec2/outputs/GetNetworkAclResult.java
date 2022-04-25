// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.NetworkAclTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkAclResult {
    private final @Nullable String id;
    /**
     * @return The tags to assign to the network ACL.
     * 
     */
    private final @Nullable List<NetworkAclTag> tags;

    @CustomType.Constructor
    private GetNetworkAclResult(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("tags") @Nullable List<NetworkAclTag> tags) {
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The tags to assign to the network ACL.
     * 
     */
    public List<NetworkAclTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<NetworkAclTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkAclResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder tags(@Nullable List<NetworkAclTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(NetworkAclTag... tags) {
            return tags(List.of(tags));
        }        public GetNetworkAclResult build() {
            return new GetNetworkAclResult(id, tags);
        }
    }
}
