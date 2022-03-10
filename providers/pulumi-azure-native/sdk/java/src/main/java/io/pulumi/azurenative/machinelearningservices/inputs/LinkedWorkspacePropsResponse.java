// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LinkedWorkspace specific properties.
 * 
 */
public final class LinkedWorkspacePropsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedWorkspacePropsResponse Empty = new LinkedWorkspacePropsResponse();

    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    @InputImport(name="linkedWorkspaceResourceId")
      private final @Nullable String linkedWorkspaceResourceId;

    public Optional<String> getLinkedWorkspaceResourceId() {
        return this.linkedWorkspaceResourceId == null ? Optional.empty() : Optional.ofNullable(this.linkedWorkspaceResourceId);
    }

    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    @InputImport(name="userAssignedIdentityResourceId")
      private final @Nullable String userAssignedIdentityResourceId;

    public Optional<String> getUserAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentityResourceId);
    }

    public LinkedWorkspacePropsResponse(
        @Nullable String linkedWorkspaceResourceId,
        @Nullable String userAssignedIdentityResourceId) {
        this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
    }

    private LinkedWorkspacePropsResponse() {
        this.linkedWorkspaceResourceId = null;
        this.userAssignedIdentityResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedWorkspacePropsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedWorkspaceResourceId;
        private @Nullable String userAssignedIdentityResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedWorkspacePropsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedWorkspaceResourceId = defaults.linkedWorkspaceResourceId;
    	      this.userAssignedIdentityResourceId = defaults.userAssignedIdentityResourceId;
        }

        public Builder linkedWorkspaceResourceId(@Nullable String linkedWorkspaceResourceId) {
            this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
            return this;
        }

        public Builder userAssignedIdentityResourceId(@Nullable String userAssignedIdentityResourceId) {
            this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
            return this;
        }
        public LinkedWorkspacePropsResponse build() {
            return new LinkedWorkspacePropsResponse(linkedWorkspaceResourceId, userAssignedIdentityResourceId);
        }
    }
}
