// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResponsePolicyRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResponsePolicyRuleArgs Empty = new GetResponsePolicyRuleArgs();

    @InputImport(name="clientOperationId")
    private final @Nullable String clientOperationId;

    public Optional<String> getClientOperationId() {
        return this.clientOperationId == null ? Optional.empty() : Optional.ofNullable(this.clientOperationId);
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="responsePolicy", required=true)
    private final String responsePolicy;

    public String getResponsePolicy() {
        return this.responsePolicy;
    }

    @InputImport(name="responsePolicyRule", required=true)
    private final String responsePolicyRule;

    public String getResponsePolicyRule() {
        return this.responsePolicyRule;
    }

    public GetResponsePolicyRuleArgs(
        @Nullable String clientOperationId,
        @Nullable String project,
        String responsePolicy,
        String responsePolicyRule) {
        this.clientOperationId = clientOperationId;
        this.project = project;
        this.responsePolicy = Objects.requireNonNull(responsePolicy, "expected parameter 'responsePolicy' to be non-null");
        this.responsePolicyRule = Objects.requireNonNull(responsePolicyRule, "expected parameter 'responsePolicyRule' to be non-null");
    }

    private GetResponsePolicyRuleArgs() {
        this.clientOperationId = null;
        this.project = null;
        this.responsePolicy = null;
        this.responsePolicyRule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientOperationId;
        private @Nullable String project;
        private String responsePolicy;
        private String responsePolicyRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponsePolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.project = defaults.project;
    	      this.responsePolicy = defaults.responsePolicy;
    	      this.responsePolicyRule = defaults.responsePolicyRule;
        }

        public Builder setClientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setResponsePolicy(String responsePolicy) {
            this.responsePolicy = Objects.requireNonNull(responsePolicy);
            return this;
        }

        public Builder setResponsePolicyRule(String responsePolicyRule) {
            this.responsePolicyRule = Objects.requireNonNull(responsePolicyRule);
            return this;
        }

        public GetResponsePolicyRuleArgs build() {
            return new GetResponsePolicyRuleArgs(clientOperationId, project, responsePolicy, responsePolicyRule);
        }
    }
}
