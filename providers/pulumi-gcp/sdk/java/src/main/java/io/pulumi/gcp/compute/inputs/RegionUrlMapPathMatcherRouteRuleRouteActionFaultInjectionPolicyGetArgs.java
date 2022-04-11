// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs();

    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> getAbort() {
        return this.abort == null ? Codegen.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> getDelay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs(
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs() {
        this.abort = Codegen.empty();
        this.delay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs abort) {
            this.abort = Codegen.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs(abort, delay);
        }
    }
}
