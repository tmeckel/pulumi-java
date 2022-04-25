// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emrcontainers.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An arbitrary set of tags (key-value pairs) for this virtual cluster.
 * 
 */
public final class VirtualClusterTag extends com.pulumi.resources.InvokeArgs {

    public static final VirtualClusterTag Empty = new VirtualClusterTag();

    /**
     * The key name of the tag. You can specify a value that is 1 to 127 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The key name of the tag. You can specify a value that is 1 to 127 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The value for the tag. You can specify a value that is 1 to 255 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The value for the tag. You can specify a value that is 1 to 255 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    public String value() {
        return this.value;
    }

    private VirtualClusterTag() {}

    private VirtualClusterTag(VirtualClusterTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualClusterTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterTag $;

        public Builder() {
            $ = new VirtualClusterTag();
        }

        public Builder(VirtualClusterTag defaults) {
            $ = new VirtualClusterTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key name of the tag. You can specify a value that is 1 to 127 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value The value for the tag. You can specify a value that is 1 to 255 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public VirtualClusterTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
