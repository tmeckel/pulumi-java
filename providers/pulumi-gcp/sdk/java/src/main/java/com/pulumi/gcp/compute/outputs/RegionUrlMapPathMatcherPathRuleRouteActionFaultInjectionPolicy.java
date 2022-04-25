// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy {
    /**
     * @return The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort abort;
    /**
     * @return The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay delay;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy(
        @CustomType.Parameter("abort") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort abort,
        @CustomType.Parameter("delay") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * @return The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort> abort() {
        return Optional.ofNullable(this.abort);
    }
    /**
     * @return The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay> delay() {
        return Optional.ofNullable(this.delay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort abort;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay delay;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort abort) {
            this.abort = abort;
            return this;
        }
        public Builder delay(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay delay) {
            this.delay = delay;
            return this;
        }        public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy(abort, delay);
        }
    }
}
