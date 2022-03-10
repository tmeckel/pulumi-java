// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.OrganizationMembershipType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The multi cloud account's organizational data
 * 
 */
public final class SecurityConnectorPropertiesOrganizationalDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConnectorPropertiesOrganizationalDataArgs Empty = new SecurityConnectorPropertiesOrganizationalDataArgs();

    /**
     * If the multi cloud account is of membership type organization, list of accounts excluded from offering
     * 
     */
    @InputImport(name="excludedAccountIds")
      private final @Nullable Input<List<String>> excludedAccountIds;

    public Input<List<String>> getExcludedAccountIds() {
        return this.excludedAccountIds == null ? Input.empty() : this.excludedAccountIds;
    }

    /**
     * The multi cloud account's membership type in the organization
     * 
     */
    @InputImport(name="organizationMembershipType")
      private final @Nullable Input<Either<String,OrganizationMembershipType>> organizationMembershipType;

    public Input<Either<String,OrganizationMembershipType>> getOrganizationMembershipType() {
        return this.organizationMembershipType == null ? Input.empty() : this.organizationMembershipType;
    }

    /**
     * If the multi cloud account is not of membership type organization, this will be the ID of the account's parent
     * 
     */
    @InputImport(name="parentHierarchyId")
      private final @Nullable Input<String> parentHierarchyId;

    public Input<String> getParentHierarchyId() {
        return this.parentHierarchyId == null ? Input.empty() : this.parentHierarchyId;
    }

    /**
     * If the multi cloud account is of membership type organization, this will be the name of the onboarding stackset
     * 
     */
    @InputImport(name="stacksetName")
      private final @Nullable Input<String> stacksetName;

    public Input<String> getStacksetName() {
        return this.stacksetName == null ? Input.empty() : this.stacksetName;
    }

    public SecurityConnectorPropertiesOrganizationalDataArgs(
        @Nullable Input<List<String>> excludedAccountIds,
        @Nullable Input<Either<String,OrganizationMembershipType>> organizationMembershipType,
        @Nullable Input<String> parentHierarchyId,
        @Nullable Input<String> stacksetName) {
        this.excludedAccountIds = excludedAccountIds;
        this.organizationMembershipType = organizationMembershipType;
        this.parentHierarchyId = parentHierarchyId;
        this.stacksetName = stacksetName;
    }

    private SecurityConnectorPropertiesOrganizationalDataArgs() {
        this.excludedAccountIds = Input.empty();
        this.organizationMembershipType = Input.empty();
        this.parentHierarchyId = Input.empty();
        this.stacksetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConnectorPropertiesOrganizationalDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> excludedAccountIds;
        private @Nullable Input<Either<String,OrganizationMembershipType>> organizationMembershipType;
        private @Nullable Input<String> parentHierarchyId;
        private @Nullable Input<String> stacksetName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConnectorPropertiesOrganizationalDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedAccountIds = defaults.excludedAccountIds;
    	      this.organizationMembershipType = defaults.organizationMembershipType;
    	      this.parentHierarchyId = defaults.parentHierarchyId;
    	      this.stacksetName = defaults.stacksetName;
        }

        public Builder excludedAccountIds(@Nullable Input<List<String>> excludedAccountIds) {
            this.excludedAccountIds = excludedAccountIds;
            return this;
        }

        public Builder excludedAccountIds(@Nullable List<String> excludedAccountIds) {
            this.excludedAccountIds = Input.ofNullable(excludedAccountIds);
            return this;
        }

        public Builder organizationMembershipType(@Nullable Input<Either<String,OrganizationMembershipType>> organizationMembershipType) {
            this.organizationMembershipType = organizationMembershipType;
            return this;
        }

        public Builder organizationMembershipType(@Nullable Either<String,OrganizationMembershipType> organizationMembershipType) {
            this.organizationMembershipType = Input.ofNullable(organizationMembershipType);
            return this;
        }

        public Builder parentHierarchyId(@Nullable Input<String> parentHierarchyId) {
            this.parentHierarchyId = parentHierarchyId;
            return this;
        }

        public Builder parentHierarchyId(@Nullable String parentHierarchyId) {
            this.parentHierarchyId = Input.ofNullable(parentHierarchyId);
            return this;
        }

        public Builder stacksetName(@Nullable Input<String> stacksetName) {
            this.stacksetName = stacksetName;
            return this;
        }

        public Builder stacksetName(@Nullable String stacksetName) {
            this.stacksetName = Input.ofNullable(stacksetName);
            return this;
        }
        public SecurityConnectorPropertiesOrganizationalDataArgs build() {
            return new SecurityConnectorPropertiesOrganizationalDataArgs(excludedAccountIds, organizationMembershipType, parentHierarchyId, stacksetName);
        }
    }
}
