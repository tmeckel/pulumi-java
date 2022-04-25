// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementBinauthzGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementBinauthzGetArgs Empty = new FeatureMembershipConfigmanagementBinauthzGetArgs();

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private FeatureMembershipConfigmanagementBinauthzGetArgs() {}

    private FeatureMembershipConfigmanagementBinauthzGetArgs(FeatureMembershipConfigmanagementBinauthzGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureMembershipConfigmanagementBinauthzGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureMembershipConfigmanagementBinauthzGetArgs $;

        public Builder() {
            $ = new FeatureMembershipConfigmanagementBinauthzGetArgs();
        }

        public Builder(FeatureMembershipConfigmanagementBinauthzGetArgs defaults) {
            $ = new FeatureMembershipConfigmanagementBinauthzGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public FeatureMembershipConfigmanagementBinauthzGetArgs build() {
            return $;
        }
    }

}
