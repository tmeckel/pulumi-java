// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the BlobNfsTarget.
 * 
 */
public final class BlobNfsTargetResponse extends com.pulumi.resources.InvokeArgs {

    public static final BlobNfsTargetResponse Empty = new BlobNfsTargetResponse();

    /**
     * Resource ID of the storage container.
     * 
     */
    @Import(name="target")
    private @Nullable String target;

    /**
     * @return Resource ID of the storage container.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    @Import(name="usageModel")
    private @Nullable String usageModel;

    /**
     * @return Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    public Optional<String> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    private BlobNfsTargetResponse() {}

    private BlobNfsTargetResponse(BlobNfsTargetResponse $) {
        this.target = $.target;
        this.usageModel = $.usageModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobNfsTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobNfsTargetResponse $;

        public Builder() {
            $ = new BlobNfsTargetResponse();
        }

        public Builder(BlobNfsTargetResponse defaults) {
            $ = new BlobNfsTargetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param target Resource ID of the storage container.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable String target) {
            $.target = target;
            return this;
        }

        /**
         * @param usageModel Identifies the StorageCache usage model to be used for this storage target.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(@Nullable String usageModel) {
            $.usageModel = usageModel;
            return this;
        }

        public BlobNfsTargetResponse build() {
            return $;
        }
    }

}
