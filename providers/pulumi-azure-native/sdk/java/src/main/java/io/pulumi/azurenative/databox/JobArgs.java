// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox;

import io.pulumi.azurenative.databox.enums.JobDeliveryType;
import io.pulumi.azurenative.databox.enums.TransferType;
import io.pulumi.azurenative.databox.inputs.DataBoxDiskJobDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataBoxHeavyJobDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataBoxJobDetailsArgs;
import io.pulumi.azurenative.databox.inputs.JobDeliveryInfoArgs;
import io.pulumi.azurenative.databox.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.databox.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * Delivery Info of Job.
     * 
     */
    @InputImport(name="deliveryInfo")
      private final @Nullable Input<JobDeliveryInfoArgs> deliveryInfo;

    public Input<JobDeliveryInfoArgs> getDeliveryInfo() {
        return this.deliveryInfo == null ? Input.empty() : this.deliveryInfo;
    }

    /**
     * Delivery type of Job.
     * 
     */
    @InputImport(name="deliveryType")
      private final @Nullable Input<Either<String,JobDeliveryType>> deliveryType;

    public Input<Either<String,JobDeliveryType>> getDeliveryType() {
        return this.deliveryType == null ? Input.empty() : this.deliveryType;
    }

    /**
     * Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    @InputImport(name="details")
      private final @Nullable Input<Object> details;

    public Input<Object> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * Msi identity of the resource
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @InputImport(name="jobName")
      private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    /**
     * The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The Resource Group Name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku type.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Type of the data transfer.
     * 
     */
    @InputImport(name="transferType", required=true)
      private final Input<Either<String,TransferType>> transferType;

    public Input<Either<String,TransferType>> getTransferType() {
        return this.transferType;
    }

    public JobArgs(
        @Nullable Input<JobDeliveryInfoArgs> deliveryInfo,
        @Nullable Input<Either<String,JobDeliveryType>> deliveryType,
        @Nullable Input<Object> details,
        @Nullable Input<ResourceIdentityArgs> identity,
        @Nullable Input<String> jobName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        Input<Either<String,TransferType>> transferType) {
        this.deliveryInfo = deliveryInfo;
        this.deliveryType = deliveryType == null ? Input.ofLeft("NonScheduled") : deliveryType;
        this.details = details;
        this.identity = identity;
        this.jobName = jobName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.transferType = Objects.requireNonNull(transferType, "expected parameter 'transferType' to be non-null");
    }

    private JobArgs() {
        this.deliveryInfo = Input.empty();
        this.deliveryType = Input.empty();
        this.details = Input.empty();
        this.identity = Input.empty();
        this.jobName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.transferType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobDeliveryInfoArgs> deliveryInfo;
        private @Nullable Input<Either<String,JobDeliveryType>> deliveryType;
        private @Nullable Input<Object> details;
        private @Nullable Input<ResourceIdentityArgs> identity;
        private @Nullable Input<String> jobName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private Input<Either<String,TransferType>> transferType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.deliveryType = defaults.deliveryType;
    	      this.details = defaults.details;
    	      this.identity = defaults.identity;
    	      this.jobName = defaults.jobName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.transferType = defaults.transferType;
        }

        public Builder deliveryInfo(@Nullable Input<JobDeliveryInfoArgs> deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
            return this;
        }

        public Builder deliveryInfo(@Nullable JobDeliveryInfoArgs deliveryInfo) {
            this.deliveryInfo = Input.ofNullable(deliveryInfo);
            return this;
        }

        public Builder deliveryType(@Nullable Input<Either<String,JobDeliveryType>> deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        public Builder deliveryType(@Nullable Either<String,JobDeliveryType> deliveryType) {
            this.deliveryType = Input.ofNullable(deliveryType);
            return this;
        }

        public Builder details(@Nullable Input<Object> details) {
            this.details = details;
            return this;
        }

        public Builder details(@Nullable Object details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder identity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder jobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder jobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
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

        public Builder sku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
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

        public Builder transferType(Input<Either<String,TransferType>> transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }

        public Builder transferType(Either<String,TransferType> transferType) {
            this.transferType = Input.of(Objects.requireNonNull(transferType));
            return this;
        }
        public JobArgs build() {
            return new JobArgs(deliveryInfo, deliveryType, details, identity, jobName, location, resourceGroupName, sku, tags, transferType);
        }
    }
}
