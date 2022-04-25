// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data type for indicators connection.
 * 
 */
public final class TIDataConnectorDataTypesResponseIndicators extends com.pulumi.resources.InvokeArgs {

    public static final TIDataConnectorDataTypesResponseIndicators Empty = new TIDataConnectorDataTypesResponseIndicators();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Describe whether this data type connection is enabled or not.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private TIDataConnectorDataTypesResponseIndicators() {}

    private TIDataConnectorDataTypesResponseIndicators(TIDataConnectorDataTypesResponseIndicators $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TIDataConnectorDataTypesResponseIndicators defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TIDataConnectorDataTypesResponseIndicators $;

        public Builder() {
            $ = new TIDataConnectorDataTypesResponseIndicators();
        }

        public Builder(TIDataConnectorDataTypesResponseIndicators defaults) {
            $ = new TIDataConnectorDataTypesResponseIndicators(Objects.requireNonNull(defaults));
        }

        /**
         * @param state Describe whether this data type connection is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public TIDataConnectorDataTypesResponseIndicators build() {
            return $;
        }
    }

}
