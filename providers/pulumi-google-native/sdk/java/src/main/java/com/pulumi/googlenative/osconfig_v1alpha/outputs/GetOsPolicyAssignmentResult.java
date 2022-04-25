// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyAssignmentInstanceFilterResponse;
import com.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyAssignmentRolloutResponse;
import com.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOsPolicyAssignmentResult {
    /**
     * @return Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
     */
    private final Boolean baseline;
    /**
     * @return Indicates that this revision deletes the OS policy assignment.
     * 
     */
    private final Boolean deleted;
    /**
     * @return OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    private final String description;
    /**
     * @return The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    private final String etag;
    /**
     * @return Filter to select VMs.
     * 
     */
    private final OSPolicyAssignmentInstanceFilterResponse instanceFilter;
    /**
     * @return Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    private final String name;
    /**
     * @return List of OS policies to be applied to the VMs.
     * 
     */
    private final List<OSPolicyResponse> osPolicies;
    /**
     * @return Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    private final Boolean reconciling;
    /**
     * @return The timestamp that the revision was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * @return The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    private final String revisionId;
    /**
     * @return Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    private final OSPolicyAssignmentRolloutResponse rollout;
    /**
     * @return OS policy assignment rollout state
     * 
     */
    private final String rolloutState;
    /**
     * @return Server generated unique id for the OS policy assignment resource.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private GetOsPolicyAssignmentResult(
        @CustomType.Parameter("baseline") Boolean baseline,
        @CustomType.Parameter("deleted") Boolean deleted,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("instanceFilter") OSPolicyAssignmentInstanceFilterResponse instanceFilter,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osPolicies") List<OSPolicyResponse> osPolicies,
        @CustomType.Parameter("reconciling") Boolean reconciling,
        @CustomType.Parameter("revisionCreateTime") String revisionCreateTime,
        @CustomType.Parameter("revisionId") String revisionId,
        @CustomType.Parameter("rollout") OSPolicyAssignmentRolloutResponse rollout,
        @CustomType.Parameter("rolloutState") String rolloutState,
        @CustomType.Parameter("uid") String uid) {
        this.baseline = baseline;
        this.deleted = deleted;
        this.description = description;
        this.etag = etag;
        this.instanceFilter = instanceFilter;
        this.name = name;
        this.osPolicies = osPolicies;
        this.reconciling = reconciling;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.rollout = rollout;
        this.rolloutState = rolloutState;
        this.uid = uid;
    }

    /**
     * @return Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
     */
    public Boolean baseline() {
        return this.baseline;
    }
    /**
     * @return Indicates that this revision deletes the OS policy assignment.
     * 
     */
    public Boolean deleted() {
        return this.deleted;
    }
    /**
     * @return OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Filter to select VMs.
     * 
     */
    public OSPolicyAssignmentInstanceFilterResponse instanceFilter() {
        return this.instanceFilter;
    }
    /**
     * @return Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of OS policies to be applied to the VMs.
     * 
     */
    public List<OSPolicyResponse> osPolicies() {
        return this.osPolicies;
    }
    /**
     * @return Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    public Boolean reconciling() {
        return this.reconciling;
    }
    /**
     * @return The timestamp that the revision was created.
     * 
     */
    public String revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * @return The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }
    /**
     * @return Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    public OSPolicyAssignmentRolloutResponse rollout() {
        return this.rollout;
    }
    /**
     * @return OS policy assignment rollout state
     * 
     */
    public String rolloutState() {
        return this.rolloutState;
    }
    /**
     * @return Server generated unique id for the OS policy assignment resource.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOsPolicyAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean baseline;
        private Boolean deleted;
        private String description;
        private String etag;
        private OSPolicyAssignmentInstanceFilterResponse instanceFilter;
        private String name;
        private List<OSPolicyResponse> osPolicies;
        private Boolean reconciling;
        private String revisionCreateTime;
        private String revisionId;
        private OSPolicyAssignmentRolloutResponse rollout;
        private String rolloutState;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOsPolicyAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseline = defaults.baseline;
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.name = defaults.name;
    	      this.osPolicies = defaults.osPolicies;
    	      this.reconciling = defaults.reconciling;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.rollout = defaults.rollout;
    	      this.rolloutState = defaults.rolloutState;
    	      this.uid = defaults.uid;
        }

        public Builder baseline(Boolean baseline) {
            this.baseline = Objects.requireNonNull(baseline);
            return this;
        }
        public Builder deleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder instanceFilter(OSPolicyAssignmentInstanceFilterResponse instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osPolicies(List<OSPolicyResponse> osPolicies) {
            this.osPolicies = Objects.requireNonNull(osPolicies);
            return this;
        }
        public Builder osPolicies(OSPolicyResponse... osPolicies) {
            return osPolicies(List.of(osPolicies));
        }
        public Builder reconciling(Boolean reconciling) {
            this.reconciling = Objects.requireNonNull(reconciling);
            return this;
        }
        public Builder revisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder rollout(OSPolicyAssignmentRolloutResponse rollout) {
            this.rollout = Objects.requireNonNull(rollout);
            return this;
        }
        public Builder rolloutState(String rolloutState) {
            this.rolloutState = Objects.requireNonNull(rolloutState);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public GetOsPolicyAssignmentResult build() {
            return new GetOsPolicyAssignmentResult(baseline, deleted, description, etag, instanceFilter, name, osPolicies, reconciling, revisionCreateTime, revisionId, rollout, rolloutState, uid);
        }
    }
}
