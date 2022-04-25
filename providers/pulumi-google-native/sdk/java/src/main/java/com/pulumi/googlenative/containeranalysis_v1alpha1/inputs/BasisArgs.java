// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.FingerprintArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via: FROM Or an equivalent reference, e.g. a tag of the resource_url.
 * 
 */
public final class BasisArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasisArgs Empty = new BasisArgs();

    /**
     * The fingerprint of the base image.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<FingerprintArgs> fingerprint;

    /**
     * @return The fingerprint of the base image.
     * 
     */
    public Optional<Output<FingerprintArgs>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    @Import(name="resourceUrl")
    private @Nullable Output<String> resourceUrl;

    /**
     * @return The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    public Optional<Output<String>> resourceUrl() {
        return Optional.ofNullable(this.resourceUrl);
    }

    private BasisArgs() {}

    private BasisArgs(BasisArgs $) {
        this.fingerprint = $.fingerprint;
        this.resourceUrl = $.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasisArgs $;

        public Builder() {
            $ = new BasisArgs();
        }

        public Builder(BasisArgs defaults) {
            $ = new BasisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fingerprint The fingerprint of the base image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<FingerprintArgs> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint of the base image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(FingerprintArgs fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param resourceUrl The resource_url for the resource representing the basis of associated occurrence images.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(@Nullable Output<String> resourceUrl) {
            $.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * @param resourceUrl The resource_url for the resource representing the basis of associated occurrence images.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(String resourceUrl) {
            return resourceUrl(Output.of(resourceUrl));
        }

        public BasisArgs build() {
            return $;
        }
    }

}
