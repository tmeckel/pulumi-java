// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of properties that uniquely identify a given Docker image.
 * 
 */
public final class FingerprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final FingerprintArgs Empty = new FingerprintArgs();

    /**
     * The layer ID of the final layer in the Docker image's v1 representation.
     * 
     */
    @InputImport(name="v1Name", required=true)
    private final Input<String> v1Name;

    public Input<String> getV1Name() {
        return this.v1Name;
    }

    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    @InputImport(name="v2Blob", required=true)
    private final Input<List<String>> v2Blob;

    public Input<List<String>> getV2Blob() {
        return this.v2Blob;
    }

    public FingerprintArgs(
        Input<String> v1Name,
        Input<List<String>> v2Blob) {
        this.v1Name = Objects.requireNonNull(v1Name, "expected parameter 'v1Name' to be non-null");
        this.v2Blob = Objects.requireNonNull(v2Blob, "expected parameter 'v2Blob' to be non-null");
    }

    private FingerprintArgs() {
        this.v1Name = Input.empty();
        this.v2Blob = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FingerprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> v1Name;
        private Input<List<String>> v2Blob;

        public Builder() {
    	      // Empty
        }

        public Builder(FingerprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1Name = defaults.v1Name;
    	      this.v2Blob = defaults.v2Blob;
        }

        public Builder setV1Name(Input<String> v1Name) {
            this.v1Name = Objects.requireNonNull(v1Name);
            return this;
        }

        public Builder setV1Name(String v1Name) {
            this.v1Name = Input.of(Objects.requireNonNull(v1Name));
            return this;
        }

        public Builder setV2Blob(Input<List<String>> v2Blob) {
            this.v2Blob = Objects.requireNonNull(v2Blob);
            return this;
        }

        public Builder setV2Blob(List<String> v2Blob) {
            this.v2Blob = Input.of(Objects.requireNonNull(v2Blob));
            return this;
        }

        public FingerprintArgs build() {
            return new FingerprintArgs(v1Name, v2Blob);
        }
    }
}
