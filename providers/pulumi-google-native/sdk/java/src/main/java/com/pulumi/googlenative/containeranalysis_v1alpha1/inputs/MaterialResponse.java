// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Material is a material used in the generation of the provenance
 * 
 */
public final class MaterialResponse extends com.pulumi.resources.InvokeArgs {

    public static final MaterialResponse Empty = new MaterialResponse();

    /**
     * digest is a map from a hash algorithm (e.g. sha256) to the value in the material
     * 
     */
    @Import(name="digest", required=true)
    private Map<String,String> digest;

    /**
     * @return digest is a map from a hash algorithm (e.g. sha256) to the value in the material
     * 
     */
    public Map<String,String> digest() {
        return this.digest;
    }

    /**
     * uri is the uri of the material
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return uri is the uri of the material
     * 
     */
    public String uri() {
        return this.uri;
    }

    private MaterialResponse() {}

    private MaterialResponse(MaterialResponse $) {
        this.digest = $.digest;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaterialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaterialResponse $;

        public Builder() {
            $ = new MaterialResponse();
        }

        public Builder(MaterialResponse defaults) {
            $ = new MaterialResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param digest digest is a map from a hash algorithm (e.g. sha256) to the value in the material
         * 
         * @return builder
         * 
         */
        public Builder digest(Map<String,String> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param uri uri is the uri of the material
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public MaterialResponse build() {
            $.digest = Objects.requireNonNull($.digest, "expected parameter 'digest' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
