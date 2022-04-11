// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FeatureSpecMulticlusteringressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureSpecMulticlusteringressGetArgs Empty = new FeatureSpecMulticlusteringressGetArgs();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @Import(name="configMembership", required=true)
      private final Output<String> configMembership;

    public Output<String> getConfigMembership() {
        return this.configMembership;
    }

    public FeatureSpecMulticlusteringressGetArgs(Output<String> configMembership) {
        this.configMembership = Objects.requireNonNull(configMembership, "expected parameter 'configMembership' to be non-null");
    }

    private FeatureSpecMulticlusteringressGetArgs() {
        this.configMembership = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSpecMulticlusteringressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSpecMulticlusteringressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMembership = defaults.configMembership;
        }

        public Builder configMembership(Output<String> configMembership) {
            this.configMembership = Objects.requireNonNull(configMembership);
            return this;
        }
        public Builder configMembership(String configMembership) {
            this.configMembership = Output.of(Objects.requireNonNull(configMembership));
            return this;
        }        public FeatureSpecMulticlusteringressGetArgs build() {
            return new FeatureSpecMulticlusteringressGetArgs(configMembership);
        }
    }
}
