// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A lightweight description of a file.
 * 
 */
public final class ApigatewayApiConfigFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApigatewayApiConfigFileArgs Empty = new ApigatewayApiConfigFileArgs();

    /**
     * The bytes that constitute the file.
     * 
     */
    @Import(name="contents")
      private final @Nullable Output<String> contents;

    public Output<String> getContents() {
        return this.contents == null ? Codegen.empty() : this.contents;
    }

    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public ApigatewayApiConfigFileArgs(
        @Nullable Output<String> contents,
        @Nullable Output<String> path) {
        this.contents = contents;
        this.path = path;
    }

    private ApigatewayApiConfigFileArgs() {
        this.contents = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contents;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.path = defaults.path;
        }

        public Builder contents(@Nullable Output<String> contents) {
            this.contents = contents;
            return this;
        }
        public Builder contents(@Nullable String contents) {
            this.contents = Codegen.ofNullable(contents);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public ApigatewayApiConfigFileArgs build() {
            return new ApigatewayApiConfigFileArgs(contents, path);
        }
    }
}
