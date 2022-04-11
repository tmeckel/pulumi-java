// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Library/package information of a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final LibraryInfoArgs Empty = new LibraryInfoArgs();

    /**
     * Storage blob container name.
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * Name of the library.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Storage blob path of library.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Type of the library.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public LibraryInfoArgs(
        @Nullable Output<String> containerName,
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<String> type) {
        this.containerName = containerName;
        this.name = name;
        this.path = path;
        this.type = type;
    }

    private LibraryInfoArgs() {
        this.containerName = Codegen.empty();
        this.name = Codegen.empty();
        this.path = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public LibraryInfoArgs build() {
            return new LibraryInfoArgs(containerName, name, path, type);
        }
    }
}
