// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A label for tagging Environment resource
 * 
 */
public final class ApplicationTag extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationTag Empty = new ApplicationTag();

    /**
     * A string used to identify this tag
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return A string used to identify this tag
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return A string containing the value for the tag
     * 
     */
    public String value() {
        return this.value;
    }

    private ApplicationTag() {}

    private ApplicationTag(ApplicationTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationTag $;

        public Builder() {
            $ = new ApplicationTag();
        }

        public Builder(ApplicationTag defaults) {
            $ = new ApplicationTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public ApplicationTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
