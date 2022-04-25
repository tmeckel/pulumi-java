// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extended Location.
 * 
 */
public final class ExtendedLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExtendedLocationResponse Empty = new ExtendedLocationResponse();

    /**
     * Name of extended location.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of extended location.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of extended location.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of extended location.
     * 
     */
    public String type() {
        return this.type;
    }

    private ExtendedLocationResponse() {}

    private ExtendedLocationResponse(ExtendedLocationResponse $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedLocationResponse $;

        public Builder() {
            $ = new ExtendedLocationResponse();
        }

        public Builder(ExtendedLocationResponse defaults) {
            $ = new ExtendedLocationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of extended location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type Type of extended location.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ExtendedLocationResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
