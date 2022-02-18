// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a container image for starting a notebook instance with the environment installed in a container.
 * 
 */
public final class ContainerImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerImageArgs Empty = new ContainerImageArgs();

    /**
     * The path to the container image repository. For example: `gcr.io/{project_id}/{image_name}`
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

    public ContainerImageArgs(
        Input<String> repository,
        @Nullable Input<String> tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = tag;
    }

    private ContainerImageArgs() {
        this.repository = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> repository;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public ContainerImageArgs build() {
            return new ContainerImageArgs(repository, tag);
        }
    }
}
