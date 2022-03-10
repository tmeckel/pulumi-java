// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationBucketConfigState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationBucketConfigState Empty = new OrganizationBucketConfigState();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @InputImport(name="bucketId")
      private final @Nullable Input<String> bucketId;

    public Input<String> getBucketId() {
        return this.bucketId == null ? Input.empty() : this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @InputImport(name="lifecycleState")
      private final @Nullable Input<String> lifecycleState;

    public Input<String> getLifecycleState() {
        return this.lifecycleState == null ? Input.empty() : this.lifecycleState;
    }

    /**
     * The location of the bucket. The supported locations are: "global" "us-central1"
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the bucket. For example: "organizations/my-organization-id/locations/my-location/buckets/my-bucket-id"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @InputImport(name="organization")
      private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @InputImport(name="retentionDays")
      private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    public OrganizationBucketConfigState(
        @Nullable Input<String> bucketId,
        @Nullable Input<String> description,
        @Nullable Input<String> lifecycleState,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> organization,
        @Nullable Input<Integer> retentionDays) {
        this.bucketId = bucketId;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.location = location;
        this.name = name;
        this.organization = organization;
        this.retentionDays = retentionDays;
    }

    private OrganizationBucketConfigState() {
        this.bucketId = Input.empty();
        this.description = Input.empty();
        this.lifecycleState = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.organization = Input.empty();
        this.retentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationBucketConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> lifecycleState;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> organization;
        private @Nullable Input<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationBucketConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.organization = defaults.organization;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder bucketId(@Nullable Input<String> bucketId) {
            this.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(@Nullable String bucketId) {
            this.bucketId = Input.ofNullable(bucketId);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder lifecycleState(@Nullable Input<String> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        public Builder lifecycleState(@Nullable String lifecycleState) {
            this.lifecycleState = Input.ofNullable(lifecycleState);
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

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder organization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder organization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder retentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }
        public OrganizationBucketConfigState build() {
            return new OrganizationBucketConfigState(bucketId, description, lifecycleState, location, name, organization, retentionDays);
        }
    }
}
