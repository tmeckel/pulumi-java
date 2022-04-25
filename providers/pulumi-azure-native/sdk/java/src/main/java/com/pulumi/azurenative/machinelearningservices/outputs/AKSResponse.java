// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.AKSResponseProperties;
import com.pulumi.azurenative.machinelearningservices.outputs.MachineLearningServiceErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AKSResponse {
    /**
     * @return Location for the underlying compute
     * 
     */
    private final @Nullable String computeLocation;
    /**
     * @return The type of compute
     * Expected value is &#39;AKS&#39;.
     * 
     */
    private final String computeType;
    /**
     * @return The description of the Machine Learning compute.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    private final Boolean isAttachedCompute;
    /**
     * @return AKS properties
     * 
     */
    private final @Nullable AKSResponseProperties properties;
    /**
     * @return Errors during provisioning
     * 
     */
    private final List<MachineLearningServiceErrorResponse> provisioningErrors;
    /**
     * @return The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * @return ARM resource id of the underlying compute
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private AKSResponse(
        @CustomType.Parameter("computeLocation") @Nullable String computeLocation,
        @CustomType.Parameter("computeType") String computeType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isAttachedCompute") Boolean isAttachedCompute,
        @CustomType.Parameter("properties") @Nullable AKSResponseProperties properties,
        @CustomType.Parameter("provisioningErrors") List<MachineLearningServiceErrorResponse> provisioningErrors,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = computeType;
        this.description = description;
        this.isAttachedCompute = isAttachedCompute;
        this.properties = properties;
        this.provisioningErrors = provisioningErrors;
        this.provisioningState = provisioningState;
        this.resourceId = resourceId;
    }

    /**
     * @return Location for the underlying compute
     * 
     */
    public Optional<String> computeLocation() {
        return Optional.ofNullable(this.computeLocation);
    }
    /**
     * @return The type of compute
     * Expected value is &#39;AKS&#39;.
     * 
     */
    public String computeType() {
        return this.computeType;
    }
    /**
     * @return The description of the Machine Learning compute.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    public Boolean isAttachedCompute() {
        return this.isAttachedCompute;
    }
    /**
     * @return AKS properties
     * 
     */
    public Optional<AKSResponseProperties> properties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * @return Errors during provisioning
     * 
     */
    public List<MachineLearningServiceErrorResponse> provisioningErrors() {
        return this.provisioningErrors;
    }
    /**
     * @return The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return ARM resource id of the underlying compute
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable AKSResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.isAttachedCompute = defaults.isAttachedCompute;
    	      this.properties = defaults.properties;
    	      this.provisioningErrors = defaults.provisioningErrors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isAttachedCompute(Boolean isAttachedCompute) {
            this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
            return this;
        }
        public Builder properties(@Nullable AKSResponseProperties properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
            return this;
        }
        public Builder provisioningErrors(MachineLearningServiceErrorResponse... provisioningErrors) {
            return provisioningErrors(List.of(provisioningErrors));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public AKSResponse build() {
            return new AKSResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
