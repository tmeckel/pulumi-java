// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse;
import java.util.Objects;


public final class InstanceGroupManagerInstanceLifecyclePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerInstanceLifecyclePolicyResponse Empty = new InstanceGroupManagerInstanceLifecyclePolicyResponse();

    /**
     * The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
     * 
     */
    @InputImport(name="metadataBasedReadinessSignal", required=true)
    private final InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse metadataBasedReadinessSignal;

    public InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse getMetadataBasedReadinessSignal() {
        return this.metadataBasedReadinessSignal;
    }

    public InstanceGroupManagerInstanceLifecyclePolicyResponse(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse metadataBasedReadinessSignal) {
        this.metadataBasedReadinessSignal = Objects.requireNonNull(metadataBasedReadinessSignal, "expected parameter 'metadataBasedReadinessSignal' to be non-null");
    }

    private InstanceGroupManagerInstanceLifecyclePolicyResponse() {
        this.metadataBasedReadinessSignal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse metadataBasedReadinessSignal;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataBasedReadinessSignal = defaults.metadataBasedReadinessSignal;
        }

        public Builder setMetadataBasedReadinessSignal(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse metadataBasedReadinessSignal) {
            this.metadataBasedReadinessSignal = Objects.requireNonNull(metadataBasedReadinessSignal);
            return this;
        }

        public InstanceGroupManagerInstanceLifecyclePolicyResponse build() {
            return new InstanceGroupManagerInstanceLifecyclePolicyResponse(metadataBasedReadinessSignal);
        }
    }
}
