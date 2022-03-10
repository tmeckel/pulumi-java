// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Server endpoint cloud tiering status object.
 * 
 */
public final class CloudTieringSpaceSavingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudTieringSpaceSavingsResponse Empty = new CloudTieringSpaceSavingsResponse();

    /**
     * Cached content size on the server
     * 
     */
    @InputImport(name="cachedSizeBytes", required=true)
      private final Double cachedSizeBytes;

    public Double getCachedSizeBytes() {
        return this.cachedSizeBytes;
    }

    /**
     * Last updated timestamp
     * 
     */
    @InputImport(name="lastUpdatedTimestamp", required=true)
      private final String lastUpdatedTimestamp;

    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Count of bytes saved on the server
     * 
     */
    @InputImport(name="spaceSavingsBytes", required=true)
      private final Double spaceSavingsBytes;

    public Double getSpaceSavingsBytes() {
        return this.spaceSavingsBytes;
    }

    /**
     * Percentage of cached size over total size
     * 
     */
    @InputImport(name="spaceSavingsPercent", required=true)
      private final Integer spaceSavingsPercent;

    public Integer getSpaceSavingsPercent() {
        return this.spaceSavingsPercent;
    }

    /**
     * Total size of content in the azure file share
     * 
     */
    @InputImport(name="totalSizeCloudBytes", required=true)
      private final Double totalSizeCloudBytes;

    public Double getTotalSizeCloudBytes() {
        return this.totalSizeCloudBytes;
    }

    /**
     * Volume size
     * 
     */
    @InputImport(name="volumeSizeBytes", required=true)
      private final Double volumeSizeBytes;

    public Double getVolumeSizeBytes() {
        return this.volumeSizeBytes;
    }

    public CloudTieringSpaceSavingsResponse(
        Double cachedSizeBytes,
        String lastUpdatedTimestamp,
        Double spaceSavingsBytes,
        Integer spaceSavingsPercent,
        Double totalSizeCloudBytes,
        Double volumeSizeBytes) {
        this.cachedSizeBytes = Objects.requireNonNull(cachedSizeBytes, "expected parameter 'cachedSizeBytes' to be non-null");
        this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp, "expected parameter 'lastUpdatedTimestamp' to be non-null");
        this.spaceSavingsBytes = Objects.requireNonNull(spaceSavingsBytes, "expected parameter 'spaceSavingsBytes' to be non-null");
        this.spaceSavingsPercent = Objects.requireNonNull(spaceSavingsPercent, "expected parameter 'spaceSavingsPercent' to be non-null");
        this.totalSizeCloudBytes = Objects.requireNonNull(totalSizeCloudBytes, "expected parameter 'totalSizeCloudBytes' to be non-null");
        this.volumeSizeBytes = Objects.requireNonNull(volumeSizeBytes, "expected parameter 'volumeSizeBytes' to be non-null");
    }

    private CloudTieringSpaceSavingsResponse() {
        this.cachedSizeBytes = null;
        this.lastUpdatedTimestamp = null;
        this.spaceSavingsBytes = null;
        this.spaceSavingsPercent = null;
        this.totalSizeCloudBytes = null;
        this.volumeSizeBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringSpaceSavingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cachedSizeBytes;
        private String lastUpdatedTimestamp;
        private Double spaceSavingsBytes;
        private Integer spaceSavingsPercent;
        private Double totalSizeCloudBytes;
        private Double volumeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringSpaceSavingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachedSizeBytes = defaults.cachedSizeBytes;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.spaceSavingsBytes = defaults.spaceSavingsBytes;
    	      this.spaceSavingsPercent = defaults.spaceSavingsPercent;
    	      this.totalSizeCloudBytes = defaults.totalSizeCloudBytes;
    	      this.volumeSizeBytes = defaults.volumeSizeBytes;
        }

        public Builder cachedSizeBytes(Double cachedSizeBytes) {
            this.cachedSizeBytes = Objects.requireNonNull(cachedSizeBytes);
            return this;
        }

        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }

        public Builder spaceSavingsBytes(Double spaceSavingsBytes) {
            this.spaceSavingsBytes = Objects.requireNonNull(spaceSavingsBytes);
            return this;
        }

        public Builder spaceSavingsPercent(Integer spaceSavingsPercent) {
            this.spaceSavingsPercent = Objects.requireNonNull(spaceSavingsPercent);
            return this;
        }

        public Builder totalSizeCloudBytes(Double totalSizeCloudBytes) {
            this.totalSizeCloudBytes = Objects.requireNonNull(totalSizeCloudBytes);
            return this;
        }

        public Builder volumeSizeBytes(Double volumeSizeBytes) {
            this.volumeSizeBytes = Objects.requireNonNull(volumeSizeBytes);
            return this;
        }
        public CloudTieringSpaceSavingsResponse build() {
            return new CloudTieringSpaceSavingsResponse(cachedSizeBytes, lastUpdatedTimestamp, spaceSavingsBytes, spaceSavingsPercent, totalSizeCloudBytes, volumeSizeBytes);
        }
    }
}
