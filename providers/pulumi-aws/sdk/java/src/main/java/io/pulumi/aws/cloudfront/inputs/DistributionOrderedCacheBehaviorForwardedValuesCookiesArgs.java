// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs();

    /**
     * Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    @Import(name="forward", required=true)
      private final Output<String> forward;

    public Output<String> getForward() {
        return this.forward;
    }

    /**
     * If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    @Import(name="whitelistedNames")
      private final @Nullable Output<List<String>> whitelistedNames;

    public Output<List<String>> getWhitelistedNames() {
        return this.whitelistedNames == null ? Codegen.empty() : this.whitelistedNames;
    }

    public DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs(
        Output<String> forward,
        @Nullable Output<List<String>> whitelistedNames) {
        this.forward = Objects.requireNonNull(forward, "expected parameter 'forward' to be non-null");
        this.whitelistedNames = whitelistedNames;
    }

    private DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs() {
        this.forward = Codegen.empty();
        this.whitelistedNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> forward;
        private @Nullable Output<List<String>> whitelistedNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forward = defaults.forward;
    	      this.whitelistedNames = defaults.whitelistedNames;
        }

        public Builder forward(Output<String> forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }
        public Builder forward(String forward) {
            this.forward = Output.of(Objects.requireNonNull(forward));
            return this;
        }
        public Builder whitelistedNames(@Nullable Output<List<String>> whitelistedNames) {
            this.whitelistedNames = whitelistedNames;
            return this;
        }
        public Builder whitelistedNames(@Nullable List<String> whitelistedNames) {
            this.whitelistedNames = Codegen.ofNullable(whitelistedNames);
            return this;
        }
        public Builder whitelistedNames(String... whitelistedNames) {
            return whitelistedNames(List.of(whitelistedNames));
        }        public DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs build() {
            return new DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs(forward, whitelistedNames);
        }
    }
}
