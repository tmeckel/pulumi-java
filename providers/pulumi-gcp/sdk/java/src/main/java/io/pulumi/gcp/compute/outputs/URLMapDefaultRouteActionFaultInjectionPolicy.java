// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionFaultInjectionPolicyAbort;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionFaultInjectionPolicyDelay;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapDefaultRouteActionFaultInjectionPolicy {
    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbort abort;
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelay delay;

    @OutputCustomType.Constructor
    private URLMapDefaultRouteActionFaultInjectionPolicy(
        @OutputCustomType.Parameter("abort") @Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbort abort,
        @OutputCustomType.Parameter("delay") @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelay delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionFaultInjectionPolicyAbort> getAbort() {
        return Optional.ofNullable(this.abort);
    }
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionFaultInjectionPolicyDelay> getDelay() {
        return Optional.ofNullable(this.delay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbort abort;
        private @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelay delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbort abort) {
            this.abort = abort;
            return this;
        }

        public Builder delay(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelay delay) {
            this.delay = delay;
            return this;
        }
        public URLMapDefaultRouteActionFaultInjectionPolicy build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicy(abort, delay);
        }
    }
}
