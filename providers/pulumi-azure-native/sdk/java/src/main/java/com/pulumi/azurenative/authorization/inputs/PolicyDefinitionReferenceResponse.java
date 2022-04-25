// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.azurenative.authorization.inputs.ParameterValuesValueResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy definition reference.
 * 
 */
public final class PolicyDefinitionReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PolicyDefinitionReferenceResponse Empty = new PolicyDefinitionReferenceResponse();

    /**
     * The name of the groups that this policy definition reference belongs to.
     * 
     */
    @Import(name="groupNames")
    private @Nullable List<String> groupNames;

    /**
     * @return The name of the groups that this policy definition reference belongs to.
     * 
     */
    public Optional<List<String>> groupNames() {
        return Optional.ofNullable(this.groupNames);
    }

    /**
     * The parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterValuesValueResponse> parameters;

    /**
     * @return The parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    public Optional<Map<String,ParameterValuesValueResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the policy definition or policy set definition.
     * 
     */
    @Import(name="policyDefinitionId", required=true)
    private String policyDefinitionId;

    /**
     * @return The ID of the policy definition or policy set definition.
     * 
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * A unique id (within the policy set definition) for this policy definition reference.
     * 
     */
    @Import(name="policyDefinitionReferenceId")
    private @Nullable String policyDefinitionReferenceId;

    /**
     * @return A unique id (within the policy set definition) for this policy definition reference.
     * 
     */
    public Optional<String> policyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }

    private PolicyDefinitionReferenceResponse() {}

    private PolicyDefinitionReferenceResponse(PolicyDefinitionReferenceResponse $) {
        this.groupNames = $.groupNames;
        this.parameters = $.parameters;
        this.policyDefinitionId = $.policyDefinitionId;
        this.policyDefinitionReferenceId = $.policyDefinitionReferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDefinitionReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDefinitionReferenceResponse $;

        public Builder() {
            $ = new PolicyDefinitionReferenceResponse();
        }

        public Builder(PolicyDefinitionReferenceResponse defaults) {
            $ = new PolicyDefinitionReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupNames The name of the groups that this policy definition reference belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupNames(@Nullable List<String> groupNames) {
            $.groupNames = groupNames;
            return this;
        }

        /**
         * @param groupNames The name of the groups that this policy definition reference belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupNames(String... groupNames) {
            return groupNames(List.of(groupNames));
        }

        /**
         * @param parameters The parameter values for the referenced policy rule. The keys are the parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,ParameterValuesValueResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param policyDefinitionId The ID of the policy definition or policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(String policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @param policyDefinitionReferenceId A unique id (within the policy set definition) for this policy definition reference.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            $.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public PolicyDefinitionReferenceResponse build() {
            $.policyDefinitionId = Objects.requireNonNull($.policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
            return $;
        }
    }

}
