// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicy {
    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
     */
    private final @Nullable Boolean allowNoResourceGroupMatch;
    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    private final @Nullable String description;
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    private final String id;
    /**
     * Required. Policy mode Possible values: MODE_UNSPECIFIED, VALIDATION, ENFORCEMENT
     * 
     */
    private final String mode;
    /**
     * Required. List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
     */
    private final List<OsPolicyAssignmentOsPolicyResourceGroup> resourceGroups;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicy(
        @OutputCustomType.Parameter("allowNoResourceGroupMatch") @Nullable Boolean allowNoResourceGroupMatch,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("mode") String mode,
        @OutputCustomType.Parameter("resourceGroups") List<OsPolicyAssignmentOsPolicyResourceGroup> resourceGroups) {
        this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
        this.description = description;
        this.id = id;
        this.mode = mode;
        this.resourceGroups = resourceGroups;
    }

    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
    */
    public Optional<Boolean> getAllowNoResourceGroupMatch() {
        return Optional.ofNullable(this.allowNoResourceGroupMatch);
    }
    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Required. Policy mode Possible values: MODE_UNSPECIFIED, VALIDATION, ENFORCEMENT
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * Required. List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
    */
    public List<OsPolicyAssignmentOsPolicyResourceGroup> getResourceGroups() {
        return this.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowNoResourceGroupMatch;
        private @Nullable String description;
        private String id;
        private String mode;
        private List<OsPolicyAssignmentOsPolicyResourceGroup> resourceGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNoResourceGroupMatch = defaults.allowNoResourceGroupMatch;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        public Builder allowNoResourceGroupMatch(@Nullable Boolean allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder resourceGroups(List<OsPolicyAssignmentOsPolicyResourceGroup> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }
        public OsPolicyAssignmentOsPolicy build() {
            return new OsPolicyAssignmentOsPolicy(allowNoResourceGroupMatch, description, id, mode, resourceGroups);
        }
    }
}
