// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalForwardingRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalForwardingRuleArgs Empty = new GetGlobalForwardingRuleArgs();

    @InputImport(name="forwardingRule", required=true)
    private final String forwardingRule;

    public String getForwardingRule() {
        return this.forwardingRule;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGlobalForwardingRuleArgs(
        String forwardingRule,
        @Nullable String project) {
        this.forwardingRule = Objects.requireNonNull(forwardingRule, "expected parameter 'forwardingRule' to be non-null");
        this.project = project;
    }

    private GetGlobalForwardingRuleArgs() {
        this.forwardingRule = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forwardingRule;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingRule = defaults.forwardingRule;
    	      this.project = defaults.project;
        }

        public Builder setForwardingRule(String forwardingRule) {
            this.forwardingRule = Objects.requireNonNull(forwardingRule);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetGlobalForwardingRuleArgs build() {
            return new GetGlobalForwardingRuleArgs(forwardingRule, project);
        }
    }
}
