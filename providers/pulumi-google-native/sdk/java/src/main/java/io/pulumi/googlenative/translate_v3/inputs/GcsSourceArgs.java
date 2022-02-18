// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Google Cloud Storage location for the input content.
 * 
 */
public final class GcsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcsSourceArgs Empty = new GcsSourceArgs();

    /**
     * Source data URI. For example, `gs://my_bucket/my_object`.
     * 
     */
    @InputImport(name="inputUri", required=true)
    private final Input<String> inputUri;

    public Input<String> getInputUri() {
        return this.inputUri;
    }

    public GcsSourceArgs(Input<String> inputUri) {
        this.inputUri = Objects.requireNonNull(inputUri, "expected parameter 'inputUri' to be non-null");
    }

    private GcsSourceArgs() {
        this.inputUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> inputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
        }

        public Builder setInputUri(Input<String> inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }

        public Builder setInputUri(String inputUri) {
            this.inputUri = Input.of(Objects.requireNonNull(inputUri));
            return this;
        }

        public GcsSourceArgs build() {
            return new GcsSourceArgs(inputUri);
        }
    }
}
