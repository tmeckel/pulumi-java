// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceContainerImageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceContainerImageGetArgs Empty = new InstanceContainerImageGetArgs();

    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    @Import(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> getRepository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    public InstanceContainerImageGetArgs(
        Output<String> repository,
        @Nullable Output<String> tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = tag;
    }

    private InstanceContainerImageGetArgs() {
        this.repository = Codegen.empty();
        this.tag = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceContainerImageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> repository;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceContainerImageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }        public InstanceContainerImageGetArgs build() {
            return new InstanceContainerImageGetArgs(repository, tag);
        }
    }
}
