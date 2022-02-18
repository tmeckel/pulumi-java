// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1ValueResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Definition for extended entitlement parameters.
 * 
 */
public final class GoogleCloudChannelV1ParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1ParameterResponse Empty = new GoogleCloudChannelV1ParameterResponse();

    /**
     * Specifies whether this parameter is allowed to be changed. For example, for a Google Workspace Business Starter entitlement in commitment plan, num_units is editable when entitlement is active.
     * 
     */
    @InputImport(name="editable", required=true)
    private final Boolean editable;

    public Boolean getEditable() {
        return this.editable;
    }

    /**
     * Name of the parameter.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Value of the parameter.
     * 
     */
    @InputImport(name="value", required=true)
    private final GoogleCloudChannelV1ValueResponse value;

    public GoogleCloudChannelV1ValueResponse getValue() {
        return this.value;
    }

    public GoogleCloudChannelV1ParameterResponse(
        Boolean editable,
        String name,
        GoogleCloudChannelV1ValueResponse value) {
        this.editable = Objects.requireNonNull(editable, "expected parameter 'editable' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudChannelV1ParameterResponse() {
        this.editable = null;
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean editable;
        private String name;
        private GoogleCloudChannelV1ValueResponse value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.editable = defaults.editable;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setEditable(Boolean editable) {
            this.editable = Objects.requireNonNull(editable);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(GoogleCloudChannelV1ValueResponse value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudChannelV1ParameterResponse build() {
            return new GoogleCloudChannelV1ParameterResponse(editable, name, value);
        }
    }
}
