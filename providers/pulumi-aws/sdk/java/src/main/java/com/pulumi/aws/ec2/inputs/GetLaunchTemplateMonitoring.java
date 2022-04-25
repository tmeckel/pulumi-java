// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetLaunchTemplateMonitoring extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateMonitoring Empty = new GetLaunchTemplateMonitoring();

    /**
     * Whether Nitro Enclaves are enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether Nitro Enclaves are enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private GetLaunchTemplateMonitoring() {}

    private GetLaunchTemplateMonitoring(GetLaunchTemplateMonitoring $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchTemplateMonitoring defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchTemplateMonitoring $;

        public Builder() {
            $ = new GetLaunchTemplateMonitoring();
        }

        public Builder(GetLaunchTemplateMonitoring defaults) {
            $ = new GetLaunchTemplateMonitoring(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Nitro Enclaves are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public GetLaunchTemplateMonitoring build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
