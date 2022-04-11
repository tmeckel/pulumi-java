// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance operation error.
 * 
 */
public final class OperationErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationErrorArgs Empty = new OperationErrorArgs();

    /**
     * Identifies the specific error that occurred.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<String> code;

    public Output<String> getCode() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * This is always `sql#operationError`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Additional information about the error encountered.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    public OperationErrorArgs(
        @Nullable Output<String> code,
        @Nullable Output<String> kind,
        @Nullable Output<String> message) {
        this.code = code;
        this.kind = kind;
        this.message = message;
    }

    private OperationErrorArgs() {
        this.code = Codegen.empty();
        this.kind = Codegen.empty();
        this.message = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> code;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable Output<String> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable String code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }        public OperationErrorArgs build() {
            return new OperationErrorArgs(code, kind, message);
        }
    }
}
