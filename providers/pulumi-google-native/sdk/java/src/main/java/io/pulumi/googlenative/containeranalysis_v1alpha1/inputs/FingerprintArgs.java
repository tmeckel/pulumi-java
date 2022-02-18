// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of properties that uniquely identify a given Docker image.
 * 
 */
public final class FingerprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final FingerprintArgs Empty = new FingerprintArgs();

    /**
     * The layer-id of the final layer in the Docker image's v1 representation. This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="v1Name")
    private final @Nullable Input<String> v1Name;

    public Input<String> getV1Name() {
        return this.v1Name == null ? Input.empty() : this.v1Name;
    }

    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    @InputImport(name="v2Blob")
    private final @Nullable Input<List<String>> v2Blob;

    public Input<List<String>> getV2Blob() {
        return this.v2Blob == null ? Input.empty() : this.v2Blob;
    }

    public FingerprintArgs(
        @Nullable Input<String> v1Name,
        @Nullable Input<List<String>> v2Blob) {
        this.v1Name = v1Name;
        this.v2Blob = v2Blob;
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
        private @Nullable Input<String> v1Name;
        private @Nullable Input<List<String>> v2Blob;

        public Builder() {
    	      // Empty
        }

        public Builder(FingerprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1Name = defaults.v1Name;
    	      this.v2Blob = defaults.v2Blob;
        }

        public Builder setV1Name(@Nullable Input<String> v1Name) {
            this.v1Name = v1Name;
            return this;
        }

        public Builder setV1Name(@Nullable String v1Name) {
            this.v1Name = Input.ofNullable(v1Name);
            return this;
        }

        public Builder setV2Blob(@Nullable Input<List<String>> v2Blob) {
            this.v2Blob = v2Blob;
            return this;
        }

        public Builder setV2Blob(@Nullable List<String> v2Blob) {
            this.v2Blob = Input.ofNullable(v2Blob);
            return this;
        }

        public FingerprintArgs build() {
            return new FingerprintArgs(v1Name, v2Blob);
        }
    }
}
