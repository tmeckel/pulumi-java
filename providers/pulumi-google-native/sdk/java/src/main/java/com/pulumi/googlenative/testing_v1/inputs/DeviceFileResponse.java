// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.ObbFileResponse;
import com.pulumi.googlenative.testing_v1.inputs.RegularFileResponse;
import java.util.Objects;


/**
 * A single device file description.
 * 
 */
public final class DeviceFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeviceFileResponse Empty = new DeviceFileResponse();

    /**
     * A reference to an opaque binary blob file.
     * 
     */
    @Import(name="obbFile", required=true)
    private ObbFileResponse obbFile;

    /**
     * @return A reference to an opaque binary blob file.
     * 
     */
    public ObbFileResponse obbFile() {
        return this.obbFile;
    }

    /**
     * A reference to a regular file.
     * 
     */
    @Import(name="regularFile", required=true)
    private RegularFileResponse regularFile;

    /**
     * @return A reference to a regular file.
     * 
     */
    public RegularFileResponse regularFile() {
        return this.regularFile;
    }

    private DeviceFileResponse() {}

    private DeviceFileResponse(DeviceFileResponse $) {
        this.obbFile = $.obbFile;
        this.regularFile = $.regularFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceFileResponse $;

        public Builder() {
            $ = new DeviceFileResponse();
        }

        public Builder(DeviceFileResponse defaults) {
            $ = new DeviceFileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param obbFile A reference to an opaque binary blob file.
         * 
         * @return builder
         * 
         */
        public Builder obbFile(ObbFileResponse obbFile) {
            $.obbFile = obbFile;
            return this;
        }

        /**
         * @param regularFile A reference to a regular file.
         * 
         * @return builder
         * 
         */
        public Builder regularFile(RegularFileResponse regularFile) {
            $.regularFile = regularFile;
            return this;
        }

        public DeviceFileResponse build() {
            $.obbFile = Objects.requireNonNull($.obbFile, "expected parameter 'obbFile' to be non-null");
            $.regularFile = Objects.requireNonNull($.regularFile, "expected parameter 'regularFile' to be non-null");
            return $;
        }
    }

}
