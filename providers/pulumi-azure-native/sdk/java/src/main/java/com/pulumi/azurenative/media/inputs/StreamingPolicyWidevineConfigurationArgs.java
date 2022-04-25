// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of Widevine in Streaming Policy
 * 
 */
public final class StreamingPolicyWidevineConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyWidevineConfigurationArgs Empty = new StreamingPolicyWidevineConfigurationArgs();

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
    private @Nullable Output<String> customLicenseAcquisitionUrlTemplate;

    /**
     * @return Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    public Optional<Output<String>> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    private StreamingPolicyWidevineConfigurationArgs() {}

    private StreamingPolicyWidevineConfigurationArgs(StreamingPolicyWidevineConfigurationArgs $) {
        this.customLicenseAcquisitionUrlTemplate = $.customLicenseAcquisitionUrlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyWidevineConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyWidevineConfigurationArgs $;

        public Builder() {
            $ = new StreamingPolicyWidevineConfigurationArgs();
        }

        public Builder(StreamingPolicyWidevineConfigurationArgs defaults) {
            $ = new StreamingPolicyWidevineConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLicenseAcquisitionUrlTemplate Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
         * 
         * @return builder
         * 
         */
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable Output<String> customLicenseAcquisitionUrlTemplate) {
            $.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        /**
         * @param customLicenseAcquisitionUrlTemplate Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
         * 
         * @return builder
         * 
         */
        public Builder customLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
            return customLicenseAcquisitionUrlTemplate(Output.of(customLicenseAcquisitionUrlTemplate));
        }

        public StreamingPolicyWidevineConfigurationArgs build() {
            return $;
        }
    }

}
