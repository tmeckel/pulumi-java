// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncAwsOrganizationsSource;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDataSyncSyncSource extends io.pulumi.resources.InvokeArgs {

    public static final ResourceDataSyncSyncSource Empty = new ResourceDataSyncSyncSource();

    @InputImport(name="awsOrganizationsSource")
      private final @Nullable ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource;

    public Optional<ResourceDataSyncAwsOrganizationsSource> getAwsOrganizationsSource() {
        return this.awsOrganizationsSource == null ? Optional.empty() : Optional.ofNullable(this.awsOrganizationsSource);
    }

    @InputImport(name="includeFutureRegions")
      private final @Nullable Boolean includeFutureRegions;

    public Optional<Boolean> getIncludeFutureRegions() {
        return this.includeFutureRegions == null ? Optional.empty() : Optional.ofNullable(this.includeFutureRegions);
    }

    @InputImport(name="sourceRegions", required=true)
      private final List<String> sourceRegions;

    public List<String> getSourceRegions() {
        return this.sourceRegions;
    }

    @InputImport(name="sourceType", required=true)
      private final String sourceType;

    public String getSourceType() {
        return this.sourceType;
    }

    public ResourceDataSyncSyncSource(
        @Nullable ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource,
        @Nullable Boolean includeFutureRegions,
        List<String> sourceRegions,
        String sourceType) {
        this.awsOrganizationsSource = awsOrganizationsSource;
        this.includeFutureRegions = includeFutureRegions;
        this.sourceRegions = Objects.requireNonNull(sourceRegions, "expected parameter 'sourceRegions' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
    }

    private ResourceDataSyncSyncSource() {
        this.awsOrganizationsSource = null;
        this.includeFutureRegions = null;
        this.sourceRegions = List.of();
        this.sourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncSyncSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource;
        private @Nullable Boolean includeFutureRegions;
        private List<String> sourceRegions;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncSyncSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsOrganizationsSource = defaults.awsOrganizationsSource;
    	      this.includeFutureRegions = defaults.includeFutureRegions;
    	      this.sourceRegions = defaults.sourceRegions;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder awsOrganizationsSource(@Nullable ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource) {
            this.awsOrganizationsSource = awsOrganizationsSource;
            return this;
        }

        public Builder includeFutureRegions(@Nullable Boolean includeFutureRegions) {
            this.includeFutureRegions = includeFutureRegions;
            return this;
        }

        public Builder sourceRegions(List<String> sourceRegions) {
            this.sourceRegions = Objects.requireNonNull(sourceRegions);
            return this;
        }

        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public ResourceDataSyncSyncSource build() {
            return new ResourceDataSyncSyncSource(awsOrganizationsSource, includeFutureRegions, sourceRegions, sourceType);
        }
    }
}
