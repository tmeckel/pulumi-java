// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the partition key to be used for partitioning data into multiple partitions
 * 
 */
public final class ContainerPartitionKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerPartitionKeyResponse Empty = new ContainerPartitionKeyResponse();

    /**
     * Indicates the kind of algorithm used for partitioning. For MultiHash, multiple partition keys (upto three maximum) are supported for container create
     * 
     */
    @InputImport(name="kind")
      private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * List of paths using which data within the container can be partitioned
     * 
     */
    @InputImport(name="paths")
      private final @Nullable List<String> paths;

    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }

    /**
     * Indicates if the container is using a system generated partition key
     * 
     */
    @InputImport(name="systemKey", required=true)
      private final Boolean systemKey;

    public Boolean getSystemKey() {
        return this.systemKey;
    }

    /**
     * Indicates the version of the partition key definition
     * 
     */
    @InputImport(name="version")
      private final @Nullable Integer version;

    public Optional<Integer> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ContainerPartitionKeyResponse(
        @Nullable String kind,
        @Nullable List<String> paths,
        Boolean systemKey,
        @Nullable Integer version) {
        this.kind = kind == null ? "Hash" : kind;
        this.paths = paths;
        this.systemKey = Objects.requireNonNull(systemKey, "expected parameter 'systemKey' to be non-null");
        this.version = version;
    }

    private ContainerPartitionKeyResponse() {
        this.kind = null;
        this.paths = List.of();
        this.systemKey = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPartitionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kind;
        private @Nullable List<String> paths;
        private Boolean systemKey;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPartitionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.paths = defaults.paths;
    	      this.systemKey = defaults.systemKey;
    	      this.version = defaults.version;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder systemKey(Boolean systemKey) {
            this.systemKey = Objects.requireNonNull(systemKey);
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public ContainerPartitionKeyResponse build() {
            return new ContainerPartitionKeyResponse(kind, paths, systemKey, version);
        }
    }
}
