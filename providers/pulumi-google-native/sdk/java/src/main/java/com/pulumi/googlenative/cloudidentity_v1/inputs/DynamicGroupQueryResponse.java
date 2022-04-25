// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a query on a resource.
 * 
 */
public final class DynamicGroupQueryResponse extends com.pulumi.resources.InvokeArgs {

    public static final DynamicGroupQueryResponse Empty = new DynamicGroupQueryResponse();

    /**
     * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    @Import(name="query", required=true)
    private String query;

    /**
     * @return Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    public String query() {
        return this.query;
    }

    /**
     * Resource type for the Dynamic Group Query
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Resource type for the Dynamic Group Query
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private DynamicGroupQueryResponse() {}

    private DynamicGroupQueryResponse(DynamicGroupQueryResponse $) {
        this.query = $.query;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicGroupQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicGroupQueryResponse $;

        public Builder() {
            $ = new DynamicGroupQueryResponse();
        }

        public Builder(DynamicGroupQueryResponse defaults) {
            $ = new DynamicGroupQueryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            $.query = query;
            return this;
        }

        /**
         * @param resourceType Resource type for the Dynamic Group Query
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public DynamicGroupQueryResponse build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
