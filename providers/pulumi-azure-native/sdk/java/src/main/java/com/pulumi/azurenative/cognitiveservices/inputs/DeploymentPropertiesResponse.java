// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.azurenative.cognitiveservices.inputs.DeploymentModelResponse;
import com.pulumi.azurenative.cognitiveservices.inputs.DeploymentScaleSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment.
 * 
 */
public final class DeploymentPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeploymentPropertiesResponse Empty = new DeploymentPropertiesResponse();

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="model")
    private @Nullable DeploymentModelResponse model;

    /**
     * @return Properties of Cognitive Services account deployment model.
     * 
     */
    public Optional<DeploymentModelResponse> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * Gets the status of the resource at the time the operation was called.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Gets the status of the resource at the time the operation was called.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="scaleSettings")
    private @Nullable DeploymentScaleSettingsResponse scaleSettings;

    /**
     * @return Properties of Cognitive Services account deployment model.
     * 
     */
    public Optional<DeploymentScaleSettingsResponse> scaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }

    private DeploymentPropertiesResponse() {}

    private DeploymentPropertiesResponse(DeploymentPropertiesResponse $) {
        this.model = $.model;
        this.provisioningState = $.provisioningState;
        this.scaleSettings = $.scaleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentPropertiesResponse $;

        public Builder() {
            $ = new DeploymentPropertiesResponse();
        }

        public Builder(DeploymentPropertiesResponse defaults) {
            $ = new DeploymentPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param model Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable DeploymentModelResponse model) {
            $.model = model;
            return this;
        }

        /**
         * @param provisioningState Gets the status of the resource at the time the operation was called.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param scaleSettings Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(@Nullable DeploymentScaleSettingsResponse scaleSettings) {
            $.scaleSettings = scaleSettings;
            return this;
        }

        public DeploymentPropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
