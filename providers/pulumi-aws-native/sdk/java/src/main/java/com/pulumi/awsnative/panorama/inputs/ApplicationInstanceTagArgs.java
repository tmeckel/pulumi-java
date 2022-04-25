// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationInstanceTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationInstanceTagArgs Empty = new ApplicationInstanceTagArgs();

    /**
     * A string used to identify this tag
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A string used to identify this tag
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return A string containing the value for the tag
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ApplicationInstanceTagArgs() {}

    private ApplicationInstanceTagArgs(ApplicationInstanceTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationInstanceTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationInstanceTagArgs $;

        public Builder() {
            $ = new ApplicationInstanceTagArgs();
        }

        public Builder(ApplicationInstanceTagArgs defaults) {
            $ = new ApplicationInstanceTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApplicationInstanceTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
