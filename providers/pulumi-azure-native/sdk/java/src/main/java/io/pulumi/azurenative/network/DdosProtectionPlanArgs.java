// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DdosProtectionPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final DdosProtectionPlanArgs Empty = new DdosProtectionPlanArgs();

    /**
     * The name of the DDoS protection plan.
     * 
     */
    @InputImport(name="ddosProtectionPlanName")
      private final @Nullable Input<String> ddosProtectionPlanName;

    public Input<String> getDdosProtectionPlanName() {
        return this.ddosProtectionPlanName == null ? Input.empty() : this.ddosProtectionPlanName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DdosProtectionPlanArgs(
        @Nullable Input<String> ddosProtectionPlanName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.ddosProtectionPlanName = ddosProtectionPlanName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DdosProtectionPlanArgs() {
        this.ddosProtectionPlanName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DdosProtectionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ddosProtectionPlanName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DdosProtectionPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosProtectionPlanName = defaults.ddosProtectionPlanName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder ddosProtectionPlanName(@Nullable Input<String> ddosProtectionPlanName) {
            this.ddosProtectionPlanName = ddosProtectionPlanName;
            return this;
        }

        public Builder ddosProtectionPlanName(@Nullable String ddosProtectionPlanName) {
            this.ddosProtectionPlanName = Input.ofNullable(ddosProtectionPlanName);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DdosProtectionPlanArgs build() {
            return new DdosProtectionPlanArgs(ddosProtectionPlanName, location, resourceGroupName, tags);
        }
    }
}
