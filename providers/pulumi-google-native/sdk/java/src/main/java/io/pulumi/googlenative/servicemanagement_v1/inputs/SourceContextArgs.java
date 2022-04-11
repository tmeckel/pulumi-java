// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `SourceContext` represents information about the source of a protobuf element, like the file in which it is defined.
 * 
 */
public final class SourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceContextArgs Empty = new SourceContextArgs();

    /**
     * The path-qualified name of the .proto file that contained the associated protobuf element. For example: `"google/protobuf/source_context.proto"`.
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<String> fileName;

    public Output<String> getFileName() {
        return this.fileName == null ? Codegen.empty() : this.fileName;
    }

    public SourceContextArgs(@Nullable Output<String> fileName) {
        this.fileName = fileName;
    }

    private SourceContextArgs() {
        this.fileName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fileName;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
        }

        public Builder fileName(@Nullable Output<String> fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder fileName(@Nullable String fileName) {
            this.fileName = Codegen.ofNullable(fileName);
            return this;
        }        public SourceContextArgs build() {
            return new SourceContextArgs(fileName);
        }
    }
}
