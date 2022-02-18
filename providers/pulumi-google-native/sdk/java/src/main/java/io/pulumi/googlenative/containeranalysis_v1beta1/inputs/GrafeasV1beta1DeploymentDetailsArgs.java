// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DeploymentArgs;
import java.util.Objects;


/**
 * Details of a deployment occurrence.
 * 
 */
public final class GrafeasV1beta1DeploymentDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1DeploymentDetailsArgs Empty = new GrafeasV1beta1DeploymentDetailsArgs();

    /**
     * Deployment history for the resource.
     * 
     */
    @InputImport(name="deployment", required=true)
    private final Input<DeploymentArgs> deployment;

    public Input<DeploymentArgs> getDeployment() {
        return this.deployment;
    }

    public GrafeasV1beta1DeploymentDetailsArgs(Input<DeploymentArgs> deployment) {
        this.deployment = Objects.requireNonNull(deployment, "expected parameter 'deployment' to be non-null");
    }

    private GrafeasV1beta1DeploymentDetailsArgs() {
        this.deployment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DeploymentDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DeploymentArgs> deployment;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DeploymentDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployment = defaults.deployment;
        }

        public Builder setDeployment(Input<DeploymentArgs> deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public Builder setDeployment(DeploymentArgs deployment) {
            this.deployment = Input.of(Objects.requireNonNull(deployment));
            return this;
        }

        public GrafeasV1beta1DeploymentDetailsArgs build() {
            return new GrafeasV1beta1DeploymentDetailsArgs(deployment);
        }
    }
}
