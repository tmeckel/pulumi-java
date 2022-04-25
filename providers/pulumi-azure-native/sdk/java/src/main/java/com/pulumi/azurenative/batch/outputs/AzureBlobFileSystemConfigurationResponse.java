// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureBlobFileSystemConfigurationResponse {
    /**
     * @return This property is mutually exclusive with sasKey and one must be specified.
     * 
     */
    private final @Nullable String accountKey;
    private final String accountName;
    /**
     * @return These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    private final @Nullable String blobfuseOptions;
    private final String containerName;
    /**
     * @return All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    private final String relativeMountPath;
    /**
     * @return This property is mutually exclusive with accountKey and one must be specified.
     * 
     */
    private final @Nullable String sasKey;

    @CustomType.Constructor
    private AzureBlobFileSystemConfigurationResponse(
        @CustomType.Parameter("accountKey") @Nullable String accountKey,
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("blobfuseOptions") @Nullable String blobfuseOptions,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("relativeMountPath") String relativeMountPath,
        @CustomType.Parameter("sasKey") @Nullable String sasKey) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.blobfuseOptions = blobfuseOptions;
        this.containerName = containerName;
        this.relativeMountPath = relativeMountPath;
        this.sasKey = sasKey;
    }

    /**
     * @return This property is mutually exclusive with sasKey and one must be specified.
     * 
     */
    public Optional<String> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<String> blobfuseOptions() {
        return Optional.ofNullable(this.blobfuseOptions);
    }
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }
    /**
     * @return This property is mutually exclusive with accountKey and one must be specified.
     * 
     */
    public Optional<String> sasKey() {
        return Optional.ofNullable(this.sasKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFileSystemConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private String accountName;
        private @Nullable String blobfuseOptions;
        private String containerName;
        private String relativeMountPath;
        private @Nullable String sasKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFileSystemConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.blobfuseOptions = defaults.blobfuseOptions;
    	      this.containerName = defaults.containerName;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.sasKey = defaults.sasKey;
        }

        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder blobfuseOptions(@Nullable String blobfuseOptions) {
            this.blobfuseOptions = blobfuseOptions;
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        public Builder sasKey(@Nullable String sasKey) {
            this.sasKey = sasKey;
            return this;
        }        public AzureBlobFileSystemConfigurationResponse build() {
            return new AzureBlobFileSystemConfigurationResponse(accountKey, accountName, blobfuseOptions, containerName, relativeMountPath, sasKey);
        }
    }
}
