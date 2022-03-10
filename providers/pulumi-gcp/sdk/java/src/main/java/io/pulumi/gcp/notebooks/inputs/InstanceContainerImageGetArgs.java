// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="repository", required=true)
      private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public InstanceContainerImageGetArgs(
        Input<String> repository,
        @Nullable Input<String> tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = tag;
    }

    private InstanceContainerImageGetArgs() {
        this.repository = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceContainerImageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> repository;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceContainerImageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder repository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder repository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder tag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }
        public InstanceContainerImageGetArgs build() {
            return new InstanceContainerImageGetArgs(repository, tag);
        }
    }
}
