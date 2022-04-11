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


public final class ApplicationSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSecurityGroupArgs Empty = new ApplicationSecurityGroupArgs();

    /**
     * The name of the application security group.
     * 
     */
    @Import(name="applicationSecurityGroupName")
      private final @Nullable Output<String> applicationSecurityGroupName;

    public Output<String> getApplicationSecurityGroupName() {
        return this.applicationSecurityGroupName == null ? Codegen.empty() : this.applicationSecurityGroupName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
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

    public ApplicationSecurityGroupArgs(
        @Nullable Output<String> applicationSecurityGroupName,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationSecurityGroupName = applicationSecurityGroupName;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ApplicationSecurityGroupArgs() {
        this.applicationSecurityGroupName = Codegen.empty();
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationSecurityGroupName;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSecurityGroupName = defaults.applicationSecurityGroupName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder applicationSecurityGroupName(@Nullable Output<String> applicationSecurityGroupName) {
            this.applicationSecurityGroupName = applicationSecurityGroupName;
            return this;
        }
        public Builder applicationSecurityGroupName(@Nullable String applicationSecurityGroupName) {
            this.applicationSecurityGroupName = Codegen.ofNullable(applicationSecurityGroupName);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ApplicationSecurityGroupArgs build() {
            return new ApplicationSecurityGroupArgs(applicationSecurityGroupName, id, location, resourceGroupName, tags);
        }
    }
}
