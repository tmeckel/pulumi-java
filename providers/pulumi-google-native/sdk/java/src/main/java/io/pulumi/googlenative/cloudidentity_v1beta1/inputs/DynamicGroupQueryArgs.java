// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudidentity_v1beta1.enums.DynamicGroupQueryResourceType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a query on a resource.
 * 
 */
public final class DynamicGroupQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicGroupQueryArgs Empty = new DynamicGroupQueryArgs();

    /**
     * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department=='engineering')` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' && loc.building_id=='bar')` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase('jOhn DoE')`
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    @Import(name="resourceType")
      private final @Nullable Output<DynamicGroupQueryResourceType> resourceType;

    public Output<DynamicGroupQueryResourceType> getPropResourceType() {
        return this.resourceType == null ? Codegen.empty() : this.resourceType;
    }

    public DynamicGroupQueryArgs(
        @Nullable Output<String> query,
        @Nullable Output<DynamicGroupQueryResourceType> resourceType) {
        this.query = query;
        this.resourceType = resourceType;
    }

    private DynamicGroupQueryArgs() {
        this.query = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> query;
        private @Nullable Output<DynamicGroupQueryResourceType> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder resourceType(@Nullable Output<DynamicGroupQueryResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable DynamicGroupQueryResourceType resourceType) {
            this.resourceType = Codegen.ofNullable(resourceType);
            return this;
        }        public DynamicGroupQueryArgs build() {
            return new DynamicGroupQueryArgs(query, resourceType);
        }
    }
}
