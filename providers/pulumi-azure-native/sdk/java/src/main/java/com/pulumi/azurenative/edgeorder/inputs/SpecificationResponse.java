// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifications of the configurations
 * 
 */
public final class SpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final SpecificationResponse Empty = new SpecificationResponse();

    /**
     * Name of the specification
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the specification
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Value of the specification
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Value of the specification
     * 
     */
    public String value() {
        return this.value;
    }

    private SpecificationResponse() {}

    private SpecificationResponse(SpecificationResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpecificationResponse $;

        public Builder() {
            $ = new SpecificationResponse();
        }

        public Builder(SpecificationResponse defaults) {
            $ = new SpecificationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the specification
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Value of the specification
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public SpecificationResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
