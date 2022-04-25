// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class SubnetGroupTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetGroupTagArgs Empty = new SubnetGroupTagArgs();

    /**
     * The key for the tag. May not be null.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key for the tag. May not be null.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The tag&#39;s value. May be null.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The tag&#39;s value. May be null.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SubnetGroupTagArgs() {}

    private SubnetGroupTagArgs(SubnetGroupTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetGroupTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetGroupTagArgs $;

        public Builder() {
            $ = new SubnetGroupTagArgs();
        }

        public Builder(SubnetGroupTagArgs defaults) {
            $ = new SubnetGroupTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key for the tag. May not be null.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key for the tag. May not be null.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The tag&#39;s value. May be null.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The tag&#39;s value. May be null.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SubnetGroupTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
