// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a configuration store SKU.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU name of the configuration store.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The SKU name of the configuration store.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SKU name of the configuration store.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKU name of the configuration store.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
