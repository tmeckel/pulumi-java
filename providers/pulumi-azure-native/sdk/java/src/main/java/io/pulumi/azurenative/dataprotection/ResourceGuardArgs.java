// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.dataprotection.inputs.DppIdentityDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceGuardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceGuardArgs Empty = new ResourceGuardArgs();

    /**
     * Optional ETag.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Input Managed Identity Details
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<DppIdentityDetailsArgs> identity;

    public Output<DppIdentityDetailsArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of ResourceGuard
     * 
     */
    @Import(name="resourceGuardsName")
      private final @Nullable Output<String> resourceGuardsName;

    public Output<String> getResourceGuardsName() {
        return this.resourceGuardsName == null ? Codegen.empty() : this.resourceGuardsName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ResourceGuardArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<DppIdentityDetailsArgs> identity,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceGuardsName,
        @Nullable Output<Map<String,String>> tags) {
        this.eTag = eTag;
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceGuardsName = resourceGuardsName;
        this.tags = tags;
    }

    private ResourceGuardArgs() {
        this.eTag = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceGuardsName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<DppIdentityDetailsArgs> identity;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceGuardsName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuardsName = defaults.resourceGuardsName;
    	      this.tags = defaults.tags;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder identity(@Nullable Output<DppIdentityDetailsArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable DppIdentityDetailsArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceGuardsName(@Nullable Output<String> resourceGuardsName) {
            this.resourceGuardsName = resourceGuardsName;
            return this;
        }
        public Builder resourceGuardsName(@Nullable String resourceGuardsName) {
            this.resourceGuardsName = Codegen.ofNullable(resourceGuardsName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ResourceGuardArgs build() {
            return new ResourceGuardArgs(eTag, identity, location, resourceGroupName, resourceGuardsName, tags);
        }
    }
}
