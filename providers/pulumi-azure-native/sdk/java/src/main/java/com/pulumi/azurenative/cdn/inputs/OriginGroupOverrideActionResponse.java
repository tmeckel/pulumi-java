// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the origin group override action for the delivery rule.
 * 
 */
public final class OriginGroupOverrideActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final OriginGroupOverrideActionResponse Empty = new OriginGroupOverrideActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is &#39;OriginGroupOverride&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;OriginGroupOverride&#39;.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
    private OriginGroupOverrideActionParametersResponse parameters;

    /**
     * @return Defines the parameters for the action.
     * 
     */
    public OriginGroupOverrideActionParametersResponse parameters() {
        return this.parameters;
    }

    private OriginGroupOverrideActionResponse() {}

    private OriginGroupOverrideActionResponse(OriginGroupOverrideActionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginGroupOverrideActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginGroupOverrideActionResponse $;

        public Builder() {
            $ = new OriginGroupOverrideActionResponse();
        }

        public Builder(OriginGroupOverrideActionResponse defaults) {
            $ = new OriginGroupOverrideActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the action for the delivery rule.
         * Expected value is &#39;OriginGroupOverride&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parameters Defines the parameters for the action.
         * 
         * @return builder
         * 
         */
        public Builder parameters(OriginGroupOverrideActionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public OriginGroupOverrideActionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
