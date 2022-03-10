// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of properties that uniquely identify a given Docker image.
 * 
 */
public final class FingerprintResponse extends io.pulumi.resources.InvokeArgs {

    public static final FingerprintResponse Empty = new FingerprintResponse();

    /**
     * The layer ID of the final layer in the Docker image's v1 representation.
     * 
     */
    @InputImport(name="v1Name", required=true)
      private final String v1Name;

    public String getV1Name() {
        return this.v1Name;
    }

    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    @InputImport(name="v2Blob", required=true)
      private final List<String> v2Blob;

    public List<String> getV2Blob() {
        return this.v2Blob;
    }

    /**
     * The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept.
     * 
     */
    @InputImport(name="v2Name", required=true)
      private final String v2Name;

    public String getV2Name() {
        return this.v2Name;
    }

    public FingerprintResponse(
        String v1Name,
        List<String> v2Blob,
        String v2Name) {
        this.v1Name = Objects.requireNonNull(v1Name, "expected parameter 'v1Name' to be non-null");
        this.v2Blob = Objects.requireNonNull(v2Blob, "expected parameter 'v2Blob' to be non-null");
        this.v2Name = Objects.requireNonNull(v2Name, "expected parameter 'v2Name' to be non-null");
    }

    private FingerprintResponse() {
        this.v1Name = null;
        this.v2Blob = List.of();
        this.v2Name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FingerprintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String v1Name;
        private List<String> v2Blob;
        private String v2Name;

        public Builder() {
    	      // Empty
        }

        public Builder(FingerprintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1Name = defaults.v1Name;
    	      this.v2Blob = defaults.v2Blob;
    	      this.v2Name = defaults.v2Name;
        }

        public Builder v1Name(String v1Name) {
            this.v1Name = Objects.requireNonNull(v1Name);
            return this;
        }

        public Builder v2Blob(List<String> v2Blob) {
            this.v2Blob = Objects.requireNonNull(v2Blob);
            return this;
        }

        public Builder v2Name(String v2Name) {
            this.v2Name = Objects.requireNonNull(v2Name);
            return this;
        }
        public FingerprintResponse build() {
            return new FingerprintResponse(v1Name, v2Blob, v2Name);
        }
    }
}
