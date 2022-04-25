// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Note holding the version of the provider&#39;s builder and the signature of the provenance message in the build details occurrence.
 * 
 */
public final class BuildResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildResponse Empty = new BuildResponse();

    /**
     * Immutable. Version of the builder which produced this build.
     * 
     */
    @Import(name="builderVersion", required=true)
    private String builderVersion;

    /**
     * @return Immutable. Version of the builder which produced this build.
     * 
     */
    public String builderVersion() {
        return this.builderVersion;
    }

    /**
     * Signature of the build in occurrences pointing to this build note containing build details.
     * 
     */
    @Import(name="signature", required=true)
    private BuildSignatureResponse signature;

    /**
     * @return Signature of the build in occurrences pointing to this build note containing build details.
     * 
     */
    public BuildSignatureResponse signature() {
        return this.signature;
    }

    private BuildResponse() {}

    private BuildResponse(BuildResponse $) {
        this.builderVersion = $.builderVersion;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildResponse $;

        public Builder() {
            $ = new BuildResponse();
        }

        public Builder(BuildResponse defaults) {
            $ = new BuildResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param builderVersion Immutable. Version of the builder which produced this build.
         * 
         * @return builder
         * 
         */
        public Builder builderVersion(String builderVersion) {
            $.builderVersion = builderVersion;
            return this;
        }

        /**
         * @param signature Signature of the build in occurrences pointing to this build note containing build details.
         * 
         * @return builder
         * 
         */
        public Builder signature(BuildSignatureResponse signature) {
            $.signature = signature;
            return this;
        }

        public BuildResponse build() {
            $.builderVersion = Objects.requireNonNull($.builderVersion, "expected parameter 'builderVersion' to be non-null");
            $.signature = Objects.requireNonNull($.signature, "expected parameter 'signature' to be non-null");
            return $;
        }
    }

}
