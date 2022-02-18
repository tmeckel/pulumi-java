// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
 * 
 */
public final class VolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    /**
     * Unique name for the volume.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @InputImport(name="sizeGb", required=true)
    private final Double sizeGb;

    public Double getSizeGb() {
        return this.sizeGb;
    }

    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    @InputImport(name="volumeType", required=true)
    private final String volumeType;

    public String getVolumeType() {
        return this.volumeType;
    }

    public VolumeResponse(
        String name,
        Double sizeGb,
        String volumeType) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sizeGb = Objects.requireNonNull(sizeGb, "expected parameter 'sizeGb' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private VolumeResponse() {
        this.name = null;
        this.sizeGb = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double sizeGb;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSizeGb(Double sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }

        public VolumeResponse build() {
            return new VolumeResponse(name, sizeGb, volumeType);
        }
    }
}
