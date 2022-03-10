// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @InputImport(name="abort")
      private final @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;

    public Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> getAbort() {
        return this.abort == null ? Input.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="delay")
      private final @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

    public Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs(
        @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort,
        @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs() {
        this.abort = Input.empty();
        this.delay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;
        private @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort) {
            this.abort = abort;
            return this;
        }

        public Builder abort(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs abort) {
            this.abort = Input.ofNullable(abort);
            return this;
        }

        public Builder delay(@Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
            this.delay = delay;
            return this;
        }

        public Builder delay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }
        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs(abort, delay);
        }
    }
}
