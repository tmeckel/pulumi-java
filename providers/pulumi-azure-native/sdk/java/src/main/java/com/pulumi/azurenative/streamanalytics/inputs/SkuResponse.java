// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with a SKU.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The name of the SKU. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the SKU. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private SkuResponse() {}

    private SkuResponse(SkuResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuResponse $;

        public Builder() {
            $ = new SkuResponse();
        }

        public Builder(SkuResponse defaults) {
            $ = new SkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the SKU. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public SkuResponse build() {
            return $;
        }
    }

}
