// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Google Cloud Storage location for the input content.
 * 
 */
public final class GcsSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsSourceResponse Empty = new GcsSourceResponse();

    /**
     * Source data URI. For example, `gs://my_bucket/my_object`.
     * 
     */
    @InputImport(name="inputUri", required=true)
    private final String inputUri;

    public String getInputUri() {
        return this.inputUri;
    }

    public GcsSourceResponse(String inputUri) {
        this.inputUri = Objects.requireNonNull(inputUri, "expected parameter 'inputUri' to be non-null");
    }

    private GcsSourceResponse() {
        this.inputUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
        }

        public Builder setInputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }

        public GcsSourceResponse build() {
            return new GcsSourceResponse(inputUri);
        }
    }
}
