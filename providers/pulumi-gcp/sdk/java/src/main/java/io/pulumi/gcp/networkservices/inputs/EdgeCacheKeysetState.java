// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheKeysetState extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheKeysetState Empty = new EdgeCacheKeysetState();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable Output<List<EdgeCacheKeysetPublicKeyGetArgs>> publicKeys;

    public Output<List<EdgeCacheKeysetPublicKeyGetArgs>> getPublicKeys() {
        return this.publicKeys == null ? Codegen.empty() : this.publicKeys;
    }

    public EdgeCacheKeysetState(
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<EdgeCacheKeysetPublicKeyGetArgs>> publicKeys) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.publicKeys = publicKeys;
    }

    private EdgeCacheKeysetState() {
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.publicKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheKeysetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<EdgeCacheKeysetPublicKeyGetArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheKeysetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder publicKeys(@Nullable Output<List<EdgeCacheKeysetPublicKeyGetArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(@Nullable List<EdgeCacheKeysetPublicKeyGetArgs> publicKeys) {
            this.publicKeys = Codegen.ofNullable(publicKeys);
            return this;
        }
        public Builder publicKeys(EdgeCacheKeysetPublicKeyGetArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public EdgeCacheKeysetState build() {
            return new EdgeCacheKeysetState(description, labels, name, project, publicKeys);
        }
    }
}
