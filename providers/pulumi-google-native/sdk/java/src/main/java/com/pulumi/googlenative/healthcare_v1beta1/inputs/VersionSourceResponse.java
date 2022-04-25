// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a selector for extracting and matching an MSH field to a value.
 * 
 */
public final class VersionSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final VersionSourceResponse Empty = new VersionSourceResponse();

    /**
     * The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    @Import(name="mshField", required=true)
    private String mshField;

    /**
     * @return The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    public String mshField() {
        return this.mshField;
    }

    /**
     * The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    public String value() {
        return this.value;
    }

    private VersionSourceResponse() {}

    private VersionSourceResponse(VersionSourceResponse $) {
        this.mshField = $.mshField;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VersionSourceResponse $;

        public Builder() {
            $ = new VersionSourceResponse();
        }

        public Builder(VersionSourceResponse defaults) {
            $ = new VersionSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param mshField The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mshField(String mshField) {
            $.mshField = mshField;
            return this;
        }

        /**
         * @param value The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public VersionSourceResponse build() {
            $.mshField = Objects.requireNonNull($.mshField, "expected parameter 'mshField' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
