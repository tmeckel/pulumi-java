// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GcsObjectResponse {
    /**
     * @return Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * @return Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    private final String generationNumber;
    /**
     * @return Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @CustomType.Constructor
    private GcsObjectResponse(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("generationNumber") String generationNumber,
        @CustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generationNumber = generationNumber;
        this.object = object;
    }

    /**
     * @return Bucket of the Cloud Storage object.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    public String generationNumber() {
        return this.generationNumber;
    }
    /**
     * @return Name of the Cloud Storage object.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generationNumber;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generationNumber = defaults.generationNumber;
    	      this.object = defaults.object;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder generationNumber(String generationNumber) {
            this.generationNumber = Objects.requireNonNull(generationNumber);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public GcsObjectResponse build() {
            return new GcsObjectResponse(bucket, generationNumber, object);
        }
    }
}
