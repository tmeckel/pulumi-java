// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateZoneArgs Empty = new PrivateZoneArgs();

    /**
     * The Azure Region where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateZoneName")
      private final @Nullable Output<String> privateZoneName;

    public Output<String> getPrivateZoneName() {
        return this.privateZoneName == null ? Codegen.empty() : this.privateZoneName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
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

    public PrivateZoneArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> privateZoneName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.privateZoneName = privateZoneName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PrivateZoneArgs() {
        this.location = Codegen.empty();
        this.privateZoneName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> privateZoneName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.privateZoneName = defaults.privateZoneName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder privateZoneName(@Nullable Output<String> privateZoneName) {
            this.privateZoneName = privateZoneName;
            return this;
        }
        public Builder privateZoneName(@Nullable String privateZoneName) {
            this.privateZoneName = Codegen.ofNullable(privateZoneName);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PrivateZoneArgs build() {
            return new PrivateZoneArgs(location, privateZoneName, resourceGroupName, tags);
        }
    }
}
