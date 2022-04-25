// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represents the change that you want to make to the instance properties.
 * 
 */
public final class InstancePropertiesPatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstancePropertiesPatchResponse Empty = new InstancePropertiesPatchResponse();

    /**
     * The label key-value pairs that you want to patch onto the instance.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return The label key-value pairs that you want to patch onto the instance.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    /**
     * @return The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    private InstancePropertiesPatchResponse() {}

    private InstancePropertiesPatchResponse(InstancePropertiesPatchResponse $) {
        this.labels = $.labels;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePropertiesPatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePropertiesPatchResponse $;

        public Builder() {
            $ = new InstancePropertiesPatchResponse();
        }

        public Builder(InstancePropertiesPatchResponse defaults) {
            $ = new InstancePropertiesPatchResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels The label key-value pairs that you want to patch onto the instance.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param metadata The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        public InstancePropertiesPatchResponse build() {
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}
