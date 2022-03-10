// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The last operation on ComputeInstance.
 * 
 */
public final class ComputeInstanceLastOperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceLastOperationResponse Empty = new ComputeInstanceLastOperationResponse();

    /**
     * Name of the last operation.
     * 
     */
    @InputImport(name="operationName")
      private final @Nullable String operationName;

    public Optional<String> getOperationName() {
        return this.operationName == null ? Optional.empty() : Optional.ofNullable(this.operationName);
    }

    /**
     * Operation status.
     * 
     */
    @InputImport(name="operationStatus")
      private final @Nullable String operationStatus;

    public Optional<String> getOperationStatus() {
        return this.operationStatus == null ? Optional.empty() : Optional.ofNullable(this.operationStatus);
    }

    /**
     * Time of the last operation.
     * 
     */
    @InputImport(name="operationTime")
      private final @Nullable String operationTime;

    public Optional<String> getOperationTime() {
        return this.operationTime == null ? Optional.empty() : Optional.ofNullable(this.operationTime);
    }

    public ComputeInstanceLastOperationResponse(
        @Nullable String operationName,
        @Nullable String operationStatus,
        @Nullable String operationTime) {
        this.operationName = operationName;
        this.operationStatus = operationStatus;
        this.operationTime = operationTime;
    }

    private ComputeInstanceLastOperationResponse() {
        this.operationName = null;
        this.operationStatus = null;
        this.operationTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceLastOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operationName;
        private @Nullable String operationStatus;
        private @Nullable String operationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceLastOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationName = defaults.operationName;
    	      this.operationStatus = defaults.operationStatus;
    	      this.operationTime = defaults.operationTime;
        }

        public Builder operationName(@Nullable String operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder operationStatus(@Nullable String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }

        public Builder operationTime(@Nullable String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public ComputeInstanceLastOperationResponse build() {
            return new ComputeInstanceLastOperationResponse(operationName, operationStatus, operationTime);
        }
    }
}
