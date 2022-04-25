// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Display Device options
 * 
 */
public final class DisplayDeviceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DisplayDeviceResponse Empty = new DisplayDeviceResponse();

    /**
     * Defines whether the instance has Display enabled.
     * 
     */
    @Import(name="enableDisplay", required=true)
    private Boolean enableDisplay;

    /**
     * @return Defines whether the instance has Display enabled.
     * 
     */
    public Boolean enableDisplay() {
        return this.enableDisplay;
    }

    private DisplayDeviceResponse() {}

    private DisplayDeviceResponse(DisplayDeviceResponse $) {
        this.enableDisplay = $.enableDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DisplayDeviceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DisplayDeviceResponse $;

        public Builder() {
            $ = new DisplayDeviceResponse();
        }

        public Builder(DisplayDeviceResponse defaults) {
            $ = new DisplayDeviceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDisplay Defines whether the instance has Display enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableDisplay(Boolean enableDisplay) {
            $.enableDisplay = enableDisplay;
            return this;
        }

        public DisplayDeviceResponse build() {
            $.enableDisplay = Objects.requireNonNull($.enableDisplay, "expected parameter 'enableDisplay' to be non-null");
            return $;
        }
    }

}
