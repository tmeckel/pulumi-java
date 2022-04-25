// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of PlayReady in Streaming Policy
 * 
 */
public final class StreamingPolicyPlayReadyConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyPlayReadyConfigurationResponse Empty = new StreamingPolicyPlayReadyConfigurationResponse();

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
    private @Nullable String customLicenseAcquisitionUrlTemplate;

    /**
     * @return Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    public Optional<String> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    /**
     * Custom attributes for PlayReady
     * 
     */
    @Import(name="playReadyCustomAttributes")
    private @Nullable String playReadyCustomAttributes;

    /**
     * @return Custom attributes for PlayReady
     * 
     */
    public Optional<String> playReadyCustomAttributes() {
        return Optional.ofNullable(this.playReadyCustomAttributes);
    }

    private StreamingPolicyPlayReadyConfigurationResponse() {}

    private StreamingPolicyPlayReadyConfigurationResponse(StreamingPolicyPlayReadyConfigurationResponse $) {
        this.customLicenseAcquisitionUrlTemplate = $.customLicenseAcquisitionUrlTemplate;
        this.playReadyCustomAttributes = $.playReadyCustomAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyPlayReadyConfigurationResponse $;

        public Builder() {
            $ = new StreamingPolicyPlayReadyConfigurationResponse();
        }

        public Builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
            $ = new StreamingPolicyPlayReadyConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLicenseAcquisitionUrlTemplate Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
         * 
         * @return builder
         * 
         */
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            $.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        /**
         * @param playReadyCustomAttributes Custom attributes for PlayReady
         * 
         * @return builder
         * 
         */
        public Builder playReadyCustomAttributes(@Nullable String playReadyCustomAttributes) {
            $.playReadyCustomAttributes = playReadyCustomAttributes;
            return this;
        }

        public StreamingPolicyPlayReadyConfigurationResponse build() {
            return $;
        }
    }

}
