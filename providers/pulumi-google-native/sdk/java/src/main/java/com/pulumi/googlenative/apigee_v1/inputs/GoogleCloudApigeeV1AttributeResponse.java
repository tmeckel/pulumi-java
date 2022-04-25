// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Key-value pair to store extra metadata.
 * 
 */
public final class GoogleCloudApigeeV1AttributeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1AttributeResponse Empty = new GoogleCloudApigeeV1AttributeResponse();

    /**
     * API key of the attribute.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return API key of the attribute.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Value of the attribute.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Value of the attribute.
     * 
     */
    public String value() {
        return this.value;
    }

    private GoogleCloudApigeeV1AttributeResponse() {}

    private GoogleCloudApigeeV1AttributeResponse(GoogleCloudApigeeV1AttributeResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1AttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1AttributeResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1AttributeResponse();
        }

        public Builder(GoogleCloudApigeeV1AttributeResponse defaults) {
            $ = new GoogleCloudApigeeV1AttributeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name API key of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Value of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GoogleCloudApigeeV1AttributeResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
