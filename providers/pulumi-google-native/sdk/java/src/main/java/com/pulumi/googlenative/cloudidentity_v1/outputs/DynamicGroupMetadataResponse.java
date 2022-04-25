// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupQueryResponse;
import com.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupStatusResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DynamicGroupMetadataResponse {
    /**
     * @return Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    private final List<DynamicGroupQueryResponse> queries;
    /**
     * @return Status of the dynamic group.
     * 
     */
    private final DynamicGroupStatusResponse status;

    @CustomType.Constructor
    private DynamicGroupMetadataResponse(
        @CustomType.Parameter("queries") List<DynamicGroupQueryResponse> queries,
        @CustomType.Parameter("status") DynamicGroupStatusResponse status) {
        this.queries = queries;
        this.status = status;
    }

    /**
     * @return Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    public List<DynamicGroupQueryResponse> queries() {
        return this.queries;
    }
    /**
     * @return Status of the dynamic group.
     * 
     */
    public DynamicGroupStatusResponse status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DynamicGroupQueryResponse> queries;
        private DynamicGroupStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
    	      this.status = defaults.status;
        }

        public Builder queries(List<DynamicGroupQueryResponse> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }
        public Builder queries(DynamicGroupQueryResponse... queries) {
            return queries(List.of(queries));
        }
        public Builder status(DynamicGroupStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public DynamicGroupMetadataResponse build() {
            return new DynamicGroupMetadataResponse(queries, status);
        }
    }
}
