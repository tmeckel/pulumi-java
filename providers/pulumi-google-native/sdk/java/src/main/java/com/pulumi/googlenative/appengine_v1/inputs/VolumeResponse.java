// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
 * 
 */
public final class VolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    /**
     * Unique name for the volume.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Unique name for the volume.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @Import(name="sizeGb", required=true)
    private Double sizeGb;

    /**
     * @return Volume size in gigabytes.
     * 
     */
    public Double sizeGb() {
        return this.sizeGb;
    }

    /**
     * Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    @Import(name="volumeType", required=true)
    private String volumeType;

    /**
     * @return Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    private VolumeResponse() {}

    private VolumeResponse(VolumeResponse $) {
        this.name = $.name;
        this.sizeGb = $.sizeGb;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeResponse $;

        public Builder() {
            $ = new VolumeResponse();
        }

        public Builder(VolumeResponse defaults) {
            $ = new VolumeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param sizeGb Volume size in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Double sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param volumeType Underlying volume type, e.g. &#39;tmpfs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public VolumeResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sizeGb = Objects.requireNonNull($.sizeGb, "expected parameter 'sizeGb' to be non-null");
            $.volumeType = Objects.requireNonNull($.volumeType, "expected parameter 'volumeType' to be non-null");
            return $;
        }
    }

}
