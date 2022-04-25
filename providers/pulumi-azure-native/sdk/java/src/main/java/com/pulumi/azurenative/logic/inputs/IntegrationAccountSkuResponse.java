// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account sku.
 * 
 */
public final class IntegrationAccountSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final IntegrationAccountSkuResponse Empty = new IntegrationAccountSkuResponse();

    /**
     * The sku name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The sku name.
     * 
     */
    public String name() {
        return this.name;
    }

    private IntegrationAccountSkuResponse() {}

    private IntegrationAccountSkuResponse(IntegrationAccountSkuResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountSkuResponse $;

        public Builder() {
            $ = new IntegrationAccountSkuResponse();
        }

        public Builder(IntegrationAccountSkuResponse defaults) {
            $ = new IntegrationAccountSkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The sku name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public IntegrationAccountSkuResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
