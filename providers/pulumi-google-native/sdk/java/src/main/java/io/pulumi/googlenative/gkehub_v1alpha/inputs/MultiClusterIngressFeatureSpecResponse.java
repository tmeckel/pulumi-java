// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
 * 
 */
public final class MultiClusterIngressFeatureSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultiClusterIngressFeatureSpecResponse Empty = new MultiClusterIngressFeatureSpecResponse();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @InputImport(name="configMembership", required=true)
      private final String configMembership;

    public String getConfigMembership() {
        return this.configMembership;
    }

    public MultiClusterIngressFeatureSpecResponse(String configMembership) {
        this.configMembership = Objects.requireNonNull(configMembership, "expected parameter 'configMembership' to be non-null");
    }

    private MultiClusterIngressFeatureSpecResponse() {
        this.configMembership = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterIngressFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterIngressFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMembership = defaults.configMembership;
        }

        public Builder configMembership(String configMembership) {
            this.configMembership = Objects.requireNonNull(configMembership);
            return this;
        }
        public MultiClusterIngressFeatureSpecResponse build() {
            return new MultiClusterIngressFeatureSpecResponse(configMembership);
        }
    }
}
