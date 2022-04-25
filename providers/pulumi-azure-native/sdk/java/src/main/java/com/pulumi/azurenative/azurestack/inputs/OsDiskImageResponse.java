// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * OS disk image.
 * 
 */
public final class OsDiskImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final OsDiskImageResponse Empty = new OsDiskImageResponse();

    /**
     * OS operating system type.
     * 
     */
    @Import(name="operatingSystem", required=true)
    private String operatingSystem;

    /**
     * @return OS operating system type.
     * 
     */
    public String operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * SAS key for source blob.
     * 
     */
    @Import(name="sourceBlobSasUri", required=true)
    private String sourceBlobSasUri;

    /**
     * @return SAS key for source blob.
     * 
     */
    public String sourceBlobSasUri() {
        return this.sourceBlobSasUri;
    }

    private OsDiskImageResponse() {}

    private OsDiskImageResponse(OsDiskImageResponse $) {
        this.operatingSystem = $.operatingSystem;
        this.sourceBlobSasUri = $.sourceBlobSasUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsDiskImageResponse $;

        public Builder() {
            $ = new OsDiskImageResponse();
        }

        public Builder(OsDiskImageResponse defaults) {
            $ = new OsDiskImageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param operatingSystem OS operating system type.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(String operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param sourceBlobSasUri SAS key for source blob.
         * 
         * @return builder
         * 
         */
        public Builder sourceBlobSasUri(String sourceBlobSasUri) {
            $.sourceBlobSasUri = sourceBlobSasUri;
            return this;
        }

        public OsDiskImageResponse build() {
            $.operatingSystem = Objects.requireNonNull($.operatingSystem, "expected parameter 'operatingSystem' to be non-null");
            $.sourceBlobSasUri = Objects.requireNonNull($.sourceBlobSasUri, "expected parameter 'sourceBlobSasUri' to be non-null");
            return $;
        }
    }

}
