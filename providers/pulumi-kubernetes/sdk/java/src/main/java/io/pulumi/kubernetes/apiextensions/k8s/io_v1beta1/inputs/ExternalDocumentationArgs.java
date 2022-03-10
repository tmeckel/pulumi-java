// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExternalDocumentation allows referencing an external resource for extended documentation.
 * 
 */
public final class ExternalDocumentationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalDocumentationArgs Empty = new ExternalDocumentationArgs();

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public ExternalDocumentationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> url) {
        this.description = description;
        this.url = url;
    }

    private ExternalDocumentationArgs() {
        this.description = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDocumentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalDocumentationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.url = defaults.url;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public ExternalDocumentationArgs build() {
            return new ExternalDocumentationArgs(description, url);
        }
    }
}
