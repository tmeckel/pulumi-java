// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionClusterIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionClusterIamPolicyArgs Empty = new GetRegionClusterIamPolicyArgs();

    @InputImport(name="clusterId", required=true)
    private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="regionId", required=true)
    private final String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public GetRegionClusterIamPolicyArgs(
        String clusterId,
        @Nullable String project,
        String regionId) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.project = project;
        this.regionId = Objects.requireNonNull(regionId, "expected parameter 'regionId' to be non-null");
    }

    private GetRegionClusterIamPolicyArgs() {
        this.clusterId = null;
        this.project = null;
        this.regionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionClusterIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private @Nullable String project;
        private String regionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionClusterIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.project = defaults.project;
    	      this.regionId = defaults.regionId;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }

        public GetRegionClusterIamPolicyArgs build() {
            return new GetRegionClusterIamPolicyArgs(clusterId, project, regionId);
        }
    }
}
