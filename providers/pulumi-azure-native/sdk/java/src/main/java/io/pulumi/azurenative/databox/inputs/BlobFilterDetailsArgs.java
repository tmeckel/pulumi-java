// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filter details to transfer Azure Blobs
 * 
 */
public final class BlobFilterDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobFilterDetailsArgs Empty = new BlobFilterDetailsArgs();

    /**
     * List of full path of the blobs to be transferred.
     * 
     */
    @InputImport(name="blobPathList")
      private final @Nullable Input<List<String>> blobPathList;

    public Input<List<String>> getBlobPathList() {
        return this.blobPathList == null ? Input.empty() : this.blobPathList;
    }

    /**
     * Prefix list of the Azure blobs to be transferred.
     * 
     */
    @InputImport(name="blobPrefixList")
      private final @Nullable Input<List<String>> blobPrefixList;

    public Input<List<String>> getBlobPrefixList() {
        return this.blobPrefixList == null ? Input.empty() : this.blobPrefixList;
    }

    /**
     * List of blob containers to be transferred.
     * 
     */
    @InputImport(name="containerList")
      private final @Nullable Input<List<String>> containerList;

    public Input<List<String>> getContainerList() {
        return this.containerList == null ? Input.empty() : this.containerList;
    }

    public BlobFilterDetailsArgs(
        @Nullable Input<List<String>> blobPathList,
        @Nullable Input<List<String>> blobPrefixList,
        @Nullable Input<List<String>> containerList) {
        this.blobPathList = blobPathList;
        this.blobPrefixList = blobPrefixList;
        this.containerList = containerList;
    }

    private BlobFilterDetailsArgs() {
        this.blobPathList = Input.empty();
        this.blobPrefixList = Input.empty();
        this.containerList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobFilterDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> blobPathList;
        private @Nullable Input<List<String>> blobPrefixList;
        private @Nullable Input<List<String>> containerList;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobFilterDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobPathList = defaults.blobPathList;
    	      this.blobPrefixList = defaults.blobPrefixList;
    	      this.containerList = defaults.containerList;
        }

        public Builder blobPathList(@Nullable Input<List<String>> blobPathList) {
            this.blobPathList = blobPathList;
            return this;
        }

        public Builder blobPathList(@Nullable List<String> blobPathList) {
            this.blobPathList = Input.ofNullable(blobPathList);
            return this;
        }

        public Builder blobPrefixList(@Nullable Input<List<String>> blobPrefixList) {
            this.blobPrefixList = blobPrefixList;
            return this;
        }

        public Builder blobPrefixList(@Nullable List<String> blobPrefixList) {
            this.blobPrefixList = Input.ofNullable(blobPrefixList);
            return this;
        }

        public Builder containerList(@Nullable Input<List<String>> containerList) {
            this.containerList = containerList;
            return this;
        }

        public Builder containerList(@Nullable List<String> containerList) {
            this.containerList = Input.ofNullable(containerList);
            return this;
        }
        public BlobFilterDetailsArgs build() {
            return new BlobFilterDetailsArgs(blobPathList, blobPrefixList, containerList);
        }
    }
}
