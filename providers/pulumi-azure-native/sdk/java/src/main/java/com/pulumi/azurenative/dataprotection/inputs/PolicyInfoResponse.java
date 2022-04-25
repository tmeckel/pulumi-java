// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.PolicyParametersResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Policy Info in backupInstance
 * 
 */
public final class PolicyInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PolicyInfoResponse Empty = new PolicyInfoResponse();

    @Import(name="policyId", required=true)
    private String policyId;

    public String policyId() {
        return this.policyId;
    }

    /**
     * Policy parameters for the backup instance
     * 
     */
    @Import(name="policyParameters")
    private @Nullable PolicyParametersResponse policyParameters;

    /**
     * @return Policy parameters for the backup instance
     * 
     */
    public Optional<PolicyParametersResponse> policyParameters() {
        return Optional.ofNullable(this.policyParameters);
    }

    @Import(name="policyVersion", required=true)
    private String policyVersion;

    public String policyVersion() {
        return this.policyVersion;
    }

    private PolicyInfoResponse() {}

    private PolicyInfoResponse(PolicyInfoResponse $) {
        this.policyId = $.policyId;
        this.policyParameters = $.policyParameters;
        this.policyVersion = $.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyInfoResponse $;

        public Builder() {
            $ = new PolicyInfoResponse();
        }

        public Builder(PolicyInfoResponse defaults) {
            $ = new PolicyInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder policyId(String policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyParameters Policy parameters for the backup instance
         * 
         * @return builder
         * 
         */
        public Builder policyParameters(@Nullable PolicyParametersResponse policyParameters) {
            $.policyParameters = policyParameters;
            return this;
        }

        public Builder policyVersion(String policyVersion) {
            $.policyVersion = policyVersion;
            return this;
        }

        public PolicyInfoResponse build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.policyVersion = Objects.requireNonNull($.policyVersion, "expected parameter 'policyVersion' to be non-null");
            return $;
        }
    }

}
