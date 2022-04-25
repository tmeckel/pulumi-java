// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the PodSecurityPolicy feature.
 * 
 */
public final class PodSecurityPolicyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyConfigArgs Empty = new PodSecurityPolicyConfigArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster. If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable the PodSecurityPolicy controller for this cluster. If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private PodSecurityPolicyConfigArgs() {}

    private PodSecurityPolicyConfigArgs(PodSecurityPolicyConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyConfigArgs $;

        public Builder() {
            $ = new PodSecurityPolicyConfigArgs();
        }

        public Builder(PodSecurityPolicyConfigArgs defaults) {
            $ = new PodSecurityPolicyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster. If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster. If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public PodSecurityPolicyConfigArgs build() {
            return $;
        }
    }

}
