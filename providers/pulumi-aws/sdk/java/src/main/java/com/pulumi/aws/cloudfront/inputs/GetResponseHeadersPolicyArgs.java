// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResponseHeadersPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicyArgs Empty = new GetResponseHeadersPolicyArgs();

    /**
     * The identifier for the response headers policy.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The identifier for the response headers policy.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A unique name to identify the response headers policy.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A unique name to identify the response headers policy.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetResponseHeadersPolicyArgs() {}

    private GetResponseHeadersPolicyArgs(GetResponseHeadersPolicyArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponseHeadersPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponseHeadersPolicyArgs $;

        public Builder() {
            $ = new GetResponseHeadersPolicyArgs();
        }

        public Builder(GetResponseHeadersPolicyArgs defaults) {
            $ = new GetResponseHeadersPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier for the response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name A unique name to identify the response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetResponseHeadersPolicyArgs build() {
            return $;
        }
    }

}
