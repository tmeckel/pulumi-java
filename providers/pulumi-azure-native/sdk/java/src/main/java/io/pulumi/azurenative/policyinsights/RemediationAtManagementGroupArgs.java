// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.policyinsights.enums.ResourceDiscoveryMode;
import io.pulumi.azurenative.policyinsights.inputs.RemediationFiltersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationAtManagementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationAtManagementGroupArgs Empty = new RemediationAtManagementGroupArgs();

    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable Input<RemediationFiltersArgs> filters;

    public Input<RemediationFiltersArgs> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    /**
     * Management group ID.
     * 
     */
    @InputImport(name="managementGroupId", required=true)
      private final Input<String> managementGroupId;

    public Input<String> getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The namespace for Microsoft Management RP; only "Microsoft.Management" is allowed.
     * 
     */
    @InputImport(name="managementGroupsNamespace", required=true)
      private final Input<String> managementGroupsNamespace;

    public Input<String> getManagementGroupsNamespace() {
        return this.managementGroupsNamespace;
    }

    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @InputImport(name="policyAssignmentId")
      private final @Nullable Input<String> policyAssignmentId;

    public Input<String> getPolicyAssignmentId() {
        return this.policyAssignmentId == null ? Input.empty() : this.policyAssignmentId;
    }

    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @InputImport(name="policyDefinitionReferenceId")
      private final @Nullable Input<String> policyDefinitionReferenceId;

    public Input<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Input.empty() : this.policyDefinitionReferenceId;
    }

    /**
     * The name of the remediation.
     * 
     */
    @InputImport(name="remediationName")
      private final @Nullable Input<String> remediationName;

    public Input<String> getRemediationName() {
        return this.remediationName == null ? Input.empty() : this.remediationName;
    }

    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @InputImport(name="resourceDiscoveryMode")
      private final @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

    public Input<Either<String,ResourceDiscoveryMode>> getResourceDiscoveryMode() {
        return this.resourceDiscoveryMode == null ? Input.empty() : this.resourceDiscoveryMode;
    }

    public RemediationAtManagementGroupArgs(
        @Nullable Input<RemediationFiltersArgs> filters,
        Input<String> managementGroupId,
        Input<String> managementGroupsNamespace,
        @Nullable Input<String> policyAssignmentId,
        @Nullable Input<String> policyDefinitionReferenceId,
        @Nullable Input<String> remediationName,
        @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
        this.filters = filters;
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace, "expected parameter 'managementGroupsNamespace' to be non-null");
        this.policyAssignmentId = policyAssignmentId;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.remediationName = remediationName;
        this.resourceDiscoveryMode = resourceDiscoveryMode;
    }

    private RemediationAtManagementGroupArgs() {
        this.filters = Input.empty();
        this.managementGroupId = Input.empty();
        this.managementGroupsNamespace = Input.empty();
        this.policyAssignmentId = Input.empty();
        this.policyDefinitionReferenceId = Input.empty();
        this.remediationName = Input.empty();
        this.resourceDiscoveryMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RemediationFiltersArgs> filters;
        private Input<String> managementGroupId;
        private Input<String> managementGroupsNamespace;
        private @Nullable Input<String> policyAssignmentId;
        private @Nullable Input<String> policyDefinitionReferenceId;
        private @Nullable Input<String> remediationName;
        private @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationAtManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.managementGroupsNamespace = defaults.managementGroupsNamespace;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.remediationName = defaults.remediationName;
    	      this.resourceDiscoveryMode = defaults.resourceDiscoveryMode;
        }

        public Builder filters(@Nullable Input<RemediationFiltersArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder filters(@Nullable RemediationFiltersArgs filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }

        public Builder managementGroupId(Input<String> managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            this.managementGroupId = Input.of(Objects.requireNonNull(managementGroupId));
            return this;
        }

        public Builder managementGroupsNamespace(Input<String> managementGroupsNamespace) {
            this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace);
            return this;
        }

        public Builder managementGroupsNamespace(String managementGroupsNamespace) {
            this.managementGroupsNamespace = Input.of(Objects.requireNonNull(managementGroupsNamespace));
            return this;
        }

        public Builder policyAssignmentId(@Nullable Input<String> policyAssignmentId) {
            this.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder policyAssignmentId(@Nullable String policyAssignmentId) {
            this.policyAssignmentId = Input.ofNullable(policyAssignmentId);
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable Input<String> policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Input.ofNullable(policyDefinitionReferenceId);
            return this;
        }

        public Builder remediationName(@Nullable Input<String> remediationName) {
            this.remediationName = remediationName;
            return this;
        }

        public Builder remediationName(@Nullable String remediationName) {
            this.remediationName = Input.ofNullable(remediationName);
            return this;
        }

        public Builder resourceDiscoveryMode(@Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder resourceDiscoveryMode(@Nullable Either<String,ResourceDiscoveryMode> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = Input.ofNullable(resourceDiscoveryMode);
            return this;
        }
        public RemediationAtManagementGroupArgs build() {
            return new RemediationAtManagementGroupArgs(filters, managementGroupId, managementGroupsNamespace, policyAssignmentId, policyDefinitionReferenceId, remediationName, resourceDiscoveryMode);
        }
    }
}
