// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DiscoveredArgs;
import java.util.Objects;


/**
 * Details of a discovery occurrence.
 * 
 */
public final class GrafeasV1beta1DiscoveryDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1DiscoveryDetailsArgs Empty = new GrafeasV1beta1DiscoveryDetailsArgs();

    /**
     * Analysis status for the discovered resource.
     * 
     */
    @InputImport(name="discovered", required=true)
    private final Input<DiscoveredArgs> discovered;

    public Input<DiscoveredArgs> getDiscovered() {
        return this.discovered;
    }

    public GrafeasV1beta1DiscoveryDetailsArgs(Input<DiscoveredArgs> discovered) {
        this.discovered = Objects.requireNonNull(discovered, "expected parameter 'discovered' to be non-null");
    }

    private GrafeasV1beta1DiscoveryDetailsArgs() {
        this.discovered = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DiscoveryDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DiscoveredArgs> discovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DiscoveryDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discovered = defaults.discovered;
        }

        public Builder setDiscovered(Input<DiscoveredArgs> discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }

        public Builder setDiscovered(DiscoveredArgs discovered) {
            this.discovered = Input.of(Objects.requireNonNull(discovered));
            return this;
        }

        public GrafeasV1beta1DiscoveryDetailsArgs build() {
            return new GrafeasV1beta1DiscoveryDetailsArgs(discovered);
        }
    }
}
