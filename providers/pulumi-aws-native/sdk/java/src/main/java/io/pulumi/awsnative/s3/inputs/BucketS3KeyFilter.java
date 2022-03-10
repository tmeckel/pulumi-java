// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketFilterRule;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * A container for object key name prefix and suffix filtering rules.
 * 
 */
public final class BucketS3KeyFilter extends io.pulumi.resources.InvokeArgs {

    public static final BucketS3KeyFilter Empty = new BucketS3KeyFilter();

    @InputImport(name="rules", required=true)
      private final List<BucketFilterRule> rules;

    public List<BucketFilterRule> getRules() {
        return this.rules;
    }

    public BucketS3KeyFilter(List<BucketFilterRule> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketS3KeyFilter() {
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketS3KeyFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketFilterRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketS3KeyFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<BucketFilterRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public BucketS3KeyFilter build() {
            return new BucketS3KeyFilter(rules);
        }
    }
}
