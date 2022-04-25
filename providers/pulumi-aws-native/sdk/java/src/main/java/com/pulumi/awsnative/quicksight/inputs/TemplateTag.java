// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;The key or keys of the key-value pairs for the resource tag or tags assigned to the
 *             resource.&lt;/p&gt;
 * 
 */
public final class TemplateTag extends com.pulumi.resources.InvokeArgs {

    public static final TemplateTag Empty = new TemplateTag();

    /**
     * &lt;p&gt;Tag key.&lt;/p&gt;
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return &lt;p&gt;Tag key.&lt;/p&gt;
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * &lt;p&gt;Tag value.&lt;/p&gt;
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return &lt;p&gt;Tag value.&lt;/p&gt;
     * 
     */
    public String value() {
        return this.value;
    }

    private TemplateTag() {}

    private TemplateTag(TemplateTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateTag $;

        public Builder() {
            $ = new TemplateTag();
        }

        public Builder(TemplateTag defaults) {
            $ = new TemplateTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key &lt;p&gt;Tag key.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value &lt;p&gt;Tag value.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public TemplateTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
