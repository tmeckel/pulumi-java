// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Label object for DeploymentUpdate
 * 
 */
public final class DeploymentUpdateLabelEntryResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeploymentUpdateLabelEntryResponse Empty = new DeploymentUpdateLabelEntryResponse();

    /**
     * Key of the label
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Key of the label
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Value of the label
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Value of the label
     * 
     */
    public String value() {
        return this.value;
    }

    private DeploymentUpdateLabelEntryResponse() {}

    private DeploymentUpdateLabelEntryResponse(DeploymentUpdateLabelEntryResponse $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentUpdateLabelEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentUpdateLabelEntryResponse $;

        public Builder() {
            $ = new DeploymentUpdateLabelEntryResponse();
        }

        public Builder(DeploymentUpdateLabelEntryResponse defaults) {
            $ = new DeploymentUpdateLabelEntryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the label
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value Value of the label
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public DeploymentUpdateLabelEntryResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
