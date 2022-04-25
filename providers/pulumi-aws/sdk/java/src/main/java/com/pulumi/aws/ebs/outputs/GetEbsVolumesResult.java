// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.outputs;

import com.pulumi.aws.ebs.outputs.GetEbsVolumesFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetEbsVolumesResult {
    private final @Nullable List<GetEbsVolumesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A set of all the EBS Volume IDs found. This data source will fail if
     * no volumes match the provided criteria.
     * 
     */
    private final List<String> ids;
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private GetEbsVolumesResult(
        @CustomType.Parameter("filters") @Nullable List<GetEbsVolumesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
    }

    public List<GetEbsVolumesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A set of all the EBS Volume IDs found. This data source will fail if
     * no volumes match the provided criteria.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEbsVolumesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetEbsVolumesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEbsVolumesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetEbsVolumesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetEbsVolumesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetEbsVolumesResult build() {
            return new GetEbsVolumesResult(filters, id, ids, tags);
        }
    }
}
