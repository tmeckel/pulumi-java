// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.lightsail.inputs.BucketAccessRulesArgs;
import io.pulumi.awsnative.lightsail.inputs.BucketTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    @Import(name="accessRules")
      private final @Nullable Output<BucketAccessRulesArgs> accessRules;

    public Output<BucketAccessRulesArgs> getAccessRules() {
        return this.accessRules == null ? Codegen.empty() : this.accessRules;
    }

    /**
     * The name for the bucket.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    /**
     * The ID of the bundle to use for the bucket.
     * 
     */
    @Import(name="bundleId", required=true)
      private final Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId;
    }

    /**
     * Specifies whether to enable or disable versioning of objects in the bucket.
     * 
     */
    @Import(name="objectVersioning")
      private final @Nullable Output<Boolean> objectVersioning;

    public Output<Boolean> getObjectVersioning() {
        return this.objectVersioning == null ? Codegen.empty() : this.objectVersioning;
    }

    /**
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * 
     */
    @Import(name="readOnlyAccessAccounts")
      private final @Nullable Output<List<String>> readOnlyAccessAccounts;

    public Output<List<String>> getReadOnlyAccessAccounts() {
        return this.readOnlyAccessAccounts == null ? Codegen.empty() : this.readOnlyAccessAccounts;
    }

    /**
     * The names of the Lightsail resources for which to set bucket access.
     * 
     */
    @Import(name="resourcesReceivingAccess")
      private final @Nullable Output<List<String>> resourcesReceivingAccess;

    public Output<List<String>> getResourcesReceivingAccess() {
        return this.resourcesReceivingAccess == null ? Codegen.empty() : this.resourcesReceivingAccess;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<BucketTagArgs>> tags;

    public Output<List<BucketTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public BucketArgs(
        @Nullable Output<BucketAccessRulesArgs> accessRules,
        @Nullable Output<String> bucketName,
        Output<String> bundleId,
        @Nullable Output<Boolean> objectVersioning,
        @Nullable Output<List<String>> readOnlyAccessAccounts,
        @Nullable Output<List<String>> resourcesReceivingAccess,
        @Nullable Output<List<BucketTagArgs>> tags) {
        this.accessRules = accessRules;
        this.bucketName = bucketName;
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
        this.objectVersioning = objectVersioning;
        this.readOnlyAccessAccounts = readOnlyAccessAccounts;
        this.resourcesReceivingAccess = resourcesReceivingAccess;
        this.tags = tags;
    }

    private BucketArgs() {
        this.accessRules = Codegen.empty();
        this.bucketName = Codegen.empty();
        this.bundleId = Codegen.empty();
        this.objectVersioning = Codegen.empty();
        this.readOnlyAccessAccounts = Codegen.empty();
        this.resourcesReceivingAccess = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketAccessRulesArgs> accessRules;
        private @Nullable Output<String> bucketName;
        private Output<String> bundleId;
        private @Nullable Output<Boolean> objectVersioning;
        private @Nullable Output<List<String>> readOnlyAccessAccounts;
        private @Nullable Output<List<String>> resourcesReceivingAccess;
        private @Nullable Output<List<BucketTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRules = defaults.accessRules;
    	      this.bucketName = defaults.bucketName;
    	      this.bundleId = defaults.bundleId;
    	      this.objectVersioning = defaults.objectVersioning;
    	      this.readOnlyAccessAccounts = defaults.readOnlyAccessAccounts;
    	      this.resourcesReceivingAccess = defaults.resourcesReceivingAccess;
    	      this.tags = defaults.tags;
        }

        public Builder accessRules(@Nullable Output<BucketAccessRulesArgs> accessRules) {
            this.accessRules = accessRules;
            return this;
        }
        public Builder accessRules(@Nullable BucketAccessRulesArgs accessRules) {
            this.accessRules = Codegen.ofNullable(accessRules);
            return this;
        }
        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder bundleId(Output<String> bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }
        public Builder bundleId(String bundleId) {
            this.bundleId = Output.of(Objects.requireNonNull(bundleId));
            return this;
        }
        public Builder objectVersioning(@Nullable Output<Boolean> objectVersioning) {
            this.objectVersioning = objectVersioning;
            return this;
        }
        public Builder objectVersioning(@Nullable Boolean objectVersioning) {
            this.objectVersioning = Codegen.ofNullable(objectVersioning);
            return this;
        }
        public Builder readOnlyAccessAccounts(@Nullable Output<List<String>> readOnlyAccessAccounts) {
            this.readOnlyAccessAccounts = readOnlyAccessAccounts;
            return this;
        }
        public Builder readOnlyAccessAccounts(@Nullable List<String> readOnlyAccessAccounts) {
            this.readOnlyAccessAccounts = Codegen.ofNullable(readOnlyAccessAccounts);
            return this;
        }
        public Builder readOnlyAccessAccounts(String... readOnlyAccessAccounts) {
            return readOnlyAccessAccounts(List.of(readOnlyAccessAccounts));
        }
        public Builder resourcesReceivingAccess(@Nullable Output<List<String>> resourcesReceivingAccess) {
            this.resourcesReceivingAccess = resourcesReceivingAccess;
            return this;
        }
        public Builder resourcesReceivingAccess(@Nullable List<String> resourcesReceivingAccess) {
            this.resourcesReceivingAccess = Codegen.ofNullable(resourcesReceivingAccess);
            return this;
        }
        public Builder resourcesReceivingAccess(String... resourcesReceivingAccess) {
            return resourcesReceivingAccess(List.of(resourcesReceivingAccess));
        }
        public Builder tags(@Nullable Output<List<BucketTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<BucketTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(BucketTagArgs... tags) {
            return tags(List.of(tags));
        }        public BucketArgs build() {
            return new BucketArgs(accessRules, bucketName, bundleId, objectVersioning, readOnlyAccessAccounts, resourcesReceivingAccess, tags);
        }
    }
}
