// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemAssociationCacheAttributesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemAssociationCacheAttributesGetArgs Empty = new FileSystemAssociationCacheAttributesGetArgs();

    /**
     * Refreshes a file share&#39;s cache by using Time To Live (TTL).
     * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
     * to first refresh that directory&#39;s contents from the Amazon S3 bucket. Valid Values: `0` or `300` to `2592000` seconds (5 minutes to 30 days). Defaults to `0`
     * 
     */
    @Import(name="cacheStaleTimeoutInSeconds")
    private @Nullable Output<Integer> cacheStaleTimeoutInSeconds;

    /**
     * @return Refreshes a file share&#39;s cache by using Time To Live (TTL).
     * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
     * to first refresh that directory&#39;s contents from the Amazon S3 bucket. Valid Values: `0` or `300` to `2592000` seconds (5 minutes to 30 days). Defaults to `0`
     * 
     */
    public Optional<Output<Integer>> cacheStaleTimeoutInSeconds() {
        return Optional.ofNullable(this.cacheStaleTimeoutInSeconds);
    }

    private FileSystemAssociationCacheAttributesGetArgs() {}

    private FileSystemAssociationCacheAttributesGetArgs(FileSystemAssociationCacheAttributesGetArgs $) {
        this.cacheStaleTimeoutInSeconds = $.cacheStaleTimeoutInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemAssociationCacheAttributesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemAssociationCacheAttributesGetArgs $;

        public Builder() {
            $ = new FileSystemAssociationCacheAttributesGetArgs();
        }

        public Builder(FileSystemAssociationCacheAttributesGetArgs defaults) {
            $ = new FileSystemAssociationCacheAttributesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheStaleTimeoutInSeconds Refreshes a file share&#39;s cache by using Time To Live (TTL).
         * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
         * to first refresh that directory&#39;s contents from the Amazon S3 bucket. Valid Values: `0` or `300` to `2592000` seconds (5 minutes to 30 days). Defaults to `0`
         * 
         * @return builder
         * 
         */
        public Builder cacheStaleTimeoutInSeconds(@Nullable Output<Integer> cacheStaleTimeoutInSeconds) {
            $.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
            return this;
        }

        /**
         * @param cacheStaleTimeoutInSeconds Refreshes a file share&#39;s cache by using Time To Live (TTL).
         * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
         * to first refresh that directory&#39;s contents from the Amazon S3 bucket. Valid Values: `0` or `300` to `2592000` seconds (5 minutes to 30 days). Defaults to `0`
         * 
         * @return builder
         * 
         */
        public Builder cacheStaleTimeoutInSeconds(Integer cacheStaleTimeoutInSeconds) {
            return cacheStaleTimeoutInSeconds(Output.of(cacheStaleTimeoutInSeconds));
        }

        public FileSystemAssociationCacheAttributesGetArgs build() {
            return $;
        }
    }

}
