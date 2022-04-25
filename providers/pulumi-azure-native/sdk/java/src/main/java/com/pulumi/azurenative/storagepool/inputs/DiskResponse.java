// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Managed Disk to attach to the Disk pool.
 * 
 */
public final class DiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskResponse Empty = new DiskResponse();

    /**
     * Unique Azure Resource ID of the Managed Disk.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Unique Azure Resource ID of the Managed Disk.
     * 
     */
    public String id() {
        return this.id;
    }

    private DiskResponse() {}

    private DiskResponse(DiskResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskResponse $;

        public Builder() {
            $ = new DiskResponse();
        }

        public Builder(DiskResponse defaults) {
            $ = new DiskResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique Azure Resource ID of the Managed Disk.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public DiskResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
