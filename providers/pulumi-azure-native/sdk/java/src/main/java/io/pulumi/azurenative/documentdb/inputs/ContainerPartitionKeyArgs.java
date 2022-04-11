// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.PartitionKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of the partition key to be used for partitioning data into multiple partitions
 * 
 */
public final class ContainerPartitionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPartitionKeyArgs Empty = new ContainerPartitionKeyArgs();

    /**
     * Indicates the kind of algorithm used for partitioning. For MultiHash, multiple partition keys (upto three maximum) are supported for container create
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<Either<String,PartitionKind>> kind;

    public Output<Either<String,PartitionKind>> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * List of paths using which data within the container can be partitioned
     * 
     */
    @Import(name="paths")
      private final @Nullable Output<List<String>> paths;

    public Output<List<String>> getPaths() {
        return this.paths == null ? Codegen.empty() : this.paths;
    }

    /**
     * Indicates the version of the partition key definition
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ContainerPartitionKeyArgs(
        @Nullable Output<Either<String,PartitionKind>> kind,
        @Nullable Output<List<String>> paths,
        @Nullable Output<Integer> version) {
        this.kind = kind == null ? Output.ofLeft("Hash") : kind;
        this.paths = paths;
        this.version = version;
    }

    private ContainerPartitionKeyArgs() {
        this.kind = Codegen.empty();
        this.paths = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPartitionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PartitionKind>> kind;
        private @Nullable Output<List<String>> paths;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPartitionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.paths = defaults.paths;
    	      this.version = defaults.version;
        }

        public Builder kind(@Nullable Output<Either<String,PartitionKind>> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable Either<String,PartitionKind> kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder paths(@Nullable Output<List<String>> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(@Nullable List<String> paths) {
            this.paths = Codegen.ofNullable(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ContainerPartitionKeyArgs build() {
            return new ContainerPartitionKeyArgs(kind, paths, version);
        }
    }
}
