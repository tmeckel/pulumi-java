// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the Azure resource that was assessed
 * 
 */
public final class AzureResourceDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureResourceDetailsResponse Empty = new AzureResourceDetailsResponse();

    /**
     * Azure resource Id of the assessed resource
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Azure resource Id of the assessed resource
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is &#39;Azure&#39;.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    /**
     * @return The platform where the assessed resource resides
     * Expected value is &#39;Azure&#39;.
     * 
     */
    public String source() {
        return this.source;
    }

    private AzureResourceDetailsResponse() {}

    private AzureResourceDetailsResponse(AzureResourceDetailsResponse $) {
        this.id = $.id;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureResourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureResourceDetailsResponse $;

        public Builder() {
            $ = new AzureResourceDetailsResponse();
        }

        public Builder(AzureResourceDetailsResponse defaults) {
            $ = new AzureResourceDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Azure resource Id of the assessed resource
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param source The platform where the assessed resource resides
         * Expected value is &#39;Azure&#39;.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public AzureResourceDetailsResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.source = Codegen.stringProp("source").arg($.source).require();
            return $;
        }
    }

}
