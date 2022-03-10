// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketCorsRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketCorsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsConfigurationArgs Empty = new BucketCorsConfigurationArgs();

    @InputImport(name="corsRules", required=true)
      private final Input<List<BucketCorsRuleArgs>> corsRules;

    public Input<List<BucketCorsRuleArgs>> getCorsRules() {
        return this.corsRules;
    }

    public BucketCorsConfigurationArgs(Input<List<BucketCorsRuleArgs>> corsRules) {
        this.corsRules = Objects.requireNonNull(corsRules, "expected parameter 'corsRules' to be non-null");
    }

    private BucketCorsConfigurationArgs() {
        this.corsRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<BucketCorsRuleArgs>> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder corsRules(Input<List<BucketCorsRuleArgs>> corsRules) {
            this.corsRules = Objects.requireNonNull(corsRules);
            return this;
        }

        public Builder corsRules(List<BucketCorsRuleArgs> corsRules) {
            this.corsRules = Input.of(Objects.requireNonNull(corsRules));
            return this;
        }
        public BucketCorsConfigurationArgs build() {
            return new BucketCorsConfigurationArgs(corsRules);
        }
    }
}
