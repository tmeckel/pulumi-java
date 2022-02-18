// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.AppDevExperienceFeatureSpecArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.CloudAuditLoggingFeatureSpecArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.MultiClusterIngressFeatureSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CommonFeatureSpec contains Hub-wide configuration information
 * 
 */
public final class CommonFeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommonFeatureSpecArgs Empty = new CommonFeatureSpecArgs();

    /**
     * Appdevexperience specific spec.
     * 
     */
    @InputImport(name="appdevexperience")
    private final @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience;

    public Input<AppDevExperienceFeatureSpecArgs> getAppdevexperience() {
        return this.appdevexperience == null ? Input.empty() : this.appdevexperience;
    }

    /**
     * Cloud Audit Logging-specific spec.
     * 
     */
    @InputImport(name="cloudauditlogging")
    private final @Nullable Input<CloudAuditLoggingFeatureSpecArgs> cloudauditlogging;

    public Input<CloudAuditLoggingFeatureSpecArgs> getCloudauditlogging() {
        return this.cloudauditlogging == null ? Input.empty() : this.cloudauditlogging;
    }

    /**
     * Multicluster Ingress-specific spec.
     * 
     */
    @InputImport(name="multiclusteringress")
    private final @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

    public Input<MultiClusterIngressFeatureSpecArgs> getMulticlusteringress() {
        return this.multiclusteringress == null ? Input.empty() : this.multiclusteringress;
    }

    public CommonFeatureSpecArgs(
        @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience,
        @Nullable Input<CloudAuditLoggingFeatureSpecArgs> cloudauditlogging,
        @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
        this.appdevexperience = appdevexperience;
        this.cloudauditlogging = cloudauditlogging;
        this.multiclusteringress = multiclusteringress;
    }

    private CommonFeatureSpecArgs() {
        this.appdevexperience = Input.empty();
        this.cloudauditlogging = Input.empty();
        this.multiclusteringress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience;
        private @Nullable Input<CloudAuditLoggingFeatureSpecArgs> cloudauditlogging;
        private @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.cloudauditlogging = defaults.cloudauditlogging;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder setAppdevexperience(@Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience) {
            this.appdevexperience = appdevexperience;
            return this;
        }

        public Builder setAppdevexperience(@Nullable AppDevExperienceFeatureSpecArgs appdevexperience) {
            this.appdevexperience = Input.ofNullable(appdevexperience);
            return this;
        }

        public Builder setCloudauditlogging(@Nullable Input<CloudAuditLoggingFeatureSpecArgs> cloudauditlogging) {
            this.cloudauditlogging = cloudauditlogging;
            return this;
        }

        public Builder setCloudauditlogging(@Nullable CloudAuditLoggingFeatureSpecArgs cloudauditlogging) {
            this.cloudauditlogging = Input.ofNullable(cloudauditlogging);
            return this;
        }

        public Builder setMulticlusteringress(@Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }

        public Builder setMulticlusteringress(@Nullable MultiClusterIngressFeatureSpecArgs multiclusteringress) {
            this.multiclusteringress = Input.ofNullable(multiclusteringress);
            return this;
        }

        public CommonFeatureSpecArgs build() {
            return new CommonFeatureSpecArgs(appdevexperience, cloudauditlogging, multiclusteringress);
        }
    }
}
