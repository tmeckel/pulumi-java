// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketReplicationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationGetArgs Empty = new BucketReplicationConfigurationGetArgs();

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Specifies the rules managing the replication (documented below).
     * 
     */
    @Import(name="rules", required=true)
      private final Output<List<BucketReplicationConfigurationRuleGetArgs>> rules;

    public Output<List<BucketReplicationConfigurationRuleGetArgs>> getRules() {
        return this.rules;
    }

    public BucketReplicationConfigurationGetArgs(
        Output<String> role,
        Output<List<BucketReplicationConfigurationRuleGetArgs>> rules) {
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketReplicationConfigurationGetArgs() {
        this.role = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> role;
        private Output<List<BucketReplicationConfigurationRuleGetArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder rules(Output<List<BucketReplicationConfigurationRuleGetArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<BucketReplicationConfigurationRuleGetArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(BucketReplicationConfigurationRuleGetArgs... rules) {
            return rules(List.of(rules));
        }        public BucketReplicationConfigurationGetArgs build() {
            return new BucketReplicationConfigurationGetArgs(role, rules);
        }
    }
}
