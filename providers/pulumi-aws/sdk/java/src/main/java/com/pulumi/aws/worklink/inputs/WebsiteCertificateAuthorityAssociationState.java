// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebsiteCertificateAuthorityAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final WebsiteCertificateAuthorityAssociationState Empty = new WebsiteCertificateAuthorityAssociationState();

    /**
     * The root certificate of the Certificate Authority.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The root certificate of the Certificate Authority.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The certificate name to display.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The certificate name to display.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ARN of the fleet.
     * 
     */
    @Import(name="fleetArn")
    private @Nullable Output<String> fleetArn;

    /**
     * @return The ARN of the fleet.
     * 
     */
    public Optional<Output<String>> fleetArn() {
        return Optional.ofNullable(this.fleetArn);
    }

    /**
     * A unique identifier for the Certificate Authority.
     * 
     */
    @Import(name="websiteCaId")
    private @Nullable Output<String> websiteCaId;

    /**
     * @return A unique identifier for the Certificate Authority.
     * 
     */
    public Optional<Output<String>> websiteCaId() {
        return Optional.ofNullable(this.websiteCaId);
    }

    private WebsiteCertificateAuthorityAssociationState() {}

    private WebsiteCertificateAuthorityAssociationState(WebsiteCertificateAuthorityAssociationState $) {
        this.certificate = $.certificate;
        this.displayName = $.displayName;
        this.fleetArn = $.fleetArn;
        this.websiteCaId = $.websiteCaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebsiteCertificateAuthorityAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebsiteCertificateAuthorityAssociationState $;

        public Builder() {
            $ = new WebsiteCertificateAuthorityAssociationState();
        }

        public Builder(WebsiteCertificateAuthorityAssociationState defaults) {
            $ = new WebsiteCertificateAuthorityAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The root certificate of the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The root certificate of the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param displayName The certificate name to display.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The certificate name to display.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param fleetArn The ARN of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder fleetArn(@Nullable Output<String> fleetArn) {
            $.fleetArn = fleetArn;
            return this;
        }

        /**
         * @param fleetArn The ARN of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder fleetArn(String fleetArn) {
            return fleetArn(Output.of(fleetArn));
        }

        /**
         * @param websiteCaId A unique identifier for the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder websiteCaId(@Nullable Output<String> websiteCaId) {
            $.websiteCaId = websiteCaId;
            return this;
        }

        /**
         * @param websiteCaId A unique identifier for the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder websiteCaId(String websiteCaId) {
            return websiteCaId(Output.of(websiteCaId));
        }

        public WebsiteCertificateAuthorityAssociationState build() {
            return $;
        }
    }

}
