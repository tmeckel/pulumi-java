// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of properties that uniquely identify a given Docker image.
 * 
 */
public final class FingerprintResponse extends com.pulumi.resources.InvokeArgs {

    public static final FingerprintResponse Empty = new FingerprintResponse();

    /**
     * The layer ID of the final layer in the Docker image&#39;s v1 representation.
     * 
     */
    @Import(name="v1Name", required=true)
    private String v1Name;

    /**
     * @return The layer ID of the final layer in the Docker image&#39;s v1 representation.
     * 
     */
    public String v1Name() {
        return this.v1Name;
    }

    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    @Import(name="v2Blob", required=true)
    private List<String> v2Blob;

    /**
     * @return The ordered list of v2 blobs that represent a given image.
     * 
     */
    public List<String> v2Blob() {
        return this.v2Blob;
    }

    /**
     * The name of the image&#39;s v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + &#34; &#34; + v2_name[N+1]) Only the name of the final blob is kept.
     * 
     */
    @Import(name="v2Name", required=true)
    private String v2Name;

    /**
     * @return The name of the image&#39;s v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + &#34; &#34; + v2_name[N+1]) Only the name of the final blob is kept.
     * 
     */
    public String v2Name() {
        return this.v2Name;
    }

    private FingerprintResponse() {}

    private FingerprintResponse(FingerprintResponse $) {
        this.v1Name = $.v1Name;
        this.v2Blob = $.v2Blob;
        this.v2Name = $.v2Name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FingerprintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FingerprintResponse $;

        public Builder() {
            $ = new FingerprintResponse();
        }

        public Builder(FingerprintResponse defaults) {
            $ = new FingerprintResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param v1Name The layer ID of the final layer in the Docker image&#39;s v1 representation.
         * 
         * @return builder
         * 
         */
        public Builder v1Name(String v1Name) {
            $.v1Name = v1Name;
            return this;
        }

        /**
         * @param v2Blob The ordered list of v2 blobs that represent a given image.
         * 
         * @return builder
         * 
         */
        public Builder v2Blob(List<String> v2Blob) {
            $.v2Blob = v2Blob;
            return this;
        }

        /**
         * @param v2Blob The ordered list of v2 blobs that represent a given image.
         * 
         * @return builder
         * 
         */
        public Builder v2Blob(String... v2Blob) {
            return v2Blob(List.of(v2Blob));
        }

        /**
         * @param v2Name The name of the image&#39;s v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + &#34; &#34; + v2_name[N+1]) Only the name of the final blob is kept.
         * 
         * @return builder
         * 
         */
        public Builder v2Name(String v2Name) {
            $.v2Name = v2Name;
            return this;
        }

        public FingerprintResponse build() {
            $.v1Name = Objects.requireNonNull($.v1Name, "expected parameter 'v1Name' to be non-null");
            $.v2Blob = Objects.requireNonNull($.v2Blob, "expected parameter 'v2Blob' to be non-null");
            $.v2Name = Objects.requireNonNull($.v2Name, "expected parameter 'v2Name' to be non-null");
            return $;
        }
    }

}
