// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.outputs;

import com.pulumi.aws.ebs.outputs.GetSnapshotIdsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotIdsResult {
    private final @Nullable List<GetSnapshotIdsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Set of EBS snapshot IDs, sorted by creation time in descending order.
     * 
     */
    private final List<String> ids;
    private final @Nullable List<String> owners;
    private final @Nullable List<String> restorableByUserIds;

    @CustomType.Constructor
    private GetSnapshotIdsResult(
        @CustomType.Parameter("filters") @Nullable List<GetSnapshotIdsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("owners") @Nullable List<String> owners,
        @CustomType.Parameter("restorableByUserIds") @Nullable List<String> restorableByUserIds) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.owners = owners;
        this.restorableByUserIds = restorableByUserIds;
    }

    public List<GetSnapshotIdsFilter> filters() {
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
     * @return Set of EBS snapshot IDs, sorted by creation time in descending order.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public List<String> owners() {
        return this.owners == null ? List.of() : this.owners;
    }
    public List<String> restorableByUserIds() {
        return this.restorableByUserIds == null ? List.of() : this.restorableByUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSnapshotIdsFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable List<String> owners;
        private @Nullable List<String> restorableByUserIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.owners = defaults.owners;
    	      this.restorableByUserIds = defaults.restorableByUserIds;
        }

        public Builder filters(@Nullable List<GetSnapshotIdsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSnapshotIdsFilter... filters) {
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
        public Builder owners(@Nullable List<String> owners) {
            this.owners = owners;
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder restorableByUserIds(@Nullable List<String> restorableByUserIds) {
            this.restorableByUserIds = restorableByUserIds;
            return this;
        }
        public Builder restorableByUserIds(String... restorableByUserIds) {
            return restorableByUserIds(List.of(restorableByUserIds));
        }        public GetSnapshotIdsResult build() {
            return new GetSnapshotIdsResult(filters, id, ids, owners, restorableByUserIds);
        }
    }
}
