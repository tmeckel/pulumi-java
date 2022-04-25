// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * User property.
 * 
 */
public final class UserPropertyResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserPropertyResponse Empty = new UserPropertyResponse();

    /**
     * User property name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return User property name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * User property value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value", required=true)
    private Object value;

    /**
     * @return User property value. Type: string (or Expression with resultType string).
     * 
     */
    public Object value() {
        return this.value;
    }

    private UserPropertyResponse() {}

    private UserPropertyResponse(UserPropertyResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPropertyResponse $;

        public Builder() {
            $ = new UserPropertyResponse();
        }

        public Builder(UserPropertyResponse defaults) {
            $ = new UserPropertyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name User property name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value User property value. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            $.value = value;
            return this;
        }

        public UserPropertyResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
